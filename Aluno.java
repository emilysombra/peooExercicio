package peoo5;

import java.util.ArrayList;

/**
 *
 * @author marcos-sombra
 */
public class Aluno {
    //atributos
    private String nome;
    private final long matricula;
    private int semestre;
    private ArrayList<Cadeira> cadeiras;
    //construtores
    public Aluno(long m) {
        this.matricula = m;
        this.semestre = 1;
    }
    public Aluno(long m, String nome) {
        this.matricula = m;
        this.semestre = 1;
        this.nome = nome;
    }
    //getters    
    public long getMatricula(){
        return this.matricula;
    }

    public ArrayList<Cadeira> getCadeiras() {
        return cadeiras;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getSemestre() {
        return semestre;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
