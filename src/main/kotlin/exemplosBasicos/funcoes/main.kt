package exemplosBasicos.funcoes

fun main(){
    val f = ::teste //assinala a variavel F como função [:() -> unit] tipo
    println(f()) //executa a função

    val fClasse = Teste() // assinala variavel fClasse como chamada e executa invoke da classe
    println(fClasse())

    val fLambda: () -> Unit = { // o tipo pode ser impicito : () -> Unit
        println("Executa lambda !")
    }
    println(fLambda())

    val fAnonima: () -> Unit = fun() {
        println("Executa aninima !")
    }
    println(fAnonima())
}

fun teste(){
    println("Teste função para variavel")
}

class Teste:() -> Unit{
    override fun invoke() {
        println("Executa o que estiver dentro do invoke")
    }

}