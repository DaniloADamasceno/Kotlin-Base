import java.text.DecimalFormat
import kotlin.math.sqrt

fun main(args: Array<String>) {

    println("-------------------------------- Exercício de Funções em KOTLIN -----------------------------------------")
    println()
    println()

    //?-----------------------------------------------------------------------------------------------------------------
//01    -->[x] Crie uma função que recebe um número inteiro e retorna o seu dobro.

    fun dobro(numero: Int): Int {
        return numero * 2
    }
    print("Digite um número inteiro: ")
    val numDigitado = readln().toInt()

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O dobro de $numDigitado é: ${dobro(numDigitado)}")


    //?-----------------------------------------------------------------------------------------------------------------
//02    -->[x] Crie uma função que recebe um número inteiro e verifica se ele é par ou ímpar,
    //        retornando uma mensagem indicando o resultado.

    fun parOuImpar(numero: Int): String {
        return if (numero % 2 == 0) {
            "O número $numero é PAR"
        } else {
            "O número $numero é ÍMPAR"
        }
    }
    print("Digite um número inteiro: ")
    val numDigitado02 = readln().toInt()
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O número $numDigitado02 é: ${parOuImpar(numDigitado02)}")


    //?-----------------------------------------------------------------------------------------------------------------
//03    -->[x] Crie uma função que recebe dois números inteiros e retorna o maior deles.

    fun maiorNumero(num01: Int, num02: Int): Int {
        return if (num01 > num02) {
            num01
        } else {
            num02
        }
    }

    print("Digite um número inteiro: ")
    val numDigitado03 = readln().toInt()

    print("Digite outro número inteiro: ")
    val segundoNumDigitado03 = readln().toInt()

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O maior número entre ($numDigitado03) e ($segundoNumDigitado03) é:     ${maiorNumero(numDigitado03, segundoNumDigitado03)}")


    //?-----------------------------------------------------------------------------------------------------------------
//04    -->[x] Crie uma função que recebe uma lista de números inteiros e retorna a média aritmética dos valores.

    fun media(mediaArrays: Array<Int>): Double {
        var soma = 0
        for (numero in mediaArrays) {
            soma += numero
        }
        return soma.toDouble() / mediaArrays.size
    }

    print("Quantos números você quer digitar?    ")
    println()
    val qtdNumDigitados = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitados04 = Array(qtdNumDigitados) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A média dos números digitados é: ${media(numDigitados04)}")


    //?-----------------------------------------------------------------------------------------------------------------
//05    -->[x] Crie uma função que recebe um número inteiro e retorna a sua tabuada, de 1 a 10.

    fun tabuada(numero: Int): String {
        var tabuada = ""
        for (i in 1..10) {
            tabuada += "$numero x $i = ${numero * i}\n"
        }
        return tabuada
    }

    print("Digite um número inteiro:    ")
    val numDigitado05 = readln().toInt()

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A tabuada do número $numDigitado05 é: \n${tabuada(numDigitado05)}")


    //?-----------------------------------------------------------------------------------------------------------------
//06    -->[x] Crie uma função que recebe um número inteiro e verifica se ele é primo,
    //        retornando uma mensagem indicando o resultado.

    fun primo(numero: Int): String {
        var primo = true
        for (i in 2 until numero) {
            if (numero % i == 0) {
                primo = false
            }
        }
        return if (primo) {
            "O número $numero é PRIMO"
        } else {
            "O número $numero não é primo"
        }
    }

    print("Digite um número inteiro:    ")
    val numDigitado06 = readln().toInt()

    println()
    println()
    println("| ----------------------------------------------------------------------------- |")
    println(
        "| Um número primo é aquele que é dividido apenas por 1 e por ele mesmo.         |" +
                "\n|   Entre 0 e 100 existem apenas 25 números primos                              |"
    )
    println("| ----------------------------------------------------------------------------- |")
    println(primo(numDigitado06))


    //?-----------------------------------------------------------------------------------------------------------------
//07    -->[x] Crie uma função que recebe uma lista de strings e retorna a quantidade de elementos que contêm mais de 5 caracteres.

    fun cincoLetras(lista: Array<String>): Int {
        var quantidadeLetrasMaiorQueCinco = 0
        for (i in lista) {
            if (i.length > 5) {
                quantidadeLetrasMaiorQueCinco++
            }
        }
        return quantidadeLetrasMaiorQueCinco
    }

    println()
    print("Digite 5 nomes:    ")
    val listaNomes = Array(5) { readln() }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A quantidade de nomes com mais de 5 letras é: ${cincoLetras(listaNomes)}")


    //?-----------------------------------------------------------------------------------------------------------------
//08    -->[x] Crie uma função que recebe uma lista de números inteiros e retorna a soma dos valores pares.

    fun somaPares(listaNum: Array<Int>): Int {
        var somaPares = 0
        for (i in listaNum) {
            if (i % 2 == 0) {
                somaPares += i
            }
        }
        return somaPares
    }
    println()
    print("Quantos números você quer digitar?    ")
    println()
    val qtdNumDigitados08 = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitadosOito = Array(qtdNumDigitados08) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A soma dos números pares digitados é: ${somaPares(numDigitadosOito)}")


    //?-----------------------------------------------------------------------------------------------------------------
//09    -->[x] Crie uma função que recebe uma lista de números inteiros e retorna uma nova lista com os valores em ordem crescente.

    fun ordemCrescente(listaNum09: Array<Int>): Array<Int> {
        val listaOrdenada = listaNum09.sortedArray()
        return listaOrdenada
    }
    println()
    print("Quantos números você deseja digitar?    ")
    println()
    val qtdNumDigitados09 = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitados08 = Array(qtdNumDigitados09) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A lista ordenada é: ${ordemCrescente(numDigitados08).contentToString()}")


    //?-----------------------------------------------------------------------------------------------------------------
//10    -->[x] rie uma função que recebe uma lista de números inteiros e retorna o segundo maior valor.

 fun segundoMaior(listaNum10: Array<Int>): Int {
        val listaOrdenada = listaNum10.sortedArray()
        return listaOrdenada[listaOrdenada.size - 2]
    }
    println()
    print("Quantos números você deseja digitar?    ")
    println()
    val qtdNumDigitados10 = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitados10 = Array(qtdNumDigitados10) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A lista ordenada de forma Crescente é:   ${numDigitados10.sortedArray().contentToString()}")
    println()
    println("O segundo maior número é: ${segundoMaior(numDigitados10)}")


    //?-----------------------------------------------------------------------------------------------------------------
//11    -->[x] Crie uma função que recebe uma lista de números inteiros e verifica se todos eles são positivos,
    //        retornando uma mensagem indicando o resultado.

    fun positivo(listaNum11: Array<Int>): String {
        var positivo = true
        for (i in listaNum11) {
            if (i < 0) {
                positivo = false
            }
        }
        return if (positivo) {
            "TODOS os números inseridos na lista são positivos"
        } else {
            "Existem números negativos na lista mencionada"
        }
    }

    println()
    print("Quantos números você deseja digitar?    ")
    println()
    val qtdNumDigitados11 = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitados11 = Array(qtdNumDigitados11) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println(positivo(numDigitados11))


    //?-----------------------------------------------------------------------------------------------------------------
//12    -->[x] Crie uma função que recebe uma lista de strings e retorna uma nova lista com as strings em ordem alfabética.

    fun ordemAlfabetica(listaNomes12: Array<String>): Array<String> {
        val listaOrdenadaNomes: Array<String> = listaNomes12.sortedArray()
        return listaOrdenadaNomes
    }

    println()
    print("Quantos nomes você deseja digitar?    ")
    println()
    val qtdNomesDigitados12 = readln().toInt()

    println()
    println("---------->>  Digite os nomes: <<----------")
    val nomesDigitados12 = Array(qtdNomesDigitados12) { readln() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("Os nomes digitados foram: ${nomesDigitados12.contentToString()}")
    println()
    println("Os nomes em ordem alfabética são:  ${ordemAlfabetica(nomesDigitados12).sorted()}")


    //?-----------------------------------------------------------------------------------------------------------------
//13    -->[x] Crie uma função que recebe um número inteiro e retorna a sua raiz quadrada.
    println()
    print("Digite um número inteiro para saber a sua raiz quadrada (√) :    ")
    val numDigitado13 = readln().toInt()


    fun raizQuadrada(num13: Int): Double {
        return sqrt(num13.toDouble())
    }
    // para converter as casas em decimal com o DecimalFormat
    val formatTwo = DecimalFormat("#.##")
    val valueTwoDeci = formatTwo.format(raizQuadrada(numDigitado13))


    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A raiz quadrada de $numDigitado13 é: ${valueTwoDeci}")


    //?-----------------------------------------------------------------------------------------------------------------
//14    -->[x] Crie uma função que recebe uma lista de números inteiros e retorna uma nova lista com os valores multiplicados por 2.

    fun multiplicaPorDois(listaNum14: Array<Int>): Array<Int> {
        val listaMultiplicada = Array(listaNum14.size) { 0 }
        for (i in listaNum14.indices) {
            listaMultiplicada[i] = listaNum14[i] * 2
        }
        return listaMultiplicada
    }

    println()
    print("Quantos números você deseja digitar?    ")
    println()
    val qtdNumDigitados14 = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val numDigitados14 = Array(qtdNumDigitados14) { readln().toInt() }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A lista digitada foi: ${numDigitados14.contentToString()}")
    println()
    println("A lista multiplicada por 2 é: ${multiplicaPorDois(numDigitados14).contentToString()}")


    //?-----------------------------------------------------------------------------------------------------------------
//15    -->[x] Crie uma função que recebe um número inteiro e retorna a sua representação em binário.

    fun binario(num15: Int): String {
        var num15: Int = num15
        var binario = ""
        while (num15 > 0) {
            binario = (num15 % 2).toString() + binario
            num15 /= 2
        }
        return binario
    }

    println()
    print("Digite um número inteiro para saber a sua representação em binário:    ")
    val numDigitado15 = readln().toInt()

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A representação em binário de $numDigitado15 é: ${binario(numDigitado15)}")


}