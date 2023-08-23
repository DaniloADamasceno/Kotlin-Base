package constant

import java.text.DecimalFormat
import java.util.*

fun main(args: Array<String>) {

    println("------------ Exercício de Condicionais ---------")
    println()
    println()


//01    -->[x] Crie um programa que pede ao usuário para digitar dois números e imprime qual número é maior.
    println("Digite um número")
    val numOne = readlnOrNull()?.toDoubleOrNull()
    println()

    println("Digite um Segundo número")
    val numTwo = readlnOrNull()?.toDoubleOrNull()

    if (numOne != null && numTwo != null) {
        val maiorNumber = if (numOne > numTwo) {
            numOne
        } else {
            numTwo
        }
        println("O numero maior é $maiorNumber")
    } else {
        println("Entrada invalida. Digite valores validos ")
    }


//02    -->[x] Crie um programa que pede ao usuário para digitar um número e imprime se ele é positivo, negativo ou zero.
    println("Digite um número")
    val numParImpar01 = readlnOrNull()?.toIntOrNull()
    println()

    if (numParImpar01 != null) {
        if (numParImpar01 % 2 == 0) {
            println("O número $numParImpar01 é PAR")
        } else {
            println("O Número $numParImpar01 é IMPAR")
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }


//03    -->[x] Crie um programa que pede ao usuário para digitar o seu nome e idade.
    //        Se a idade for menor que 18, o programa deve imprimir "Você é menor de idade", caso contrário, deve imprimir "Você é maior de idade".

    println("Digite o seu NOME:  ")
    val valueName = readlnOrNull()?.lowercase(Locale.getDefault())
    val resposta = readlnOrNull()?.toCharArray(0)

    println()

    println("Digite a sua IDADE:  ")
    val numIdade = readlnOrNull()?.toIntOrNull()
    println()

    if (valueName == null && numIdade == null) {
        println("Os campos Idade e ou Nome não podem conter valores nulos. Digite novamente ")
    } else if (numIdade!! >= 18) {
        println("$valueName você é maior de idade !!")
    } else {
        println("$valueName você é menor de idade !!")
    }


//04    -->[x] Crie um programa que pede ao usuário para digitar a sua idade e se é estudante.
    //        Se a idade for menor que 18 e não for estudante, o programa deve imprimir "Você é menor de idade e não é estudante",
    //        caso contrário, deve imprimir "Você é maior de idade ou é estudante".


    print("Digite a sua IDADE:  ")
    val numIdade02 = readlnOrNull()?.toIntOrNull()
    println()

    println("Digite:  \n 'S' para SIM ou \n 'N' para NÂO:  ")
    print("Você é ESTUDANTE: ")
    val valueSimNao = readlnOrNull()?.lowercase(Locale.getDefault())
    println()
    if (numIdade02 == null && valueSimNao == null) {
        println("Os campos Idade e ou Nome não podem conter valores nulos. Digite novamente ")
    } else if (numIdade02!! < 18 && valueSimNao == "n") {
        println("Você é menor de idade e não é estudante")
    } else {
        println("Você é maior de idade ou é estudante")
    }


//05    -->[x] Crie um programa que pede ao usuário para digitar o seu salário e imprime o valor com um desconto de 10%.

        print("Digite o valor do seu Salario em Reais: ")
        val salario = readLine()?.toDoubleOrNull()
        println()
        val desconto10Porcento = salario!! * 0.9
        val descontoSalario = salario!! * 0.1

        if (salario == null) {
            println("Dígite um Valor de Salário Válido")
        } else {
            println("O Seu Salário é de: R$ $salario \n" +
                    "Desconto de 10% (R$ $descontoSalario) \n" +
                    "Salário Após Desconto : R$$desconto10Porcento")
        }


//06    -->[x] Crie um programa que pede ao usuário para digitar três números e imprime o maior deles.

    println("------>> Digite 3 Números  ")
    println()
    print("Digite o PRIMEIRO número:  ")
    val numA = readlnOrNull()?.toDoubleOrNull()

    print("Digite o SEGUNDO número:  ")
    val numB = readlnOrNull()?.toDoubleOrNull()

    print("Digite o TERCEIRO número:  ")
    val numC = readlnOrNull()?.toDoubleOrNull()

    if (numA != null && numB != null && numC != null) {
        val maiorNumber = if (numA > numB && numA > numC) {
            numA
        } else if (numB > numA && numB > numC) {
            numB
        } else {
            numC
        }
        println("O número maior é $maiorNumber")
    } else {
        println("Entrada invalida. Digite valores validos !!")
    }


//07    -->[x] Crie um programa que pede ao usuário para digitar um número e imprime se ele é par ou ímpar.

    print("Digite um número:   ")
    val numParImpar = readlnOrNull()?.toDoubleOrNull()
    println()

    if (numParImpar != null) {
        if (numParImpar % 2 == 0.0) {
            println("O número $numParImpar é PAR")
        } else {
            println("O Número $numParImpar é IMPAR")
        }
    } else {
        println("Valor invalido. Digite um valor valido")
    }


//08    -->[x] Crie um programa que pede ao usuário para digitar a temperatura em Celsius e imprime a temperatura em Fahrenheit
    //        (fórmula: (C * 9/5) + 32).Faça um programa que pede ao usuário para digitar uma letra e imprime se é uma vogal ou uma consoante.

        print("Digite a temperatura em Celsius:  ")
        val tempCelsius = readlnOrNull()?.toDoubleOrNull()
        println()

        if (tempCelsius != null) {
            val tempFahrenheit = (tempCelsius * 9 / 5) + 32
            println("A temperatura em Fahrenheit é: $tempFahrenheit F")
        } else {
            println("Valor invalido. Digite um valor valido")
        }



//09    -->[x] Crie um programa que pede ao usuário para digitar o seu peso e altura e calcula o seu índice de massa corporal
    //        (IMC) (fórmula: peso / altura²). Em seguida, o programa deve imprimir se o usuário está abaixo do peso, no peso normal,
    //        com sobrepeso, obeso ou muito obeso

    print("Digite o seu PESO em Kg:  ")
    val peso = readlnOrNull()?.toDoubleOrNull()
    println()
    print("Digite a sua ALTURA em centímetros(cm):  ")
    val altura = readlnOrNull()?.toDoubleOrNull()
    println()

    if (peso != null && altura != null) {
        val imc = (peso / (altura * altura)) * 10000

        val formatIMC = DecimalFormat("##.##")
        val formatTwoIMC = formatIMC.format(imc)


        println("O seu IMC é: $formatTwoIMC")
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