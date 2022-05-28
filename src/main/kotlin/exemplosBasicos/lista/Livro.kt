package exemplosBasicos.lista

data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao) //delegando a comparação para o compareTo do tipo primitivo long
    }
}