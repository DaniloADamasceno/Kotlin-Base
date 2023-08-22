package calculadoraEstatica


fun main(args: Array<String>) {

//Crie um programa que permita ao usuário inserir um conjunto de números e realize as seguintes operações estatísticas:
// Média: Calcule a média dos números inseridos. Maior e Menor: Encontre o maior e o menor número no conjunto.
// Números Pares e Ímpares: Conte e exiba a quantidade de números pares e ímpares no conjunto.
//O programa deve permitir que o usuário insira quantos números desejar.
// Use um loop para receber a entrada e uma função para calcular cada estatística.


    println("---------------------- Calculadora Estatística ----------------------")
    println()
    println()
    println("Quantos números você deseja digitar?")
    println("           --> Os números digitados vão retornar: MÉDIA, MAIOR e o MENOR número, e a quantidade de números PARES e ÍMPARES")
    println()
    print("Digite a quantidade de números que deseja digitar:  ")
    val qtdNumDigitados = readln().toInt()

    println()
    println("---------->>  Digite os números: <<----------")
    val todosNumDigitados = Array(qtdNumDigitados) { readln().toInt() }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    println("A lista digitada foi: ${todosNumDigitados.contentToString()}")


    //média
    val media = todosNumDigitados.average()
    println("A média dos números digitados é: $media")
    println()

    //maior e menor
    val maior = todosNumDigitados.maxOrNull()
    val menor = todosNumDigitados.minOrNull()
    println("O MAIOR(>) número digitado é: $maior")
    println("O MENOR(<) número digitado é: $menor")

    //pares e ímpares
    var qtdPares = 0
    var qtdImpares = 0
    for (num in todosNumDigitados) {
        if (num % 2 == 0) {
            qtdPares++
        } else {
            qtdImpares++
        }
    }
    println()
    println("A quantidade de números PARES digitados é: $qtdPares")
    println("A quantidade de números ÍMPARES digitados é: $qtdImpares")


}