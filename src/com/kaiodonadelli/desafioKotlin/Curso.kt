package com.kaiodonadelli.desafioKotlin

class Curso(
        val codigo: Int? = null,
        val nome: String? = null,
        val maxAlunos: Int? = null) {

    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    var listaAlunos = mutableListOf<Aluno>()

//    init {
//        println("\nInstanciando objeto Curso com os seguintes parâmetros:")
//        println("\"${this.codigo} - ${this.nome}\", limite de ${this.maxAlunos} alunos")
//        println("Prof. tit.: ${this.professorTitular}. Prof. Adj.: ${this.professorAdjunto}")
//        println("Lista de alunos: ${this.listaAlunos}")
//    }

    override fun equals(other: Any?): Boolean {
        other as Curso
        return this.codigo == other.codigo
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (this.listaAlunos.size < maxAlunos!!) {
            println("Aluno \"${umAluno.nome} ${umAluno.sobrenome}\" cadastrado no curso ${this.nome}")
            listaAlunos.add(umAluno)
            return true
        } else {
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        if (listaAlunos!!.contains(umAluno)) {
            listaAlunos.remove(umAluno)
            println("Aluno \"${umAluno.nome} ${umAluno.sobrenome}\" removido do curso ${this.nome}")
        } else {
            println("Aluno não matriculado no curso ${this.nome}")
        }
    }

}