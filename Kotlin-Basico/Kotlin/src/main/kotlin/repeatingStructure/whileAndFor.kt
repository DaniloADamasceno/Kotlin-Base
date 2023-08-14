import java.text.DecimalFormat

fun main(args: Array<String>) {

    println("------------ Exercício de Laços de Repetição ---------")
    println()
    println()

    /*

    // --> [x] Escreva um programa que imprima os números de 1 a 10 utilizando um loop while.

        val num = 1
        while (num <= 10) {
            println(num)
            num++
        }


    // --> [x] Escreva um programa que imprima os números pares de 2 a 20 utilizando um loop for.

        val numPar = 2
        for (numPar in 2..20 step 2) {
            println(numPar)
        }

    // --> [x] Escreva um programa que imprima os números ímpares de 1 a 15 utilizando um loop do-while.

        var numImpar = 1
        do {
            if (numImpar % 2 != 0) {
                println(numImpar)
            }
            numImpar++
        } while (numImpar <= 15)

    // -->[x] Escreva um programa que imprima a soma dos números de 1 a 100 utilizando um loop for.

    val numSoma = 1
    var soma = 0
    for (numSoma in 1..100) {
        soma += numSoma
        println(soma)
    }


    //--> [x] Escreva um programa que leia um número inteiro do usuário e imprima a tabuada desse número utilizando um loop for.

    print("Digite um número para ver a sua tabuada:  ")
    val numTabuada = readlnOrNull()?.toIntOrNull()

    if (numTabuada != null) {
        println()
        println("Tabuada do $numTabuada")
        for (i in 1..10) {
            println("$numTabuada x $i = ${numTabuada * i}")
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }


    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima os seus divisores utilizando um loop while.

    print("Digite um número para ver os seus divisores:  ")
    val numDivisor = readlnOrNull()?.toIntOrNull()

    if (numDivisor != null) {
        println()
        println("os números Divisores de $numDivisor são:  ")
        var valueInitial = 1
        while (valueInitial <= numDivisor) {
            if (numDivisor % valueInitial == 0) {
                println(valueInitial)
            }
            valueInitial++
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }


    // -->[x] Escreva um programa que leia vários números inteiros do usuário até que o número 0 seja digitado.
    //        Em seguida, imprima a média dos números lidos utilizando um loop do-while.

    println(
        "Digite vários números inteiros para saber a média deles." +
                "\n" +
                " --> Digite 0(ZERO) para sair"
    )
    println()

    var numMedia: Double = 1.0
    var somaMedia: Double = 0.0
    var media: Double = 0.0
    var counter: Double = 0.0

    do {
        print("Digite um número:  ")
        numMedia = (readlnOrNull()?.toDoubleOrNull() ?: 0) as Double
        somaMedia += numMedia
        counter++
    } while (numMedia != 0.0)

    media = somaMedia / counter

    // para converter as casas em decimal com o DecimalFormat
    val formatCounter = DecimalFormat("#.##")
    val valueTwoDeci = formatCounter.format(media)

    println("A média dos números digitados é: $valueTwoDeci")


    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima se ele é primo ou não utilizando um loop for.

    print("Digite um número para saber se ele é primo ou não:   ")
    val numPrimo = readlnOrNull()?.toIntOrNull()
    println()

    if (numPrimo != null) {

        println("| ----------------------------------------------------------------------------- |")
        println("| Um número primo é aquele que é dividido apenas por 1 e por ele mesmo.         |" +
                "\n|   Entre 0 e 100 existem apenas 25 números primos                              |")
        println("| ----------------------------------------------------------------------------- |")

        println()
        var contadorPrimo = 0
        for (i in 1..numPrimo) {
            if (numPrimo % i == 0) {
                contadorPrimo++
            }
        }
        if (contadorPrimo == 2) {
            println("O número $numPrimo é PRIMO")
        } else {
            println("O número $numPrimo NÂO é primo")
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }

    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima a sequência de Fibonacci até esse número utilizando um loop while.

    println("---------------------------------   Sequencia de Fibonacci   ---------------------------------")
    println("Digite um número inteiro:  ")
    val numFibonacci =readlnOrNull()?.toIntOrNull()


    if (numFibonacci != null) {
        var numFibonacci1 = 0
        var numFibonacci2 = 1
        var numFibonacci3 = 0

        println("A sucessão de Fibonacci é uma sequência de números inteiros iniciados por 0(zero) e 1(um),\n" +
                "no qual cada termo subsequente corresponde a soma dos dois números anteriores: ")
        println()
        println("A sequência é definida pela fórmula Fn = fn-1 + Fn-2 :")
        println("Iniciando pelo 1, essa sequência é formada somando cada número com o número que o antecede.\n" +
                "No caso do 1, repete-se esse número e depois soma, ou seja, 1 + 1 = 2.\n" +
                "De seguida soma-se o resultado com o número seguinte, ou seja, 1 + 2 = 3 e assim sucessivamente, numa sequência infinita:")


            while (numFibonacci >= numFibonacci3) {
                     // Para iniciar a sequencia de fibonacci é necessário somar os dois primeiros números da sequencia
            numFibonacci3 = numFibonacci1 + numFibonacci2
            numFibonacci1 = numFibonacci2               // --> O primeiro número da sequencia é igual ao segundo
            numFibonacci2 = numFibonacci3               // --> O segundo número da sequencia é igual ao terceiro
            println(numFibonacci3)
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }
 */

    // -->[] Escreva um programa que leia vários números inteiros do usuário até que o número -1 seja digitado.
    //       Em seguida, imprima o maior número lido utilizando um loop do-while.

    println(
        "Digite vários números inteiros para saber a média deles." +
                "\n" +
                " --> Digite -1(menos um) para sair")
    println()

    var numReader = 0

    do {
        print("Digite um número:  ")
        numReader = readlnOrNull()?.toIntOrNull() ?: 0
        if (numReader > numReader) {
            numReader = numReader
        }
    } while (numReader != -1)

    val numList = arrayOf(numReader)
    numList.sort()
    val numMaior = numList.takeLast(numReader)

    println("O maior número digitado foi: $numMaior")


//
//    do {
//        print("Digite um número inteiro (-1 para sair): ")
//        input = scanner.nextInt()
//
//        if (input != -1 && input > maxNumber) {
//            maxNumber = input
//        }
//    } while (input != -1)
//
//    if (maxNumber != Int.MIN_VALUE) {
//        println("O maior número lido é: $maxNumber")
//    } else {
//        println("Nenhum número válido foi digitado.")
//    }
//}




// -->[] Escreva um programa que leia vários números inteiros do usuário até que o número 0 seja digitado. Em seguida, imprima a quantidade de números positivos e negativos lidos utilizando um loop for.

// -->[] Escreva um programa que leia um número inteiro do usuário e imprima a sua representação binária utilizando um loop while.

// -->[] Escreva um programa que leia um número inteiro do usuário e imprima a soma de seus dígitos utilizando um loop do-while.

// -->[] Escreva um programa que leia vários números inteiros do usuário até que o número 0 seja digitado. Em seguida, imprima o segundo maior número lido utilizando um loop for.

// -->[] Escreva um programa que leia um número inteiro do usuário e imprima se ele é um número perfeito ou não utilizando um loop while.

}