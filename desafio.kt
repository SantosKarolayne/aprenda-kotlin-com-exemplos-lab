enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Crie alguns objetos de exemplo
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)

    val formacao = Formacao("Desenvolvimento Android", listOf(conteudo1, conteudo2))

    // Matricule usuários na formação
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprima a lista de inscritos
    println("Usuários matriculados na formação ${formacao.nome}:")
    for (usuario in formacao.inscritos) {
        println("- $usuario")
    }
}

