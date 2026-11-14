//51
 fun main(){
     print("Digite o raio: ")
     val raio = readLine()!!.toDouble()
     
     val  perimetro = 2 * math.PI * raio 
     val area = math.PI * raio * raio
     print("Perímetro: $perimetro")
     print("Área: $area")
 }
 
 //52
 import kotlin.math.sqrt
 fun main(){
     print("Digite o valor do quadrado:")
     val lado = readLine()!!.toDouble()
     
     val perimetro = 4 * lado
     val area = lado * lado
     val diagonal = lado * sqrt(2.0)
     
        println("Perímetro: $perimetro")
        println("Área: $area")
        println("Diagonal: $diagonal")
    
 }
 // 53
 import kotlin.math.sqrt
 fun main(){
     println("Digite a base:")
     val a = readLine()!!.toDouble()
     println("Digite a altura:")
     val b = readLine()!!.toDouble()
     println("Digite a profundidade:")
        val c = readLine()!!.toDouble()
         val diagonal = sqrt(a * a + b * b + c * c)
         println("Diagonal: $diagonal")
    }
    
    // 54
    fun main(){
       println("Digite a base:")
       val base = readLine()!!.toDouble()
         println("Digite a altura:")
       val altura = readLine()!!.toDouble()
       val area = (base * altura) / 2
       println("Área do triângulo: $area")
    
    }
    
    //55
    fun main(){
       println("Digite a diagonal maior:") 
       val diagonalMaior = readLine()!!.toDouble()
         println("Digite a diagonal menor:")
       val diagonalMenor = readLine()!!.toDouble()
       val area = (diagonalMaior * diagonalMenor) / 2
            println("Área do losango: $area")
    }
    
    //56
    fun main(){
        println("Digite seu nome:")
        val nome = readLine()!!
        
        println("Digite sua Idade:")
        val idade = readLine()!!.toInt()
        println("Nome: $nome")
        println("Idade: $idade")
     }
     
 //57
     import kotlin.math.roundToInt
     fun main(){
         println("Digite a primeira nota:")
         val pr1 = readLine()!!.toDouble()
            println("Digite a segunda nota:")
            val pr2 = readLine()!!.toDouble()
            val media = (pr1 + pr2) / 2
            
            val truncada = media.toInt()
            val arredondada = media.roundToInt()
            
            println(" Média truncada: $truncada")
            println(" Média arredondada: $arredondada")
            }
            
//58
import kotlin.math.ln
fun main(){
    println("Digite o primeiro valor:")
    val xnum1= readLine()!!.toDouble()
    
    println("Digite o segundo valor:")
    val xnum2= readLine()!!.toDouble()
    
    println("Digite o terceiro valor:")
    val xnum3= readLine()!!.toDouble()
    
    val x = xnum1 +
            xnum2 / (xnum3 + xnum1) +
                2 * (xnum1 - xnum2) +
                    ln(64.0) / ln(2.0)
    println("Valor de x: $x")                
    }
    
 //59
 impoert kotlin.math.sqrt
 fun main(){
     println("Digite o primeiro cateto:")
     val b = readLine()!!.toDouble()
     
    println("Digite o segundo cateto:")
    val c = readLine()!!.toDouble()
    
    val hipotenusa = sqrt(b * b + c * c)
    println(" A Hipotenusa é: $hipotenusa")
    }
    

    //60   

fun main(){
    println("Digite o primeiro termo:")
    val termo = readLine()!!.toDouble()
    
    println("Digite a razão:")
    val razao = readLine()!!.toDouble()
    
    val decimo = termo + 9 * razao
    println("O décimo termo da PA é: $decimo")
    }
    
    //61 
    fun main(){
        println("Digite o primeiro termo:")
        val termo = readLine()!!.toDouble()
        
        println(""Digite a razão:")
        val razao = readLine()!!.toDouble()
        
        val quinto = termo * razao * razao * razao * razao
        println("O quinto termo da PG é: $quinto")
        }
    
 //62
    
    fun main(){
        println("Digite o preco do produto:")
        val preco = readLine()!!.toDouble()
        
        val novoPreco = preco * 0.91
        
        println("Preço com desconto: R$novoPreco")
        
        }
        
//63 
fun main(){
    println("Digite o numero de aulas:")
    val aulas= readLine()!!.toInt()
    
    print("Digite o valor da hora-aula:")
    val valorAula = readLine()!!.toDouble()

    println("Digite o percentual do desconto:")
    val desconto = readLine()!!.to Double()
    
    val salarioBruto = aulas * valorAula
    val totalDesconto = (desconto / 100) * salarioBruto
    val salarioLiquido = salarioBruto - totalDesconto
    
    println("Salário liquido: R$ $salarioLiquido") 
    
} 

//64

fun main(){
    println("Digite a temperatura em Celsius:")
    val c = readLine()!!.toDouble()
    
    val f = (9 * c + 160) / 5
    
    println("Temperatura em Fahrenheit: $f")
}

//65
fun main() {
    print("Digite a altura da lata: ")
    val altura = readLine()!!.toDouble()

    print("Digite o raio da lata: ")
    val raio = readLine()!!.toDouble()

    val volume = Math.PI * raio * raio * altura

    println("Volume da lata: $volume")
}
    

// 66
fun main() {
    print("Digite o tempo gasto na viagem: ")
    val tempo = readLine()!!.toDouble()

    print("Digite a velocidade média: ")
    val velocidade = readLine()!!.toDouble()

    val distancia = tempo * velocidade

    val litros = distancia / 12

    println("Velocidade média: $velocidade km/h")
    println("Tempo gasto: $tempo horas")
    println("Distância percorrida: $distancia km")
    println("Litros utilizados: $litros")
}

//67
fun main() {
    print("Digite o valor da prestação: ")
    val valor = readLine()!!.toDouble()

    print("Digite a taxa de juros: ")
    val taxa = readLine()!!.toDouble()

    print("Digite o tempo de atraso em meses: ")
    val tempo = readLine()!!.toInt()

    val prestacao = valor + (valor * (taxa / 100) * tempo)

    println("Valor da prestação em atraso: R$ $prestacao")
}

//68
fun main() {
    print("Digite o primeiro número: ")
    var a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    var b = readLine()!!.toDouble()

    val aux = a

    a = b

    b = aux

    println("Valor de A: $a")
    println("Valor de B: $b")
}

//69
fun main() {
    print("Digite o numerador: ")
    val num = readLine()!!.toInt()

    print("Digite o denominador: ")
    val denom = readLine()!!.toInt()

    if (denom != 0) {
        val decimal = num.toDouble() / denom

        println("Resultado decimal: $decimal")
    } else {
        println("Não é possível dividir por zero!")
    }
}
//70
fun main() {
    print("Digite o valor da conta: ")
    val conta = readLine()!!.toDouble()

    val total = conta * 1.10

    println("Valor total com gorjeta: R$ $total")
}

//71
fun main() {
    print("Digite a hora atual: ")
    val hora = readLine()!!.toInt()

    print("Digite os minutos: ")
    val minuto = readLine()!!.toInt()

    val totalMinutos = hora * 60 + minuto

    println("Já se passaram $totalMinutos minutos desde o início do dia.")
}

//72
fun main() {
    print("Digite o valor do depósito: ")
    val deposito = readLine()!!.toDouble()

    print("Digite a taxa de juros (%): ")
    val taxa = readLine()!!.toDouble()

    val rendimento = deposito * taxa / 100

    val total = deposito + rendimento

    println("Rendimento: R$ $rendimento")
    println("Valor total: R$ $total")
}

//73
import kotlin.math.roundToInt

fun main() {
    print("Digite um número decimal: ")
    val num = readLine()!!.toDouble()

    val numInteiro = num.toInt()

    val numFracionario = num - numInteiro

    val numArredondado = num.roundToInt()

    println("Parte inteira: $numInteiro")
    println("Parte fracionária: $numFracionario")
    println("Número arredondado: $numArredondado")
}

//74
fun main() {
    print("Digite o valor do salário mínimo: ")
    val salarioMinimo = readLine()!!.toDouble()

    print("Digite o salário da pessoa: ")
    val salarioPessoa = readLine()!!.toDouble()

    val quantidade = salarioPessoa / salarioMinimo

    println("A pessoa ganha $quantidade salários mínimos.")
}

//75
fun main() {
    print("Digite seu peso em kg: ")
    val peso = readLine()!!.toInt()

    val pesoGramas = peso * 1000

    val novoPeso = pesoGramas * 1.12

    println("Peso em gramas: $pesoGramas")
    println("Novo peso com aumento de 12%: $novoPeso")
}

//76
fun main() {
    print("Digite um número entre 0 e 60: ")
    val num = readLine()!!.toInt()

    val sucessor = (num + 1) % 61

    println("Sucessor: $sucessor")
}

//77
fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    val d = (a - b) * (a - b)

    val q = (a * a) - (b * b)

    println("Quadrado da diferença: $d")
    println("Diferença dos quadrados: $q")
}

//78
fun main() {
    print("Digite a quantidade de lados do polígono: ")
    val n = readLine()!!.toInt()

    val diagonais = n * (n - 3) / 2.0

    println("Quantidade de diagonais: $diagonais")
}

//79
import kotlin.math.pow

fun main() {
    print("Digite o valor da aplicação mensal: ")
    val p = readLine()!!.toDouble()

    print("Digite a taxa de juros (%): ")
    val taxa = readLine()!!.toDouble()

    print("Digite a quantidade de meses: ")
    val n = readLine()!!.toInt()

    val i = taxa / 100

    val acumulado = if (i != 0.0) {
        p * ((1 + i).pow(n) - 1) / i
    } else {
        p * n
    }

    println("Valor acumulado: R$ $acumulado")
}

//80
fun main() {
    print("Digite a quantidade de fitas: ")
    val fitas = readLine()!!.toInt()

    print("Digite o valor de cada aluguel: ")
    val valorAluguel = readLine()!!.toDouble()

    // Quantidade de fitas alugadas por mês
    val alugadas = fitas / 3.0

    // Faturamento anual
    val faturamento = alugadas * valorAluguel * 12

    // Quantidade de fitas devolvidas com atraso
    val atrasadas = alugadas / 10

    // Valor das multas mensais
    val multas = atrasadas * valorAluguel * 0.10

    // Fitas estragadas durante o ano
    val estragadas = fitas * 0.02

    // Fitas compradas para reposição
    val reposicao = fitas / 10.0

    // Quantidade final de fitas
    val totalFinal = fitas - estragadas + reposicao

    println("Faturamento anual: R$ $faturamento")
    println("Multas por mês: R$ $multas")
    println("Quantidade final de fitas: $totalFinal")
}


       
            