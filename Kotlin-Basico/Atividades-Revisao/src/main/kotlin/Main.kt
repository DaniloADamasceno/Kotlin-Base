
import calculadora.estatica.CalculadoraEstatica
import calculadora.imc.CalculadoraIMC


fun main(args: Array<String>) {

    println(" ------------------------ Atividades de Revisão ------------------------ ")
    println()
    println()

    println("Escolha uma das opções abaixo: ")
    println()
    println("1 - Calculadora de IMC")
    println("2 - Calculadora Estatística")
    println()

    print("Digite a opção desejada: ")
    val opcao = readln().toInt()

    // Instanciando e chamando a classe CalculadoraIMC
    val calculadoraEstatica = CalculadoraEstatica()
    calculadoraEstatica.estatica()

    // Instanciando e chamando a classe CalculadoraIMC
    val calculadoraIMC = CalculadoraIMC()


    when (opcao) {
        1 -> {
            println()
            println("Você escolheu a opção 1 - Calculadora de IMC")
            calculadoraIMC.imcCalc()
        }
        2 -> {
            println()
            println("Você escolheu a opção 2 - Calculadora Estatística")
            calculadoraEstatica.estatica()
        }
        else -> {
            println()
            println("Opção inválida!")
            println()
        }
    }




}