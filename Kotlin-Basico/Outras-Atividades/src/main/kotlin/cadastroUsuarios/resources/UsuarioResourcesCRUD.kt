package cadastroUsuarios.resources
import cadastroUsuarios.entities.Usuario

class UsuarioResourcesCRUD {

    // Instanciando a classe Usuario
    var usuario = Usuario(0, "", "", "", "", 0.0, 0.0, 0)


    fun cadastrarUsuario() {
        println("  -----------------------  Cadastrar Usuario  -----------------------  ")
        println()


    }

    fun listarUsuarios() {
        println("  -----------------------  Listar Usuarios  -----------------------  ")
        println()


    }

    fun atualizarUsuario() {
        println("  -----------------------  Atualizar Usuario  -----------------------  ")
    }

    fun deletarUsuario() {
        println("  -----------------------  Deletar Usuario  -----------------------  ")
    }

    fun buscarUsuario() {
        println("  -----------------------  Buscar Usuario  -----------------------  ")
    }
}