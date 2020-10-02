package com.kaiodonadelli.desafioKotlin

class ProfessorTitular(
        codigo: Int,
        nome: String,
        sobrenome: String,
        val especialidade: String) : Professor(codigo, nome, sobrenome) {

//    init {
//        println("\nInstanciando objeto Professor Totular com os seguintes parâmetros:")
//        println("\"${this.codigo} - ${this.nome} ${this.sobrenome}\", especialidade: ${this.especialidade}.")
//    }

}