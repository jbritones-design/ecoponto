//25
fun main(){
println("Digite data no formato ddmmaa:")
val data = readLine()!!.toInt()
val dia = data / 10000
val mes = (data % 10000) / 100
val ano = data % 100
println("Dia: $dia")
println("Mês: $mes")
println("Ano: $ano")


}
//26
fun main(){
println("Digite data no formato DDMMAA:") 
val data= readLine()!!.toInt()
val dia = data / 10000
val mes = (data % 10000) / 100
val ano = data % 100
val novaData=mes*10000+dia*100+ano
println("Data no formato MMDDAA: $novaData")
}


//27
fun main(){
var x=2
var y=5

println("x=$x")
x++
println("y=$y")
y--
println("Novo valor de x: $x")
println("Novo valor de y: $y")
}

//28
fun main(){
println(" É preciso fazer totos os algoritimos para aprender")
}


//29
fun main(){
println("Seu Nome")
}


//30
fun main(){
val produto=28*43
println("O produto entre os dois é:$produto")
}

//31
fun main(){
val media=(8+9+7)/3.0
println("A média aritmética é: $media")
}


//32

fun main(){
println("Digite um numero inteiro")
val numero 1 = readLine()!!.toInt()
println("Numero:$numero1")
}

//33
fun main(){
println("Digite  o primeiro numero :")
val numero 1 = readLine()!!.toInt()
println("Digite  o segundo numero :")
val numero 2 = readLine()!!.toInt()
println("numero 1:$numero1")
println("numero 2:$numero2")
}

//34
fun main(){
println("Digite um numero inteiro:")
val numero = readLine()!!.toInt()
val antecessor = numero - 1
val sucessor = numero + 1
println("Sucessor: $sucessor")
println("Antecessor: $antecessor")
}

//35
fun main(){
println("Digite seu nome")
val nome = readLine()!!
printlv("Digite seu endereço")
val endereco = readLine()!!
println("Digite seu telefone")
val telefone = readLine()!!

println("\nNome: $nome")
println("Endereço: $endereco")
println("Telefone: $telefone")
}

//36
fun main(){
println("Digite o primeiro numero:")
val numero1 = readLine()!!.toInt()
println("Digite o segundo numero:")
val numero 2 = readLine()!!.toInt()
val soma = numero1 + numero2
println("Soma: $soma")
}

//37
fun main(){
println("Digite o primeiro numero:")
val numero1 = readLine()!!.toInt()
println("Digite o segundo numero:")
val numero2 = readLine()!!.toInt()
val produto = numero1 * numero2
println("Produto: $produto")
}


//38
fun main(){
println("Digite um numero real:")
val numero = readLine()!!.toDouble()
val tercaParte = numero / 3.0
println("A terça Parte é: $tercaParte")
}

//39
fun main(){
println("Digite a primeira nota:")
val nota1 = readLine()!!.toDouble()
println("Digite a segunda nota:")
val nota2 = readLine()!!.toDouble()
val media = (nota1 + nota2) / 2.0
println(" média : $media")
}

//40
fun main(){
 println("Digite o dividendo:")
val dividendo = readLine()!!.toInt()
println("Digite o divisor:")
val divisor = readLine()!!.toInt()
if (divisor !=0){
val quociente = dividendo / divisor
val resto = dividendo % divisor
println("Dividendo: $dividendo")
println("Divisor: $divisor")
println("Quociente: $quociente")
println("Resto: $resto")
}else{
println("Não é possivel dividir por zero.")
}
}


//41
fun main(){
println("Digite o primeiro numero:")
val a = readLine()!!.toDouble()
println("Digite o segundo numero:")
val b = readLine()!!.toDouble()
println("Digite o terceiro numero:")
val c = readLine()!!.toDouble()
println("Digite o quarto numero:")
val d = readLine()!!.toDouble()

val mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
println("Média Ponderada: $mediaPonderada")
}


//42

import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.abs

fun main(){
println("Digite um ângulo em graus:")
val angulo = readLine()!!.toDouble()

val radianos= angulo * PI / 180.0
val seno = sin(radianos)    
val cosseno = cos(radianos)
val tangente = tan(radianos) 
println("Seno: $seno")
println("Cosseno: $cosseno")
println("Tangente: $tangente")
if (abs(seno) > 1e-10) {
println("Cossecante:${1.0/seno}")
println("cotangente:${cosseno/seno}")

}else{
println("Cossecante e tangente: não definidas para este ângulo.")
}
if (abs(cosseno) > 1e-10) {
println("Secante:${1.0/cosseno}")
}else{
println("Secante: não definida para este ângulo.")
}
}

//43
import kotlin.math.ln

fun main(){
println("Digite o logaritimando:")
val numero = readLine()!!.toDouble()
if (numero > 0){
val logaritmo = ln(numero)/ln(10.0)
println("Logaritmo na base 10: $logaritmo")
}else{
println(" O logaritmando deve ser maior que zero:")
}
}

//44
import kotlin.math.ln

fun main(){
print("Digite o logaritimando:")
val numero = readLine()!!.toDouble()
print("Digite a base:")
val base = readLine()!!.toDouble()

if (numero > 0 && base > 0 && base!=1.0){ 
val logaritmo = ln(numero)/ln(base)
println(" Logaritmo de $numero na base $base: $logaritmo")
}else{
println(" Use um Logaritmando positivo e uma base positiva deferente de 1.")
}
}

//45

import kotlin.math.sqrt

fun main(){
print("Digite um numero:")
val numero = readLine()!!.toDouble()
val quadrado= numero*numero
println(" Numero:$numero")
println(" Quadrado:$quadrado")
if (numero >= 0){
println(" Raiz quadrada:${sqrt(numero)}")
}else{
println("Raiz quadrada real não existe para numero negativo.")
}
} 

//46
fun main(){
println(" Digite o saldo da aplicação:")
val saldo = readLine()!!.toDouble()

val novoSaldo= saldo * 1.01
println(" Novo saldo: $novoSaldo") 
}

//47
fun main(){
println("Digite um  numero de tres algarismos:)
val numero = readLine()!!.toInt()

val centena = numero / 100
val dezena = (numero % 100) / 10
val unidade = numero % 10

val invertido = unidade * 100 + dezena * 10 + centena
println("Numero: $numero")
println("Invertido: $invertido")
}

//48
fun main(){
println(" Digite o valor do salario Minimo:")
val salarioMinimo = readLine()!!.toDouble()

println("Digite a quantidade de Kw consumida:")
val quantidade = readLine()!!.toDouble()
val precoPorkw=SalarioMinimo/700.0
val valorPagar=precoPorkw*quantidade
val valorComDesconto=valorPagar*0.90

println("Preço por Kw: R$ $precoPorkw")
println("Valor a ser Pago: R$ $valorPagar")
println("Valor com Desconto:R$ $valorComDesconto") 

}

//49
fun main(){
println("Digite um nome:")
val nome = readLine()!!

if(nome.isNotEmpty()){
println("Todo nome:$nome")
println("Primeiro caractere:${nome.first()}")
println("Último caractere:${nome.last()}")

println("Do primeiro ao terceiro:${nometake(3)}")

if(nome.length >= 4){ 
println("Quarto caractere:${nome[3]}")
}else{
println("Quarto caractere: não existe")
}

println("Todos menos o primeiro:${nome.drop(1)}")

if (nome.length >= 2){
println(" Os dois ultimos:${nome.takeLast(2)}")
}else{
println(" Os dois ultimos: nome muito curto")
}
}else{
println("Nenhum nome foi Digitado")
}
}

//50
import kotlin.math.sqrt
fun main(){
print("Digite a base:")
val base = readLine()!!.toDouble()
print("Digite a altura:")
val altura = readLine()!!.toDouble()
if(base > 0 && altura > 0){
val perimetro = 2 * (base + altura)
val area = base * altura
val diagonal = sqrt(base * base + altura * altura)

println("Perímetro: $perimetro")
println("Área: $area")
println("Diagonal: $diagonal")
}else{
println("Base e altura devem ser maiores que zero.")
}
}




