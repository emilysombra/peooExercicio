package peoo5;

import java.util.ArrayList;
/**
 *
 * @author marcos-sombra
 */
public class Curso {
    //lista de atributos
    private ArrayList<Cadeira> cadeiras;
    private ArrayList<Aluno> alunos;
    //getters
    public ArrayList<Cadeira> getCadeiras() {
        return this.cadeiras;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
    //setters
    public void setCadeiras(ArrayList<Cadeira> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    //métodos
    public void cadastrarAluno(Aluno a){
        getAlunos().add(a);
    }
    
    public void cadastrarCadeira(Cadeira c){
        getCadeiras().add(c);
    }
}
