package calculadorIMC

import java.text.DecimalFormat

fun main() {


//      Calculadora de IMC:
    // O usuário deve ser capaz de inserir informações de nome, altura e peso para que seja feito o cálculo de IMC
    // dele, nisso de um retorno de função com o resultado do IMC dando dicas do que ele pode fazer para ter o IMC ideal

    println("------------ Calculadora de IMC ---------")
    println()
    println()

    print("Digite seu nome:   ")
    val nome = readlnOrNull()
    println()
    println("Olá ${nome!!.toUpperCase()}, vamos calcular seu IMC")

    println()
    println()

    println(" ********** Digite sua altura em cm, Exemplo: 170  ********** ")
    print("Digite a sua ALTURA em centímetros(cm):  ")
    val altura = readlnOrNull()?.toDoubleOrNull()
    println()

    print("Digite o seu PESO em Kg:  ")
    val peso = readlnOrNull()?.toDoubleOrNull()
    println()


    if (peso != null && altura != null) {
        val imc = (peso / (altura * altura)) * 10000

        // Converter para duas casas decimais
        val formatIMC = DecimalFormat("##.##")
        val formatTwoIMC = formatIMC.format(imc)

        println("${nome.toUpperCase()} o seu IMC é: $formatTwoIMC")
        if (imc < 18.5) {
            println("Você está ABAIXO do peso, Atenção !!")
        } else if (imc >= 18.5 && imc < 25) {
            println("Você está no PESO NORMAL")
        } else if (imc >= 25 && imc < 30) {
            println("Você está com SOBREPESO, Atenção !!")
        } else if (imc >= 30 && imc < 35) {
            println("Você está OBESO, Procure um médico")
        } else {
            println("Você está MUITO OBESO, Procure um médico")
        }
    } else {
        println("Valor invalido. Digite um valor valido")

    }
}
