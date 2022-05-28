package exemplosBasicos

class ExemplosBasicos {
    //Usando o when para subistituir if alinhados
    val saldo = 100 //nao seta seu valor
    var aux = 0     //aberto seta o seu valor
    var valorRecebido = 20

    val resposta = when {
        saldo > 0 -> println("Valor maior que 0");
        saldo == 0 -> println("Valor igual a 0");
        else -> println("Valor maior que 0");
    }
    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }

    //"companion" compartilha o escopo do obj criado com a classe no qual ele esta inserido mas não com as subclasses
    companion object Contador {
        var total = 0
            private set
    }

    fun login (aluno: Any){
        if(aluno is Aluno){ //recebendo um parametro any, o IS faz a verificação de todos os dados e o cast ao memso tempo
            //faz algo
        }
    }

}
data class Aluno( var nome: String ="th")