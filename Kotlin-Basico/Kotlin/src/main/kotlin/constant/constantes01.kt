package constant

fun main(args: Array<String>) {
    println("<<--------   Exercício 02 - Condicionais em Kotlin   -------->>")
    println()
    println()


// [x] Escreva um programa que pede ao usuário para digitar um número e imprima se o número é positivo ou negativo.
    println("Digite um Número")

    var numberDig = readlnOrNull()?.toDoubleOrNull()

    if(numberDig != null){
        if(numberDig > 0){
            println("O Numero é Positivo")
                }else if(numberDig < 0 ){
                    println("O Numero é Negativo")
                        }else {
                            println("O Número é Zero") }
                                }else {
                                    println("o Número é Nulo, Digite outro numero : ")
}


// [x] Escreva um programa que pede ao usuário para digitar uma letra e imprima se a letra é uma vogal ou consoante.
    print("Digite uma letra: ")
    val letraInput = readLine()?.trim()

    if (letraInput != null && letraInput.isNotEmpty()) {
        val letra = letraInput[0].toUpperCase()

        if (letra in 'A'..'Z') {
            if (letra in listOf('A', 'E', 'I', 'O', 'U')) {
                println(" A letra $letra é uma vogal.")
            } else {
                println(" A letra $letra é uma consoante.")
            }
        } else {
            println("Entrada inválida. Por favor, digite uma letra válida.")
        }
    } else {
        println("Nenhuma letra fornecida.")
    }


// [x] Escreva um programa que pede ao usuário para digitar sua idade e imprima se a pessoa é maior ou menor de idade.
    print("Digite ua sua Idade: ")

    val idade = readLine()?.toDoubleOrNull()

    if (idade != null && idade > 0) {
        if (idade >= 18 ){
            println("Você é maior de Idade")
                } else {
                    println("Você é menor de Idade")
                    }
    } else {
    println("Digite uma idade Valida")
    }


// [x] Escreva um programa que pede ao usuário para digitar dois números e imprima o maior dos dois.
     println("Digite o Primeiro Número")
        var primeiroNum = readlnOrNull()?.toDoubleOrNull()
        println()

    println("Digite o Segundo Número")
        var segundoNum = readlnOrNull()?.toDoubleOrNull()
        println()

        if(primeiroNum != null && segundoNum != null){
            if (primeiroNum > segundoNum) {
                println(" o Número $segundoNum é Maior que o número $primeiroNum")
                 } else if (segundoNum == primeiroNum){
                    println(" o Número $primeiroNum é igual ao número $segundoNum")
                    } else {
                        println(" o Número $primeiroNum é Maior que o número $segundoNum")
                        }
        } else {
            println("Digite um número valido")

}


// [x] Escreva um programa que pede ao usuário para digitar um número e imprima se ele é par ou ímpar.
    print("Digite um Número:  ")
    val numberParImpar = readlnOrNull()?.toDoubleOrNull()

    if (numberParImpar != null) {
        if (numberParImpar % 2 == 0.0) {
            println("O Número $numberParImpar é Par")
        } else {
            println("O Número $numberParImpar é Impar")
        }
    } else {
        println("o Número é Nulo, Digite outro numero : ")
    }
}