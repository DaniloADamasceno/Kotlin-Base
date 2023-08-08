import java.text.DecimalFormat

//  ---> https://www.jdoodle.com/compile-kotlin-online/


fun main(args: Array<String>) {

    println("<<--------   Exemplo Inicial de Variáveis   -------->>")
    val x: Int = 10
    val y: Int = 25

    val z = x + y

    println("The sum of $x + $y is  $z")
    println()
    //?----------------------    Exercícios propostos no Curso de Desenvolvedor Android   ------------------------------


    println("<<--------   Exercício 01 - Declaração de Variáveis em Kotlin   -------->>")
    println()
    println()


    // [x] Declare uma variável do tipo Double com o valor 3.14.
    val variablePi: Double = 3.1415
    println("--> Double : $variablePi")

    // [x] Declare uma variável do tipo Boolean com o valor true.
    val valueTrue: Boolean = true
    println("--> Boolean : $valueTrue")

    // [x] Declare uma variável do tipo String com o valor "Hello, world!".
    val textInicial: String = "Hello, world!"
    println("--> String : $textInicial")

    // [x] Declare uma variável do tipo “Int” com o valor 10 e uma variável do tipo String com o valor "20".
    val inteiro10: Int = 10
    println("--> Integer :  $inteiro10")
    val stringInt: String = "20"


    // [x] Converta a variável String para um “Int” e some as duas variáveis Int.
    val convertString = Integer.parseInt(stringInt)
    val convertString2 = stringInt.toInt()

    println("Soma entre a Variável 'stringInt' com a Variável 'inteiro10' é: $convertString utilizando a primeira alternativa")
    println("Soma entre a Variável 'stringInt' com a Variável 'inteiro10' é: $convertString2 utilizando a segunda alternativa")
    println()
    println()

    //[x]Declare uma variável do tipo Char com o valor 'a' e uma variável do tipo “Int” com o valor 1. Some a variável Char com a variável Int.
    val charText: Char = 'a'
    println("--> Char : $charText")
    val valueOne: Int = 1
    println("--> Integer : $valueOne")

    val charConvert: Int = charText.toInt()             // a forma correta seria utilizando o método .code
    println("A soma de um Char com um Int declarados anteriormente é: $charConvert")
    println()
    println()

    /* [x] Declare uma variável do tipo Double com o valor 5.5 e outra variável do tipo “Int” com o valor 3.
          Realize a divisão desses dois números e imprima o resultado na tela.
    */
    val duplo5: Double = 5.5
    println("--> Double = $duplo5 ")
    val inteiro3: Int = 3
    println("--> Inteiro = $inteiro3 ")


    val inteiroDouble: Double = inteiro3.toDouble()     // Conversão Inteiro para Double
    println("--> convertido Inteiro em Double = $inteiroDouble")

    val divDoubleInt = duplo5 / inteiroDouble


    // para converter as casas em decimal com o DecimalFormat
    val formatTwo = DecimalFormat("#.##")
    val valueTwoDeci = formatTwo.format(divDoubleInt)
    println(
        "--> a divisão entre '5.5' e 3 é:$divDoubleInt          " +
                "\n  Após a Conversão para duas casas Decimais : $valueTwoDeci"
    )
    println()
    println()

    // [x] Declare uma variável do tipo Boolean com o valor false. Em seguida, altere o valor da variável para true e imprima o resultado na tela.
    var invertBoolean: Boolean = false
    println("--> A Variável invertBoolean (Boolean) declarada inicialmente é : $invertBoolean")

    invertBoolean = true
    println("--> A Variável invertBoolean (Boolean) declarada posteriormente é : $invertBoolean")

    /* [x]Declare uma variável do tipo String com uma frase de sua escolha.
            Utilize o método length para obter o tamanho da frase e imprima o resultado na tela.(frase.length)
     */
    val frase: String = "Aprendendo Kotlin no curso de Desenvolvedor Android"
    println("--> A frase declarada é : $frase")
    println("--> O tamanho da frase é : ${frase.length}")
    println()

    /* [x] Declare uma variável do tipo Char com o valor 'Z' e uma variável do tipo “Int” com o valor 10.
            Some a variável Char com a variável “Int” e imprima o resultado na tela.
     */
    val charZ: Char = 'Z'
    println("--> CharZ = $charZ ")
    val valor10: Int = 10
    println("--> Valor10 = $valor10 ")

    val charConvert2: Int = charZ.code // outra forma de conversão de Char para “Int” é utilizando o método .code
    println("--> O Valor da variável charZ(Char) convertida para Integer é : $charConvert2")

    val soma2 = charConvert2 + valor10
    println("A Soma das variáveis soma2(Int) com charZ(Char) é : $soma2")
}


