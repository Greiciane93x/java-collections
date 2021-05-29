package br.com.studant;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do Java" , "Assis Ane");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.print(aulas);

        aulas.add(new Aula("Arrays", 21));

        System.out.print(aulas);

        System.out.println(javaColecoes.getAulas());

        System.out.println(aulas == javaColecoes.getAulas());

       // javaColecoes.getAulas().add(new Aula("Mais uma aula", 11));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaColecoes.getAulas());
    }
}
