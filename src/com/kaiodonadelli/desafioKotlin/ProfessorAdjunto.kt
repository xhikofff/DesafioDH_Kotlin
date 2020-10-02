package com.kaiodonadelli.desafioKotlin

class ProfessorAdjunto(
        codigo: Int,
        nome: String,
        sobrenome: String,
        val horasMonitoria: Int?) : Professor(codigo, nome, sobrenome) {

//    init {
//        println("\nInstanciando objeto Professor Adjunto com os seguintes parâmetros:")
//        println("\"${this.codigo} - ${this.nome} ${this.sobrenome}\", ${this.horasMonitoria} horas de monitoria.")
//    }

}