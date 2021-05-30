package br.com.studant;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Alice");
        alunos.add("Ane");
        alunos.add("Maria");

        boolean AneEstaMatriculada = alunos.contains("Ane");
        System.out.println(AneEstaMatriculada);
        alunos.remove("Maria");

        System.out.println(alunos);

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });


        
    }
}
