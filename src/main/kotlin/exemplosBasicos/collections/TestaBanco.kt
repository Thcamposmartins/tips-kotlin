package exemplosBasicos.collections


fun testaBanco() {
    val banco = BancoNomes()
    banco.salva("Thais")
    println(banco.nomes)
}

class BancoNomes {
    val nomes: Collection<String> get() = dados.toList() //toList devolve apenas a leitura impossibiliatando a copia e modificação do original

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}
