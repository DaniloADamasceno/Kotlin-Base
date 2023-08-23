
import cadastroUsuarios.Crud
import calculadoras.estatica.CalculadoraEstatica
import calculadoras.imc.CalculadoraIMC
import listaTarefas.toDoList


fun main(args: Array<String>) {

    println(" ------------------------ Atividades de Revisão ------------------------ ")
    println()
    println()

    println("Escolha uma das opções abaixo: ")
    println()
    println("1 - Calculadora de IMC")
    println("2 - Calculadora Estatística")
    //println("3 - Sistema de Cadastro de Usuarios")
    //println("4 - Lista de Tarefas")
    //println("5 - Sair")
    println()

    print("Digite a opção desejada: ")
    val opcaoEscolhida = readln().toInt()

    // ----------> Instanciando e chamando a classe CalculadoraIMC
    val calculadoraEstatica = CalculadoraEstatica()

    // ----------> Instanciando e chamando a classe CalculadoraIMC
    val calculadoraIMC = CalculadoraIMC()

    // ----------> Instanciando e chamando a classe Crud
    val crud = Crud()

    // ----------> Instanciando e chamando a classe toDoList
    val toDoList = toDoList()

    when (opcaoEscolhida) {
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