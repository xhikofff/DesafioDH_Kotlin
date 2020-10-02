package com.kaiodonadelli.desafioKotlin

class Aluno(
        val codigo: Int? = null,
        val nome: String? = null,
        val sobrenome: String? = null) {

//    init {
//        println("\nInstanciando objeto Aluno com os seguintes parâmetros:")
//        println("${this.codigo} - \"${this.nome} ${this.sobrenome}\"")
//    }

    override fun equals(other: Any?): Boolean {
        other as Aluno
        return this.codigo === other.codigo
    }


}