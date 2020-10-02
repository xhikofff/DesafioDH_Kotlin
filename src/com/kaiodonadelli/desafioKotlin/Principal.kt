package com.kaiodonadelli.desafioKotlin

import java.util.*

fun main() {

    val dhmg = DigitalHouseManager()


    dhmg.registrarCurso("Full Stack",20001,3)
    dhmg.registrarCurso("Android",20002,2)

    dhmg.registrarCurso("Para excluir",99999,99)


//  ---


    dhmg.registrarProfessorTitular("Prof1.", "Titular1",1,"Full Stack")
    dhmg.registrarProfessorTitular("Prof2.", "Titular2",2,"Android")

    dhmg.registrarProfessorAdjunto("Prof3.", "Adjunto3",3,50)
    dhmg.registrarProfessorAdjunto("Prof4.", "Adjunto4",4,50)

    dhmg.registrarProfessorTitular("Prof0.", "Titular0",0,"Excluir")
    dhmg.registrarProfessorAdjunto("Prof99.", "Adjunto99",99,0)


//  ---


    dhmg.matricularAluno("Aluno1","SobrAluno1",1)
    dhmg.matricularAluno("Aluno2","SobrAluno2",2)
    dhmg.matricularAluno("Aluno3","SobrAluno3",3)
    dhmg.matricularAluno("Aluno4","SobrAluno4",4)
    dhmg.matricularAluno("Aluno5","SobrAluno5",5)
    dhmg.matricularAluno("Aluno6","SobrAluno6",6)


//  ---


    dhmg.matricularAluno(1,20001)
    dhmg.matricularAluno(2,20001)
    dhmg.matricularAluno(3,20001)
    dhmg.matricularAluno(4,20002)
    dhmg.matricularAluno(5,20002)
    dhmg.matricularAluno(6,20002)


//  ---


    dhmg.alocarProfessores(20001,1,3)
    dhmg.alocarProfessores(20002,2,4)


//  ---


    dhmg.consultaCursoAluno(5)


//  ---


    dhmg.excluirCurso(99999)
    dhmg.excluirAluno(6)
    dhmg.excluirProfessor(0)
    dhmg.excluirProfessor(99)


//  ---


//    println("\n\n- - - - - -")
//    println(dhmg.listaAlunos)
//    println(dhmg.listaCursos)
//    println(dhmg.listaMatriculas)
//    println(dhmg.listaProfessores)


}