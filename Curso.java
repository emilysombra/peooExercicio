package peoo5;

import java.util.ArrayList;

public class Curso {
    //lista de atributos
    private ArrayList<Cadeira> cadeiras;
    private ArrayList<Aluno> alunos;
    private String nome;
    //construtor
    public Curso(String curso){
        this.nome = curso;
    }
    //getters
    public ArrayList<Cadeira> getCadeiras() {
        return this.cadeiras;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
    
    public String getNome() {
        return nome;
    }
    //setters
    public void setCadeiras(ArrayList<Cadeira> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //métodos
    public void cadastrarAluno(Aluno a){
        getAlunos().add(a);
    }
    
    public void cadastrarCadeira(Cadeira c){
        getCadeiras().add(c);
    }
}
