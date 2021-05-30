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


        // Um conjunto não aceita elementos repetidos.
        // Um Set garante que nenhum elemento se repita. Por isso,
        // o método add(..) devolve um booleano que indica sucesso da
        // inserção
        // --------------------------
        // Há métodos que fazem busca por um
        // objeto, como contains(..) ou remove(..),
        // que são muito mais rápidos se comparado com uma lista
        // Um conjunto não garante a ordem de inserção

    }
}
