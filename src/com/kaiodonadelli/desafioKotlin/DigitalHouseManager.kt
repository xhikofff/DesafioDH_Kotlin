package com.kaiodonadelli.desafioKotlin

import java.util.*

class DigitalHouseManager() {

    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(
            nome: String,
            codigoCurso: Int,
            quantidadeMaximaDeAlunos: Int) {

        val novoCurso = Curso(
                codigoCurso,
                nome,
                quantidadeMaximaDeAlunos)

        listaCursos.add(novoCurso)
        println("\nCurso ${novoCurso.codigo} - \"${novoCurso.nome}\" cadastrado.")
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                listaCursos.remove(curso)
                break
            }
        }
        println("\nCurso ${codigoCurso} excluído.")
    }

    fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            quantidadeDeHoras: Int) {

        val novoProfessorAdjunto = ProfessorAdjunto(
                codigoProfessor,
                nome,
                sobrenome,
                quantidadeDeHoras)

        listaProfessores.add(novoProfessorAdjunto)
        println("\nProfessor adjunto ${novoProfessorAdjunto.codigo} - " +
                "\"${novoProfessorAdjunto.nome} ${novoProfessorAdjunto.sobrenome}\" cadastrado.")
    }

    fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Int,
            especialidade: String) {

        val novoProfessorTitular = ProfessorTitular(
                codigoProfessor,
                nome,
                sobrenome,
                especialidade)

        listaProfessores.add(novoProfessorTitular)
        println("\nProfessor titular ${novoProfessorTitular.codigo} - " +
                "\"${novoProfessorTitular.nome} ${novoProfessorTitular.sobrenome}\" cadastrado.")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (professor in listaProfessores) {
            if (professor.codigo == codigoProfessor) {
                listaProfessores.remove(professor)
                break
            }
        }
        println("\nProfessor ${codigoProfessor} excluído.")
    }

    fun matricularAluno(
            nome: String,
            sobrenome: String,
            codigoAluno: Int) {

        val novoAluno = Aluno(
                codigoAluno,
                nome,
                sobrenome)

        listaAlunos.add(novoAluno)
        println("\nAluno ${novoAluno.codigo} - " +
                "\"${novoAluno.nome} ${novoAluno.sobrenome}\" cadastrado.")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var alunoMatricula = Aluno(codigo = codigoAluno)
        var cursoMatricula = Curso(codigo = codigoCurso)


        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                cursoMatricula = curso
                println("\nCurso ${codigoCurso} encontrado.")
                break
            }
        }
        for (aluno in listaAlunos) {
            if (aluno.codigo == codigoAluno) {
                alunoMatricula = aluno
                println("Aluno ${codigoAluno} encontrado.")
            }
        }
        if (cursoMatricula.adicionarUmAluno(alunoMatricula)) {
            val matricula = Matricula(alunoMatricula, cursoMatricula, Date())
            listaMatriculas.add(matricula)
            println("Matrícula do aluno ${alunoMatricula.codigo} realizada no curso ${cursoMatricula.nome}.")
        } else {
            println("Não há vagas disponíveis no curso ${cursoMatricula.nome}")
        }

    }

    fun excluirAluno(codigoAluno: Int) {
        for (aluno in listaAlunos) {
            if (aluno.codigo == codigoAluno) {
                listaAlunos.remove(aluno)
                break
            }
        }
        println("\nAluno ${codigoAluno} excluído.")
    }


    fun alocarProfessores(codigoCurso: Int, professorTitular: Int, professorAdjunto: Int) {
        for (professor in listaProfessores) {
            if (professor.codigo == professorTitular) {
                for (curso in listaCursos) {
                    if (curso.codigo == codigoCurso) {
                        professor as ProfessorTitular
                        curso.professorTitular = professor
                        println("\nProfessor titular ${professorTitular} alocado ao curso ${curso.nome}.")
                        break
                    }
                }
            } else if (professor.codigo == professorAdjunto) {
                for (curso in listaCursos) {
                    if (curso.codigo == codigoCurso) {
                        professor as ProfessorAdjunto
                        curso.professorAdjunto = professor
                        println("\nProfessor adjunto ${professorAdjunto} alocado ao curso ${curso.nome}.")
                        break
                    }
                }
            }
        }
    }

    fun consultaCursoAluno(codigo: Int) {
        var alunoConsulta = Aluno(codigo = codigo)
        var cursoConsulta = Curso()

        for (aluno in listaAlunos) {
            if (aluno.codigo == codigo) {
                alunoConsulta = aluno
                for (curso in listaCursos) {
                    if (curso.listaAlunos.contains(alunoConsulta)) {
                        cursoConsulta = curso
                        println("\nAluno ${codigo} matriculado no curso: ${cursoConsulta.nome}!")
                        break
                    }
                }
            }
        }
    }

}