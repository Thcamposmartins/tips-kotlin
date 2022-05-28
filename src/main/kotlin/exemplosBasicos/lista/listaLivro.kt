package exemplosBasicos.lista

fun main() {
    val livro1 = Livro(
        titulo = "Grande sertao veredas",
        autor = "João Guimaraes Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morly",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livros: MutableList<Livro> = mutableListOf(livro1, livro2)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimaraes Rosa",
            anoPublicacao = 1946,
        ))// adiciona outro elemnto na lista
    //livros.remove(livro2)// remove o elemnto passado por parametro da lista

   // livros.imprimirComMarcadores()
    livros.sorted().imprimirComMarcadores()
    livros.sortedBy { it.titulo }.imprimirComMarcadores()
    livros
        .filter { it.autor == "João Guimaraes Rosa" } //it.autor.startsWith("João")
        .sortedBy { it.anoPublicacao }
        .imprimirComMarcadores()

    //////////////////////////////////////////////////////////////////////////////////
    val prateleira = Prateleira(genero = "Literartura", livros)
    prateleira.organizarPorAutor().imprimirComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimirComMarcadores()

}

fun List<Livro?>.imprimirComMarcadores(){
    val formattedList = this
        .filterNotNull()
        .joinToString(separator = "\n"){
        " - ${it.titulo} <-> ${it.autor}"
    }
    println("------Lista de livros------\n${formattedList}\n")
}