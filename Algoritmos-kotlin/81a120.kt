//81
fun main() {
    print("Digite a conta de três dígitos: ")
    val conta = readLine()!!.toInt()

    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = conta % 10

    val inverso = d3 * 100 + d2 * 10 + d1
    val soma = conta + inverso

    val n1 = (soma / 100) * 1
    val n2 = ((soma % 100) / 10) * 2
    val n3 = (soma % 10) * 3

    val digito = (n1 + n2 + n3) % 10

    println("Dígito verificador: $digito")
}

//82

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 20) {
        println("Metade: ${numero / 2}")
    }
}

//83

import kotlin.math.abs

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 0) {
        println("Inverso: ${1 / numero}")
    } else {
        println("Valor absoluto: ${abs(numero)}")
    }
}

//84

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("PAR")
    } else {
        println("ÍMPAR")
    }
}

//85

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    val c = readLine()!!.toDouble()

    val maior = if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }

    println("Maior número: $maior")
}

//86

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 0) {
        println("POSITIVO")
    } else if (numero < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

//87

fun main() {
    print("Qual é a capital do Brasil? ")
    val resposta = readLine()!!.trim()

    if (resposta == "Brasília" || resposta == "BRASÍLIA") {
        println("PARABÉNS!")
    } else if (
        resposta.equals("brasília", ignoreCase = true) ||
        resposta.equals("brazília", ignoreCase = true)
    ) {
        println("CERTO! Mas atenção à grafia: Brasília.")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

//88

fun main() {
    println("***** CALCULADORA *****")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")

    print("Digite a opção: ")
    val opcao = readLine()!!

    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    when (opcao) {
        "+" -> println("Soma: ${a + b}")
        "-" -> println("Subtração: ${a - b}")
        "*" -> println("Multiplicação: ${a * b}")
        "/" -> {
            if (b != 0.0) {
                println("Divisão: ${a / b}")
            } else {
                println("Não é possível dividir por zero!")
            }
        }
        else -> println("Opção não disponível!")
    }
}

//89

fun main() {
    println("Escolha um planeta:")
    println("1 - Mercúrio")
    println("2 - Vênus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")

    print("Digite a opção: ")
    val opcao = readLine()!!.toInt()

    print("Digite seu peso na Terra: ")
    val pesoTerra = readLine()!!.toDouble()

    val gravidade = when (opcao) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> 0.0
    }

    if (gravidade != 0.0) {
        val pesoPlaneta = (pesoTerra / 10) * gravidade
        println("Peso no planeta: $pesoPlaneta")
    } else {
        println("Este planeta não pode ser analisado!")
    }
}

//90

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 20) {
        println("Número: $numero")
    }
}

//91

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    val soma = num1 + num2

    if (soma > 10) {
        println("Soma: $soma")
    }
}

//92

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toDouble()

    val soma = num1 + num2

    if (soma > 20) {
        println("Resultado: ${soma + 8}")
    } else {
        println("Resultado: ${soma - 5}")
    }
}

//93

import kotlin.math.sqrt

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 0) {
        println("Raiz quadrada: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("Quadrado: ${numero * numero}")
    } else {
        println("O número é zero.")
    }
}

//94

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 3 == 0) {
        println("É múltiplo de 3")
    } else {
        println("Não é múltiplo de 3")
    }
}

//95

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 5 == 0) {
        println("É divisível por 5")
    } else {
        println("Não é divisível por 5")
    }
}

//96

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 3 == 0 && numero % 7 == 0) {
        println("É divisível por 3 e por 7")
    } else {
        println("Não é divisível por 3 e por 7")
    }
}


//97

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toInt()

    if (numero % 10 == 0) {
        println("Múltiplo de 10")
    } else if (numero % 2 == 0) {
        println("Múltiplo de 2")
    } else if (numero % 5 == 0) {
        println("Múltiplo de 5")
    } else {
        println("Não é múltiplo de 2 nem de 5")
    }
}


//98

fun main() {
    print("Digite o salário bruto: ")
    val salario = readLine()!!.toDouble()

    print("Digite o valor da prestação: ")
    val prestacao = readLine()!!.toDouble()

    if (prestacao <= salario * 0.30) {
        println("Empréstimo concedido")
    } else {
        println("Empréstimo negado")
    }
}

//99

fun main() {
    print("Digite um número de três algarismos: ")
    val numero = readLine()!!.toInt()

    val centena = numero / 100

    if (centena % 2 == 0) {
        println("O algarismo das centenas é par: $centena")
    } else {
        println("O algarismo das centenas é ímpar: $centena")
    }
}

//100

fun main() {
    print("Digite um número de quatro algarismos: ")
    val numero = readLine()!!.toInt()

    val resultado = numero / 100

    if (resultado % 4 == 0) {
        println("O número é múltiplo de 4: $resultado")
    } else {
        println("O número não é múltiplo de 4: $resultado")
    }
}
//101

fun main() {
    print("Digite um número: ")
    val num = readLine()!!.toDouble()

    if (num > 20 && num < 90) {
        println("O número está na faixa de 20 a 90")
    } else {
        println("O número está fora da faixa de 20 a 90")
    }
}

//102

fun main() {
    print("Digite um número: ")
    val numero = readLine()!!.toDouble()

    if (numero > 20) {
        println("Maior que 20")
    } else if (numero < 20) {
        println("Menor que 20")
    } else {
        println("Igual a 20")
    }
}

//103

fun main() {
    print("Digite o ano atual: ")
    val anoAtual = readLine()!!.toInt()

    print("Digite o ano de nascimento: ")
    val anoNascimento = readLine()!!.toInt()

    if (anoNascimento > anoAtual) {
        println("Ano de nascimento inválido")
    } else {
        val idade = anoAtual - anoNascimento
        println("Idade: $idade anos")
    }
}

//104

fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!

    print("Digite seu sexo (F ou M): ")
    val sexo = readLine()!!

    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}

//105


fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readLine()!!.uppercase()

    if (sigla == "RJ") {
        println("Carioca")
    } else if (sigla == "SP") {
        println("Paulista")
    } else if (sigla == "MG") {
        println("Mineiro")
    } else {
        println("Outros estados")
    }
}

//106


fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!

    val letra = nome.firstOrNull()

    if (letra == 'A' || letra == 'a') {
        println(nome)
    }
}


//107

fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!.trim()

    val prenome = nome.substringBefore(" ")

    if (prenome.equals("JOSÉ", ignoreCase = true)) {
        println(nome)
    }
}

//108

fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!.trim()

    val prenome = nome.substringBefore(" ")

    if (prenome.equals("JOSÉ", ignoreCase = true)) {
        println(nome)
    }
}

//109

fun main() {
    print("Digite o primeiro nome: ")
    val nome1 = readLine()!!

    print("Digite o segundo nome: ")
    val nome2 = readLine()!!

    if (nome1.compareTo(nome2, ignoreCase = true) < 0) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}


//110

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    if (a == b) {
        println("Iguais")
    } else {
        println("Diferentes")
    }
}

//111

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    if (a > b) {
        println("Maior: $a")
    } else {
        println("Maior: $b")
    }
}

//112

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    if (a < b) {
        println("Menor: $a")
    } else {
        println("Menor: $b")
    }
}

//113

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    if (a < b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

//114

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}

//115

import kotlin.math.sqrt

fun main() {
    print("Digite o valor de x: ")
    val x = readLine()!!.toDouble()

    print("Digite o valor de y: ")
    val y = readLine()!!.toDouble()

    if (x > y) {
        println("Raiz do maior: ${if (x >= 0) sqrt(x) else "Não existe raiz real"}")
        println("Quadrado do menor: ${y * y}")
    } else if (y > x) {
        println("Raiz do maior: ${if (y >= 0) sqrt(y) else "Não existe raiz real"}")
        println("Quadrado do menor: ${x * x}")
    } else {
        println("Números iguais")
    }
}

//116

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    val c = readLine()!!.toDouble()

    if (a > b && a > c) {
        println("Maior: $a")
    } else if (b > c) {
        println("Maior: $b")
    } else {
        println("Maior: $c")
    }
}


//117

fun main() {
    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    val c = readLine()!!.toDouble()

    var maior = a

    if (b > maior) {
        maior = b
    }

    if (c > maior) {
        maior = c
    }

    println("Maior: $maior")
}

//118

fun main() {
    print("Digite o primeiro número: ")
    var a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    var b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    var c = readLine()!!.toDouble()

    var aux: Double

    if (a > b) {
        aux = a
        a = b
        b = aux
    }

    if (a > c) {
        aux = a
        a = c
        c = aux
    }

    if (b > c) {
        aux = b
        b = c
        c = aux
    }

    println("Ordem crescente: $a $b $c")
}

//119

fun main() {
    print("Digite o primeiro número: ")
    var a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    var b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    var c = readLine()!!.toDouble()

    var aux: Double

    if (a < b) {
        aux = a
        a = b
        b = aux
    }

    if (a < c) {
        aux = a
        a = c
        c = aux
    }

    if (b < c) {
        aux = b
        b = c
        c = aux
    }

    println("Ordem decrescente: $a $b $c")
}


//120

fun main() {
    print("Digite o primeiro número: ")
    var a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    var b = readLine()!!.toDouble()

    print("Digite o terceiro número: ")
    var c = readLine()!!.toDouble()

    var aux: Double

    if (a > b) {
        aux = a
        a = b
        b = aux
    }

    if (a > c) {
        aux = a
        a = c
        c = aux
    }

    if (b > c) {
        aux = b
        b = c
        c = aux
    }

    val menor = a
    val intermediario = b
    val maior = c

    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}


