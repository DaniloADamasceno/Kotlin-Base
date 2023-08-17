package arrays

fun main(args: Array<String>) {

    println("---------------------------- Exercício de Laços de ARRAYS em KOTLIN -------------------------------------")
    println()
    println()


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 5 números inteiros e armazene-os em um array.
    //       Em seguida, exiba a soma de todos os números no array.

    println("Digite 5 números inteiros: ")
    val numDigitados01 = Array(5) { readLine()!!.toInt() }
    var soma = 0
    for (numero in numDigitados01) {
        soma += numero
    }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A soma dos números digitados é: $soma")
    println()
    println()


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array.
    //          Em seguida, exiba o maior número no array.

    println("Digite 10 números inteiros:  ")
    val numDigitados02 = Array(10) { readlnOrNull()?.toIntOrNull() }
    var maior = 0
    for (numero in numDigitados02) {
        if (numero!! > maior) {
            maior = numero
        }
    }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O MAIOR número digitado é: $maior")
    println()
    println("Os números digitados foram: " + numDigitados02.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println()


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array.
    //        Em seguida, exiba o menor número no array.

    println("Digite 10 números inteiros:   ")
    val numDigitados03 = Array(10) { readlnOrNull()?.toIntOrNull() }
    var menor = 0
    for (numero in numDigitados03) {
        if (numero!! < menor) {
            menor = numero
        }
    }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O MENOR número digitado é: $menor")
    println()
    println("Os números digitados foram: " + numDigitados03.contentToString()) //--> contentToString() é um método que converte o array em uma string


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 5 nomes e armazene-os em um array.
    //       Em seguida, exiba os nomes em ordem alfabética.

    println("Digite 5 nomes: ")
    val nomesDigitados04 = Array(5) { readln() }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("Os nomes digitados foram: " + nomesDigitados04.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println()
    println("Os nomes digitados em ordem ALFABÉTICA são: " + nomesDigitados04.sorted())


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array.
    //          Em seguida, exiba os números em ordem crescente.

    println("Digite 10 números inteiros:   ")
    val numDigitados05 = Array(10) { readlnOrNull()?.toIntOrNull() }

    val ordemDecrescente = numDigitados05.sortedByDescending { it } // --> ordenar a lista de forma crescente
    var maiorNumero05 = numDigitados05[0]

    for (numero in numDigitados05) {
        if (numero!! > maiorNumero05!!) {
            maiorNumero05 = numero
        }
    }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("O MAIOR número digitado é: $maiorNumero05")
    println()
    println("Os números digitados foram: " + numDigitados05.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println("Ao Digitar só a variavel 'numDigitados05', o resultado é:( $numDigitados05 ) -> local de mémoria onde o array está armazenado")


    //?-------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array.
    //        Em seguida, exiba os números em ordem decrescente.

    println("Digite 10 números inteiros:   ")
    val numDigitados06 = Array(10) { readlnOrNull()?.toIntOrNull() }

    println()
    println()
    println("-----------------------------------------------------------------------------------------------------")
    println("Os números digitados foram: " + numDigitados06.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println()
    println("Os números digitados em ordem CRESCENTE são: " + numDigitados06.sortedByDescending { it })


    //?-----------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 5 palavras e armazene-os em um array. Em seguida, exiba a palavra mais longa no array.

    println("Digite 5 palavras: ")
    val textoDigitado07 = Array(5) { readln() }
    var maiorPalavra = ""  //--> variável que vai armazenar a maior palavra digitada (STRING VAZIA)
    for (palavra in textoDigitado07) {
        if (palavra.length > maiorPalavra.length) {
            maiorPalavra = palavra
        }
    }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println()
    println("As palavras digitadas foram: " + textoDigitado07.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println("A MAIOR palavra digitada é: $maiorPalavra")
    println()


    //?-----------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar 5 palavras e armazene-os em um array.
    //          Em seguida, exiba a palavra mais curta no array.

    println("Digite 5 palavras: ")
    val textoDigitado08 = Array(5) { readln() }
    var menorPalavra = textoDigitado08[0]  //--> variável que vai armazenar a menor palavra digitada (STRING VAZIA)
    for (palavra in textoDigitado08) {
        if (palavra.length < menorPalavra.length) {
            menorPalavra = palavra
        }
    }

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println()
    println("As palavras digitadas foram: " + textoDigitado08.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println("A MENOR palavra digitada é: $menorPalavra")
    println()


    //?-----------------------------------------------------------------------------------------------------------------
    // -->[x] Crie um programa que peça ao usuário para digitar uma frase e armazene cada palavra em um elemento de um array.
    //          Em seguida, exiba a frase com as palavras na ordem inversa.

    println("Digite uma frase: ")
    val textoDigitado09 = Array(1) { readln() }
    val fraseInvertida = textoDigitado09[0].split(" ").reversed().joinToString(" ")

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println()
    println("A frase digitada foi: " + textoDigitado09.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println()
    println("A frase digitada invertida é: $fraseInvertida")


    // -->[x] Crie um programa que peça ao usuário para digitar 10 números inteiros e armazene-os em um array.
    //          Em seguida, remova os números duplicados e exiba o array resultante.

    println("Digite 10 números inteiros:   ")
    val numDigitados10 = Array(10) { readlnOrNull()?.toIntOrNull() }
    val numDigitados10SemDuplicidade =
        numDigitados10.distinct() // --> distinct() é um método que remove os elementos duplicados de um array

    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("Os números digitados foram: " + numDigitados10.contentToString()) //--> contentToString() é um método que converte o array em uma string
    println()
    println("""Os números digitados SEM DUPLICIDADE são: $numDigitados10SemDuplicidade""")
    println()


}