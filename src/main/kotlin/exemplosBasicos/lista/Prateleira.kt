package exemplosBasicos.lista

data class Prateleira(
    val genero: String,
    val livros: List<Livro> //tipo List nao é mutavel
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor } //sortedBy retorna uma nova lista ordenada
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}