package com.kaiodonadelli.desafioKotlin

abstract class Professor (
        val codigo: Int? = null,
        open val nome: String? = null,
        open val sobrenome: String? = null) {

    override fun equals(other: Any?): Boolean {
        other as Professor
        return this.codigo === other.codigo
    }



}