import java.text.DecimalFormat

fun main(args: Array<String>) {

    println("---------------------------- Exercício de Laços de Repetição --------------------------------------------")
    println()
    println()


    //? ------------------------------------------------------------ EXEMPLO 01 --------------------------------------//
    // --> [x] Escreva um programa que imprima os números de 1 a 10 utilizando um loop while.

    var num = 1
    while (num <= 10) {
        println(num)
        num++
    }

    //? ------------------------------------------------------------ EXEMPLO 02 --------------------------------------//
    // --> [x] Escreva um programa que imprima os números pares de 2 a 20 utilizando um loop for.

    val numPar = 2
    for (numPar in 2..20 step 2) {
        println(numPar)
    }


    //? ------------------------------------------------------------ EXEMPLO 03 --------------------------------------//
    // --> [x] Escreva um programa que imprima os números ímpares de 1 a 15 utilizando um loop do-while.

    var numImpar = 1
    do {
        if (numImpar % 2 != 0) {
            println(numImpar)
        }
        numImpar++
    } while (numImpar <= 15)


    //? ------------------------------------------------------------ EXEMPLO 04 --------------------------------------//
    // -->[x] Escreva um programa que imprima a soma dos números de 1 a 100 utilizando um loop for.

    val numSoma = 1
    var soma = 0
    for (numSoma in 1..100) {
        soma += numSoma
        println(soma)
    }


    //? ------------------------------------------------------------ EXEMPLO 05 --------------------------------------//
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


    //? ------------------------------------------------------------ EXEMPLO 06 --------------------------------------//
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

    //? ------------------------------------------------------------ EXEMPLO 07 --------------------------------------//
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
    val formatoDecimal = DecimalFormat("#.##")
    val valueTwoDeci = formatoDecimal.format(media)

    println("A média dos números digitados é: $valueTwoDeci")


    //? ------------------------------------------------------------ EXEMPLO 08 --------------------------------------//
    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima se ele é primo ou não utilizando um loop for.

    print("Digite um número para saber se ele é primo ou não:   ")
    val numPrimo = readlnOrNull()?.toIntOrNull()
    println()

    if (numPrimo != null) {

        println("| ----------------------------------------------------------------------------- |")
        println(
            "| Um número primo é aquele que é dividido apenas por 1 e por ele mesmo.         |" +
                    "\n|   Entre 0 e 100 existem apenas 25 números primos                              |"
        )
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

    //? ------------------------------------------------------------ EXEMPLO 09 --------------------------------------//
    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima a sequência de Fibonacci até esse número utilizando um loop while.

    println("---------------------------------   Sequencia de Fibonacci   ---------------------------------")



    print("Digite um número inteiro:  ")
    val numberFibo = readlnOrNull()?.toIntOrNull()

    println()
    println()

    val fibonacciList = ArrayList<Int>()

    if (numberFibo != null) {
        println(
            "A sequência de Fibonacci é uma sequência de números inteiros iniciados por 0(zero) e 1(um),\n" +
                    "no qual cada termo subsequente corresponde a soma dos dois números anteriores: "
        )
        println()
        println()
        println("A sequência é definida pela fórmula Fn = fn-1 + Fn-2 :")
        println(
            "Iniciando pelo 1, essa sequência é formada somando cada número com o número que o antecede.\n" +
                    "No caso do 1, repete-se esse número e depois soma, ou seja, 1 + 1 = 2.\n" +
                    "De seguida soma-se o resultado com o número seguinte, ou seja, 1 + 2 = 3 e assim sucessivamente, numa sequência infinita: \n \n"
        )

        var a = 0
        var b = 1

        while (a <= numberFibo) {
            fibonacciList.add(a)
            val sum = a + b
            a = b
            b = sum
        }
    } else {
        println("Valor INVALIDO. Digite um valor valido")
    }

    println("Sequência de Fibonacci até $numberFibo:")
    for (num08 in fibonacciList) {
        print("$num08  - ")
    }


    //? ------------------------------------------------------------ EXEMPLO 10 --------------------------------------//
    // -->[x] Escreva um programa que leia vários números inteiros do usuário até que o número -1 seja digitado.
    //        Em seguida, imprima o maior número lido utilizando um loop do-while.

    println(
        "Digite vários números inteiros ao final será informado o MAIOR número" +
                "\n" +
                " --> Digite -1(menos um) para sair"
    )
    println()

    val numbersList = ArrayList<Int>()
    do {
        print("Digite um número: ")
        val numReader: Int = readlnOrNull()?.toIntOrNull() ?: 0

        if (numReader != -1) {
            numbersList.add(numReader)
        }

    } while (numReader != -1)

    if (numbersList.isEmpty()) { // Verificar se a lista [e vazia
        println("NENHUM número foi inserido.")
    } else {
        var maxNumber = numbersList[0]
        val numOrder = numbersList.sorted() // ordenar a lista de forma crescente

        for (number in numbersList) {
            if (number > maxNumber) {
                maxNumber = number
            }
        }
        println()
        println("Os números digitados foram: $numOrder")
        println()
        println("O MAIOR número é: $maxNumber")
    }


    //? ------------------------------------------------------------ EXEMPLO 11 --------------------------------------//
    // -->[x] Escreva um programa que leia vários números inteiros do usuário até que o número 0 seja digitado.
    //        Em seguida, imprima a quantidade de números positivos e negativos lidos utilizando um loop for.

    println(
        "Digite vários números inteiros positivos é negativos" +
                "\n" +
                " --> Digite 0(ZERO) para sair"
    )
    println()

    val listaPositiva = ArrayList<Int>()
    val listaNegativa = ArrayList<Int>()

    var listaCompleta = ArrayList<Int>()
    listaCompleta = (listaPositiva + listaNegativa) as ArrayList<Int>

    do {
        print("Digite um número: ")
        val numReader: Int = readlnOrNull()?.toIntOrNull() ?: 0

        if (numReader <= -1) {                                                  // --> se o número for negativo
            listaNegativa.add(numReader)
        } else {                                                                  //  --> se o número for positivo
            listaPositiva.add(numReader)
        }

        listaCompleta = (listaPositiva + listaNegativa) as ArrayList<Int>       // --> juntar as duas listas
    } while (numReader != 0)

    if (listaPositiva.isEmpty() && listaNegativa.isEmpty()) {               // Verificar se a lista [e vazia
        println("NENHUM número foi inserido.")
    } else {
        println()
        println("Os números digitados foram: $listaCompleta")
        println()

    }

    println("A quantidade de números positivos é: ${listaPositiva.size}")
    println("A quantidade de números negativos é: ${listaNegativa.size}")


    //? ------------------------------------------------------------ EXEMPLO 12 --------------------------------------//
    // -->[] Escreva um programa que leia um número inteiro do usuário e imprima a sua representação binária utilizando um loop while.


    //? ------------------------------------------------------------ EXEMPLO 13 --------------------------------------//
    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima a soma de seus dígitos utilizando um loop do-while.

    print("Digite um número inteiro: ")

    var numeroDigitado04 = readlnOrNull()?.toIntOrNull() ?: 0
    var somaDigito04 = 0


    do {
        val digito = numeroDigitado04 % 10                // Obtém o último dígito do número
        somaDigito04 += digito                                  // Adiciona o dígito à soma
        numeroDigitado04 /= 10                                  // Remove o último dígito do número
    } while (numeroDigitado04 > 0)


    println("A soma dos dígitos do número é: $somaDigito04")


    //? ------------------------------------------------------------ EXEMPLO 14 --------------------------------------//
    // -->[x] Escreva um programa que leia vários números inteiros do usuário até que o número 0 seja digitado.
    //        Em seguida, imprima o segundo maior número lido utilizando um loop for.

    println(
        "Digite vários números inteiros ao final será informado o SEGUNDO maior número" +
                "\n" +
                " --> Digite 0(ZERO) para sair"
    )
    println()

    val numbersList03 = ArrayList<Int>()
    do {
        print("Digite um número: ")
        val numDigitado03: Int = readlnOrNull()?.toIntOrNull() ?: 0

        if (numDigitado03 != 0) {
            numbersList03.add(numDigitado03)
        }
    } while (numDigitado03 != 0)

    if (numbersList03.isEmpty()) {                                                      // --> Verificar se a lista e vazia
        println("NENHUM número foi inserido !!")
    } else {

        val ordemDecrescente = numbersList03.sortedByDescending { it * it } // --> ordenar a lista de forma crescente
        var maiorNumero03 = numbersList03[0]

        for (number03 in numbersList03) {
            if (number03 > maiorNumero03) {
                maiorNumero03 = number03
            }
        }

        println()
        println()
        println("Os números digitados foram:  $ordemDecrescente")
        println()
        println("O SEGUNDO maior número é: " + ordemDecrescente[1])
        println()

    }


    //? ------------------------------------------------------------ EXEMPLO 15 --------------------------------------//
    // -->[x] Escreva um programa que leia um número inteiro do usuário e imprima se ele é um número perfeito ou não utilizando um loop while.

    print("Digite um número inteiro:")
    val numeroDigitadoPerfeito = readlnOrNull()?.toIntOrNull() ?: 0

    var somaDivisores = 0
    var divisor = 1

    while (divisor < numeroDigitadoPerfeito) {
        if (numeroDigitadoPerfeito % divisor == 0) {
            somaDivisores += divisor
        }
        divisor++
    }

    if (somaDivisores == numeroDigitadoPerfeito) {
        println("$numeroDigitadoPerfeito é um número PERFEITO.")
    } else {
        println(numeroDigitadoPerfeito.toString() + " não é um número perfeito.")
    }

}