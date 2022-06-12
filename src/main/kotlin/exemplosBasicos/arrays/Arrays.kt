package exemplosBasicos.arrays

import java.math.BigDecimal
import java.math.RoundingMode

class Arrays {
    val idades: IntArray = intArrayOf(15 ,25, 32, 47, 50) //inicia um array conforme os parametros passados


fun idade(){
    for(idade in idades){
        //faz algo
    }
    idades.forEach{ idade->
        //faz algo
    }
    idades.forEachIndexed{ i, idade ->
        idades[i] = idade +1
    }

}
    //Função MAP cria um novo array com as condições determiandas
    val idadesCalculadas: Array<Unit> = idades.map{
            idade -> verificaIdade(idade)
    }.toTypedArray()

    private fun verificaIdade(idade: Int) {//ctrl+alt+m extrai a função
        if (idade > 18) {
            println("Ok. maior 18")
        } else {
            println("Não. menor 18")
        }
    }

    //Frunção REDUCE percorre os elementos de um array reduzindo a um unico valor
    fun Array<BigDecimal>.somatoria(): BigDecimal{
      return this.reduce{ acumulador, valor -> acumulador + valor}
    }

    //Função FOLD assemelha a função reduce porem recebe um valor de parametro inicial
    fun Array<BigDecimal>.somaTotalAcumulado(valorInicial: BigDecimal): BigDecimal{
        return  this.fold(valorInicial){
            acc, idade -> acc + (idade*("6").toBigDecimal()).setScale(2,RoundingMode.UP)
        }
    }

    fun ordenacao(){
//        val idadesOrdenadas = idades.sorted() //ordena o array
//        val primeiros = idadesOrdenadas.take(3) // retorna os 3 primeiros itens do array
//        val ultimos = idadesOrdenadas.takeLast(3) //retorna os 3 ultimos itens do array
//        val media = idadesOrdenadas.average() //retorna a media
        val idadesOrdenadas = idades.sorted().takeLast(3).average() // retorna a media das 3 maiores idades

    }

}