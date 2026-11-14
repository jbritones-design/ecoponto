
//121
fun main() {
    print("Digite o 1º número: ")
    val n1 = readLine()!!.toInt()

    print("Digite o 2º número: ")
    val n2 = readLine()!!.toInt()

    print("Digite o 3º número: ")
    val n3 = readLine()!!.toInt()

    print("Digite o 4º número: ")
    val n4 = readLine()!!.toInt()

    print("Digite o 5º número: ")
    val n5 = readLine()!!.toInt()

    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 &&
        n2 != n3 && n2 != n4 && n2 != n5 &&
        n3 != n4 && n3 != n5 && n4 != n5) {

        var maior = n1
        var menor = n1

        if (n2 > maior) maior = n2
        if (n3 > maior) maior = n3
        if (n4 > maior) maior = n4
        if (n5 > maior) maior = n5

        if (n2 < menor) menor = n2
        if (n3 < menor) menor = n3
        if (n4 < menor) menor = n4
        if (n5 < menor) menor = n5

        println("Maior: $maior")
        println("Menor: $menor")
    } else {
        println("Os valores devem ser diferentes.")
    }
}

//122
fun main() {
    print("Digite o primeiro lado: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo lado: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro lado: ")
    val c = readLine()!!.toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("Podem ser lados de um triângulo.")
    } else {
        println("Não podem ser lados de um triângulo.")
    }
}

// 123
fun main() {
    print("Digite o primeiro lado: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo lado: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro lado: ")
    val c = readLine()!!.toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && b == c) {
            println("Triângulo equilátero.")
        } else if (a == b || a == c || b == c) {
            println("Triângulo isósceles.")
        } else {
            println("Triângulo escaleno.")
        }
    } else {
        println("As medidas não formam um triângulo.")
    }
}

//124
fun main() {
    print("Digite o primeiro lado: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo lado: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro lado: ")
    val c = readLine()!!.toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        val maior: Double
        val soma: Double

        if (a >= b && a >= c) {
            maior = a * a
            soma = b * b + c * c
        } else if (b >= a && b >= c) {
            maior = b * b
            soma = a * a + c * c
        } else {
            maior = c * c
            soma = a * a + b * b
        }

        if (maior == soma) {
            println("Triângulo retângulo.")
        } else if (maior > soma) {
            println("Triângulo obtusângulo.")
        } else {
            println("Triângulo acutângulo.")
        }
    } else {
        println("As medidas não formam um triângulo.")
    }
}
//125
fun main() {
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    if (idade >= 65) {
        println("Maior de 65 anos.")
    } else if (idade >= 18) {
        println("Maior de idade.")
    } else {
        println("Menor de idade.")
    }
}

//126
fun main() {
    print("Digite um valor: ")
    val x = readLine()!!.toDouble()

    if (x == 5.0) {
        println("O número é 5.")
    } else if (x == 200.0) {
        println("O número é 200.")
    } else if (x == 400.0) {
        println("O número é 400.")
    } else if (x >= 500 && x <= 1000) {
        println("Intervalo entre 500 e 1000.")
    } else {
        println("Fora dos escopos anteriores.")
    }
}

// 127
fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine()!!

    print("Digite a nota da PR1: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a nota da PR2: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2

    println("Aluno: $nome")
    println("PR1: $nota1")
    println("PR2: $nota2")
    println("Média: $media")

    if (media >= 7) {
        println("Aprovado.")
    } else if (media < 3) {
        println("Reprovado.")
    } else {
        println("Em prova final.")
    }
}

//128
fun main() {
    print("Digite um verbo: ")
    val verbo = readLine()!!.trim().lowercase()

    if (verbo.endsWith("ar")) {
        println("Verbo da 1ª conjugação.")
    } else if (verbo.endsWith("er") || verbo.endsWith("or")) {
        println("Verbo da 2ª conjugação.")
    } else if (verbo.endsWith("ir")) {
        println("Verbo da 3ª conjugação.")
    } else {
        println("Não está no infinitivo ou possui terminação não prevista.")
    }
}

//129
fun main() {
    print("Digite o salário: ")
    val salario = readLine()!!.toDouble()

    val desconto = if (salario <= 600) {
        0.0
    } else if (salario <= 1200) {
        salario * 0.20
    } else if (salario <= 2000) {
        salario * 0.25
    } else {
        salario * 0.30
    }

    println("Desconto: R$ %.2f".format(desconto))
}

//130
fun main() {
    print("Digite o valor de compra: ")
    val valor = readLine()!!.toDouble()

    val venda = if (valor < 20) {
        valor * 1.45
    } else {
        valor * 1.30
    }

    println("Valor de venda: R$ %.2f".format(venda))
}
//131
fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine()!!.trim()

    val letra = nome.firstOrNull()?.uppercaseChar()

    when (letra) {
        in 'A'..'K' -> println("$nome - Sala 101")
        in 'L'..'N' -> println("$nome - Sala 102")
        in 'O'..'Z' -> println("$nome - Sala 103")
        else -> println("Nome inválido.")
    }
}

//132
fun main() {
    print("Digite o valor em reais: ")
    val reais = readLine()!!.toDouble()

    println("Escolha a moeda:")
    println("F - Franco suíço")
    println("L - Libra esterlina")
    println("D - Dólar")
    println("M - Marco alemão")

    val moeda = readLine()!!.uppercase()

    print("Digite o valor de uma unidade da moeda em reais: ")
    val cotacao = readLine()!!.toDouble()

    if (cotacao <= 0) {
        println("Cotação inválida.")
    } else {
        val resultado = reais / cotacao

        when (moeda) {
            "F" -> println("Total de francos suíços: %.2f".format(resultado))
            "L" -> println("Total de libras esterlinas: %.2f".format(resultado))
            "D" -> println("Total de dólares: %.2f".format(resultado))
            "M" -> println("Total de marcos alemães: %.2f".format(resultado))
            else -> println("Moeda desconhecida.")
        }
    }
}

//133
fun main() {
    print("Digite sua altura em metros: ")
    val altura = readLine()!!.toDouble()

    print("Digite o sexo (M/F): ")
    val sexo = readLine()!!.uppercase()

    val peso = if (sexo == "M") {
        (72.7 * altura) - 58
    } else if (sexo == "F") {
        (62.1 * altura) - 44.7
    } else {
        println("Sexo inválido.")
        return
    }

    println("Peso ideal calculado: %.2f kg".format(peso))
}

//134
fun main() {
    print("Digite a idade do nadador: ")
    val idade = readLine()!!.toInt()

    when {
        idade < 5 -> println("Não existe categoria para essa idade.")
        idade <= 7 -> println("Categoria Infantil A.")
        idade <= 10 -> println("Categoria Infantil B.")
        idade <= 13 -> println("Categoria Juvenil A.")
        idade <= 17 -> println("Categoria Juvenil B.")
        else -> println("Categoria Sênior.")
    }
}

//135
fun main() {
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()

    when {
        idade < 16 -> println("Não eleitor.")
        idade < 18 -> println("Eleitor facultativo.")
        idade <= 65 -> println("Eleitor obrigatório.")
        else -> println("Eleitor facultativo.")
    }
}
//136
fun main() {
    print("Digite o nome: ")
    val nome = readLine()!!

    print("Digite a idade: ")
    val idade = readLine()!!.toInt()

    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }

    println("$nome pagará R$ %.2f".format(valor))
}

//137
import kotlin.math.sqrt

fun main() {
    print("Digite o valor de a: ")
    val a = readLine()!!.toDouble()

    print("Digite o valor de b: ")
    val b = readLine()!!.toDouble()

    print("Digite o valor de c: ")
    val c = readLine()!!.toDouble()

    if (a == 0.0) {
        println("Não é equação do segundo grau.")
    } else {
        val delta = b * b - 4 * a * c

        if (delta >= 0) {
            val raizDelta = sqrt(delta)

            val x1 = (-b + raizDelta) / (2 * a)
            val x2 = (-b - raizDelta) / (2 * a)

            println("X1 = $x1")
            println("X2 = $x2")
        } else {
            println("Não há raízes reais.")
        }
    }
}

//138
fun main() {
    print("Digite um número de 1 a 12: ")
    val num = readLine()!!.toInt()

    when (num) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Não existe mês correspondente a esse número.")
    }
}
//139
fun main() {
    print("Digite o nome do município: ")
    val nome = readLine()!!

    print("Digite o número de eleitores aptos: ")
    val eleitores = readLine()!!.toInt()

    print("Digite os votos do candidato mais votado: ")
    val votos = readLine()!!.toInt()

    if (eleitores > 20000 && votos <= eleitores / 2) {
        println("$nome terá segundo turno.")
    } else {
        println("$nome não terá segundo turno.")
    }
}

//140
fun main() {
    print("Digite seu nome: ")
    val nome = readLine()!!.trim()

    print("Digite o valor da conta: ")
    val conta = readLine()!!.toDouble()

    val inicial = nome.firstOrNull()?.uppercaseChar()

    if (inicial == 'A' || inicial == 'D' ||
        inicial == 'M' || inicial == 'S') {

        val valorFinal = conta * 0.70

        println("Valor com desconto: R$ %.2f".format(valorFinal))
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome;")
        println("mas continue nos prestigiando que sua vez chegará.")
    }
}
//141
fun main() {
    print("Digite o nome do primeiro jogador: ")
    var nome1 = readLine()!!

    print("Digite os pontos: ")
    var pontos1 = readLine()!!.toInt()

    print("Digite o nome do segundo jogador: ")
    var nome2 = readLine()!!

    print("Digite os pontos: ")
    var pontos2 = readLine()!!.toInt()

    print("Digite o nome do terceiro jogador: ")
    var nome3 = readLine()!!

    print("Digite os pontos: ")
    var pontos3 = readLine()!!.toInt()

    var aux: Int
    var auxNome: String

    if (pontos1 < pontos2) {
        aux = pontos1
        pontos1 = pontos2
        pontos2 = aux

        auxNome = nome1
        nome1 = nome2
        nome2 = auxNome
    }

    if (pontos1 < pontos3) {
        aux = pontos1
        pontos1 = pontos3
        pontos3 = aux

        auxNome = nome1
        nome1 = nome3
        nome3 = auxNome
    }

    if (pontos2 < pontos3) {
        aux = pontos2
        pontos2 = pontos3
        pontos3 = aux

        auxNome = nome2
        nome2 = nome3
        nome3 = auxNome
    }

    println("VENCEDOR: $nome1 - $pontos1 pontos")
    println("SEGUNDO: $nome2 - $pontos2 pontos")
    println("TERCEIRO: $nome3 - $pontos3 pontos")
}

//142
fun main() {
    print("Pontos do primeiro jogador: ")
    var p1 = readLine()!!.toInt()

    print("Pontos do segundo jogador: ")
    var p2 = readLine()!!.toInt()

    print("Pontos do terceiro jogador: ")
    var p3 = readLine()!!.toInt()

    var aux: Int

    if (p1 > p2) {
        aux = p1
        p1 = p2
        p2 = aux
    }

    if (p1 > p3) {
        aux = p1
        p1 = p3
        p3 = aux
    }

    if (p2 > p3) {
        aux = p2
        p2 = p3
        p3 = aux
    }

    println("Pontuações em ordem decrescente:")
    println("$p3, $p2, $p1")

    val soma = p1 + p2 + p3

    if (soma > 100) {
        val media = soma / 3.0
        println("Média: %.2f".format(media))
    } else {
        println("Equipe desclassificada.")
    }
}

//143
fun main() {
    print("Digite uma palavra: ")
    val palavra = readLine()!!

    val tamanho = palavra.length
    val meio = tamanho / 2

    if (tamanho == 0) {
        println("Palavra vazia.")
    } else if (tamanho % 2 == 0) {
        val letras = palavra.substring(meio - 1, meio + 1)

        if (letras == "rr" || letras == "ss") {
            println("É rr ou ss.")
        } else {
            println("Não é rr ou ss.")
        }
    } else {
        val letra = palavra[meio].lowercaseChar()

        if (letra in "aeiou") {
            println("É vogal.")
        } else {
            println("Não é vogal.")
        }
    }
}

//144
fun main() {
    print("Digite o saldo médio: ")
    val saldo = readLine()!!.toDouble()

    val credito = when {
        saldo <= 500 -> 0.0
        saldo <= 1000 -> saldo * 0.30
        saldo <= 3000 -> saldo * 0.40
        else -> saldo * 0.50
    }

    println("Saldo médio: R$ %.2f".format(saldo))

    if (credito > 0) {
        println("Crédito concedido: R$ %.2f".format(credito))
    } else {
        println("Você não terá crédito.")
    }
}

//145
fun main() {
    print("Digite o nome do livro: ")
    val livro = readLine()!!

    print("Digite o tipo de usuário (professor/aluno): ")
    val tipo = readLine()!!.trim().lowercase()

    val dias = when (tipo) {
        "professor" -> 10
        "aluno" -> 3
        else -> 0
    }

    if (dias == 0) {
        println("Tipo de usuário desconhecido.")
    } else {
        println("Nome do livro: $livro")
        println("Tipo de usuário: $tipo")
        println("Total de dias: $dias")
    }
}

//146
fun main() {
    print("Digite o tipo do carro (A, B ou C): ")
    val tipo = readLine()!!.trim().uppercase()

    print("Digite o percurso em quilômetros: ")
    val percurso = readLine()!!.toDouble()

    val consumoPorLitro = when (tipo) {
        "C" -> 12.0
        "B" -> 10.0
        "A" -> 8.0
        else -> 0.0
    }

    if (consumoPorLitro > 0) {
        val consumo = percurso / consumoPorLitro
        println("Consumo estimado: %.2f litros".format(consumo))
    } else {
        println("Modelo inexistente.")
    }
}

//147
fun main() {
    var calorias = 0

    println("Escolha o prato:")
    println("1 - Vegetariano")
    println("2 - Peixe")
    println("3 - Frango")
    println("4 - Carne")

    val prato = readLine()!!.toInt()

    when (prato) {
        1 -> calorias += 180
        2 -> calorias += 230
        3 -> calorias += 250
        4 -> calorias += 350
        else -> {
            println("Prato inválido.")
            return
        }
    }

    println("Escolha a sobremesa:")
    println("1 - Abacaxi")
    println("2 - Sorvete diet")
    println("3 - Suco de melão")
    println("4 - Refrigerante diet")

    val sobremesa = readLine()!!.toInt()

    when (sobremesa) {
        1 -> calorias += 75
        2 -> calorias += 110
        3 -> calorias += 170
        4 -> calorias += 200
        else -> {
            println("Sobremesa inválida.")
            return
        }
    }

    println("Escolha a bebida:")
    println("1 - Chá")
    println("2 - Suco de laranja")
    println("3 - Mousse diet")
    println("4 - Mousse de chocolate")

    val bebida = readLine()!!.toInt()

    when (bebida) {
        1 -> calorias += 20
        2 -> calorias += 70
        3 -> calorias += 100
        4 -> calorias += 65
        else -> {
            println("Bebida inválida.")
            return
        }
    }

    println("Total de calorias: $calorias")
}

//148

fun main() {
    println("Escolha o destino:")
    println("1 - Região Norte")
    println("2 - Região Nordeste")
    println("3 - Região Centro-Oeste")
    println("4 - Região Sul")

    val destino = readLine()!!.toInt()

    println("Tipo de viagem:")
    println("1 - Ida")
    println("2 - Ida e volta")

    val viagem = readLine()!!.toInt()

    val preco = when (destino) {
        1 -> when (viagem) {
            1 -> 500.0
            2 -> 950.0
            else -> -1.0
        }

        2 -> when (viagem) {
            1 -> 350.0
            2 -> 650.0
            else -> -1.0
        }

        3 -> when (viagem) {
            1 -> 350.0
            2 -> 600.0
            else -> -1.0
        }

        4 -> when (viagem) {
            1 -> 300.0
            2 -> 550.0
            else -> -1.0
        }

        else -> -1.0
    }

    if (preco >= 0) {
        println("Preço da passagem: R$ %.2f".format(preco))
    } else {
        println("Opção inexistente.")
    }
}

//149
fun main() {
    print("Digite o nome do produto: ")
    val nome = readLine()!!

    print("Digite o valor da compra: ")
    val compra = readLine()!!.toDouble()

    val venda = when {
        compra < 10 -> compra * 1.70
        compra < 30 -> compra * 1.50
        compra < 50 -> compra * 1.40
        else -> compra * 1.30
    }

    println("$nome será vendido por R$ %.2f".format(venda))
}

//150
