// Locais fictícios para demonstrar o mapa. Não representam pontos oficiais.
const ecopontos = [
  {id:1,nome:"Ecoponto Centro",bairro:"Centro",lat:-3.1303,lng:-60.0233,status:"Disponível",capacidade:35,materiais:["Papel","Plástico","Vidro","Metal"]},
  {id:2,nome:"Ecoponto Adrianópolis",bairro:"Adrianópolis",lat:-3.1015,lng:-60.0105,status:"Atenção",capacidade:78,materiais:["Papel","Plástico","Metal","Eletrônicos"]},
  {id:3,nome:"Ecoponto São Raimundo",bairro:"São Raimundo",lat:-3.1168,lng:-60.0470,status:"Disponível",capacidade:42,materiais:["Papel","Plástico","Vidro","Óleo"]},
  {id:4,nome:"Ecoponto Parque 10",bairro:"Parque 10",lat:-3.0778,lng:-60.0148,status:"Capacidade alta",capacidade:91,materiais:["Plástico","Vidro","Metal","Volumosos"]},
  {id:5,nome:"Ecoponto Alvorada",bairro:"Alvorada",lat:-3.0850,lng:-60.0450,status:"Disponivel",capacidade:25,materiais:["Papel","Plástico","Vidro","Metal"]},
  {id:6,nome:"Ecoponto Uninorte",bairro:"Nossa Senhora das Graças",lat:-3.1190,lng:-60.0125,status:"Disponivel",capacidade:50,materiais:["Papel","Plastico",]}
];

let map;
let markers = [];
let selectedId = 1;

function renderList(items) {
  const list = document.getElementById("locationList");
  list.innerHTML = "";
  document.getElementById("resultCount").textContent = `${items.length} ${items.length === 1 ? "local" : "locais"}`;
  if (!items.length) {
    list.innerHTML = '<p class="map-note">Nenhum local encontrado com esse filtro.</p>';
    return;
  }
  items.forEach(point => {
    const button = document.createElement("button");
    button.className = `location-item ${point.id === selectedId ? "selected" : ""}`;
    button.innerHTML = `<strong>${point.nome}</strong><small>${point.bairro} · Capacidade: ${point.capacidade}%</small><span class="status ${point.capacidade >= 75 ? "warn" : ""}">${point.status}</span>`;
    button.addEventListener("click", () => selectPoint(point.id));
    list.appendChild(button);
  });
}

function selectPoint(id) {
  selectedId = id;
  const point = ecopontos.find(item => item.id === id);
  if (map && point) map.setView([point.lat, point.lng], 14);
  renderList(filteredPoints());
}

function filteredPoints() {
  const term = document.getElementById("searchInput").value.toLowerCase().trim();
  const material = document.getElementById("materialFilter").value;
  return ecopontos.filter(point => {
    const matchesText = point.nome.toLowerCase().includes(term) || point.bairro.toLowerCase().includes(term);
    const matchesMaterial = material === "Todos" || point.materiais.includes(material);
    return matchesText && matchesMaterial;
  });
}

function updateMapMarkers(items) {
  if (!map) return;
  markers.forEach(marker => map.removeLayer(marker));
  markers = [];
  items.forEach(point => {
    const marker = L.marker([point.lat, point.lng]).addTo(map);
    
marker.bindPopup(`
    <div style="min-width:180px">

        <h3>${point.nome}</h3>

        <p><strong>Bairro:</strong> ${point.bairro}</p>

        <p><strong>Status:</strong> ${point.status}</p>

        <p><strong>Capacidade:</strong> ${point.capacidade}%</p>

         <p><strong>Situação:</strong> ${getCapacityStatus(point.capacidade)}</p>
        <p><strong>Materiais aceitos:</strong></p>

        <p>${point.materiais.join(", ")}</p>

    </div>
`);

    marker.on("click", () => { selectedId = point.id; renderList(filteredPoints()); });
    markers.push(marker);
  });
}

function applyFilters() {
  const items = filteredPoints();
  renderList(items);
  updateMapMarkers(items);
}

function initializeMap() {
  if (typeof L === "undefined") {
    document.getElementById("map").innerHTML = '<p style="padding:25px">Não foi possível carregar o mapa. Verifique sua conexão com a internet.</p>';
    return;
  }
  map = L.map("map").setView([-3.110, -60.025], 12);
  L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png", {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>'
  }).addTo(map);
  updateMapMarkers(ecopontos);
  setTimeout(() => map.invalidateSize(), 200);
}

document.getElementById("searchInput").addEventListener("input", applyFilters);
document.getElementById("materialFilter").addEventListener("change", applyFilters);

// Painel administrativo
const overlay = document.getElementById("adminOverlay");
document.getElementById("openAdmin").addEventListener("click", () => {
  overlay.classList.add("show");
  overlay.setAttribute("aria-hidden", "false");
  document.body.style.overflow = "hidden";
});
function closeAdmin() {
  overlay.classList.remove("show");
  overlay.setAttribute("aria-hidden", "true");
  document.body.style.overflow = "";
}
function getCapacityStatus(percent) {
    if (percent >= 90) {
        return "Capacidade alta";
    } else if (percent >= 70) {
        return "Atenção";
    } else {
        return "Normal";
    }
}
document.getElementById("closeAdmin").addEventListener("click", closeAdmin);
overlay.addEventListener("click", event => { if (event.target === overlay) closeAdmin(); });
document.addEventListener("keydown", event => { if (event.key === "Escape") { closeAdmin(); closeSchedule(); } });

document.querySelectorAll(".side-link[data-scroll]").forEach(button => {
  button.addEventListener("click", () => {
    const target = document.getElementById(button.dataset.scroll);
    if (target) target.scrollIntoView({behavior:"smooth",block:"center"});
  });
});

document.getElementById("adminRows").innerHTML = ecopontos.map(point => `
  <tr><td>${point.nome}</td><td>${point.bairro}</td>
  <td><span class="capacity ${point.capacidade >= 75 ? "high" : ""}"><i style="width:${point.capacidade}%"></i></span>${point.capacidade}%</td>
  <td><span class="status ${point.capacidade >= 75 ? "warn" : ""}">${point.status}</span></td></tr>
`).join("");

// Agendamento demonstrativo
const scheduleModal = document.getElementById("scheduleModal");
function openSchedule() { scheduleModal.classList.add("show"); scheduleModal.setAttribute("aria-hidden","false"); }
function closeSchedule() { scheduleModal.classList.remove("show"); scheduleModal.setAttribute("aria-hidden","true"); }
document.getElementById("closeModal").addEventListener("click", closeSchedule);
scheduleModal.addEventListener("click", event => { if (event.target === scheduleModal) closeSchedule(); });
document.getElementById("scheduleForm").addEventListener("submit", event => {
  event.preventDefault();
  alert("Solicitação demonstrativa registrada na interface! Nenhum pedido real foi enviado.");
  event.target.reset();
  closeSchedule();
});

// Botão de agendamento acessível na interface do ponto selecionado
const scheduleButton = document.createElement("button");
scheduleButton.className = "primary-btn";
scheduleButton.textContent = "Agendar coleta de volumosos";
scheduleButton.style.cssText = "width:100%;justify-content:center;margin-top:12px;font-size:12px";
scheduleButton.addEventListener("click", openSchedule);
document.querySelector(".location-panel").appendChild(scheduleButton);

initializeMap();
renderList(ecopontos);
