package br.com.studant;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções", "Ane");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando Aula", 19));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

        Aluno a1 = new Aluno("Alice Rocha", 2122312);
        Aluno a2 = new Aluno("Bruno Rocha", 2122312);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);

        System.out.println("Todos os alunos matriculados:");
        javaColecoes.getAlunos().forEach(a -> {
                    System.out.println(a);
                }
        );
    }
}
