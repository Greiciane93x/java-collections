package br.com.studant;

import java.util.List;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {


        Curso javaColecoes = new Curso("Curso Teste dominando", "Ane Assis");

        javaColecoes.adiciona(new Aula("Travalhando com ArrayList", 12));
        javaColecoes.adiciona(new Aula("Travalhando com Collections", 13));
        javaColecoes.adiciona(new Aula("Travalhando com Set", 14));

        Aluno a1 = new Aluno("Assis Ane", 21321);
        Aluno a2 = new Aluno("Assis Ane 2", 21321321);
        Aluno a3 = new Aluno("Assis Ane 3", 21322311);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

       Aluno aluno =  javaColecoes.buscaMatriculado(333);
       System.out.println("aluno: " + aluno);


    }
}
