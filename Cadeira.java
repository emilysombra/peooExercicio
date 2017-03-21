package peoo5;

import java.util.ArrayList;

public class Cadeira {
    //atributos
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    //contrutor
    public Cadeira(String cadeira){
        this.nome = cadeira;
    }
    //getters
    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }
    
    //setters
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    //métodos
    public void cadastrarAluno(Aluno a){
        getAlunos().add(a);
        a.getCadeiras().add(new Pair(this, "Cursando"));
    }
    
}
