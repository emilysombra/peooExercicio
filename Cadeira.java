package peoo5;

import java.util.ArrayList;

/**
 *
 * @author marcos-sombra
 */
public class Cadeira {
    //atributos
    private ArrayList<Aluno> alunos;
    //getters
    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }
    //setters
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    //métodos
    public void cadastrarAluno(Aluno a){
        getAlunos().add(a);
    }
    
}
