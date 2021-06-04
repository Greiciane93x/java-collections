package br.com.studant;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções", "Ane");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando Aula", 19));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

        Aluno a1 = new Aluno("Alice Rocha", 2122312);
        Aluno a2 = new Aluno("Bruno Rocha", 2122312);
        Aluno a3 = new Aluno(" Teste não está matriculado", 312312);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);

        System.out.println("Todos os alunos matriculados:");
        javaColecoes.getAlunos().forEach(a -> {
                    System.out.println(a);
                }
        );

        System.out.println("O aluno "+ a1+ "está matriculado");
        System.out.println("O aluno" + a3+ "não está matriculado");
        System.out.println(javaColecoes.estaMatriculado(a1));
        System.out.println(javaColecoes.estaMatriculado(a3));


        Aluno TesteAssis = new Aluno("Assis Test2", 23123213);
        System.out.println("E o Aluno acima, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(TesteAssis));


        // A comparação aqui é da referência, não do conteúdo
        System.out.println(a1 == TesteAssis);
    }
}
