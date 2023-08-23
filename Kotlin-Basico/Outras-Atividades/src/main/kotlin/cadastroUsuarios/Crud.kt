package cadastroUsuarios

class Crud {

    //CRUD: Sistema de cadastro de Usuário com Dados do usuário:

    //      Id (int) => preenchido automaticamente por números randômicos
    //      Nome completo (string)
    //      Email (string) => validação do campo: verificar se o caractere "@" aparece
    //      Sexo (string) => validação do campo: aceitar somente as palavras Feminino, Masculino e Indiferente
//          Endereço (string)
    //      Altura (double) => validação do campo: aceitar valores entre 1 e 2 m.
    //      Vacina (int) => validação de 1 para sim e 0 para não

    //  Implemente um algoritmo que:
    //  inclua até 1000 usuários;
    //  edite um usuário;
    //  exclua um usuário;
    //  busque um usuário pelo email;
    //  imprima todos os usuários cadastrados;
    //  Obrigatório uso de vetor e função.

    fun cadastroUsuarios() {

        println("------------ Sistema de Cadastro de Usuários ---------")
        println()
        println()

        println("Escolha uma das opções abaixo: ")
        println()
        println("1 - Cadastrar Usuário")
        println("2 - Editar Usuário")
        println("3 - Excluir Usuário")
        println("4 - Buscar Usuário")
        println("5 - Imprimir Usuários Cadastrados")
        println("6 - Sair")
        println()

        print("Digite a opção desejada: ")
        val opcaoCRUD = readln().toInt()

        when (opcaoCRUD) {
            1 -> {
                println()
                println("Você escolheu a opção 1 - Cadastrar Usuário")
                println() //Método
            }
            2 -> {
                println()
                println("Você escolheu a opção 2 - Editar Usuário")
                println()//Método
            }
            3 -> {
                println()
                println("Você escolheu a opção 3 - Excluir Usuário")

            }
            4 -> {
                println()
                println("Você escolheu a opção 4 - Buscar Usuário")
                println()//Método
            }
            5 -> {
                println()
                println("Você escolheu a opção 5 - Imprimir Usuários Cadastrados")
                println()//Método
            }
            6 -> {
                println()
                println("Você escolheu a opção 6 - Sair")
                println()//Método
            }
            else -> {
                println()
                println("Opção inválida!")
                println()//Método
            }
        }
    }



}

