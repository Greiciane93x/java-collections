package br.com.studant;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor){
        super();
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for(Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }
    public int getTempoTotal1(){
        return this.aulas.stream().mapToInt(Aula ::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno a1) {
        return this.alunos.contains(a1);
    }

    public Aluno buscaMatriculado(int i) {

        if(!matriculaParaAluno.containsKey(i))
            throw  new NoSuchElementException();
        return matriculaParaAluno.get(i);
    }

}
