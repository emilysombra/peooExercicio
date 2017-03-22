package peoo5;

import java.util.ArrayList;

public class Aluno {
    //atributos
    private String nome;
    private final long matricula;
    private int semestre;
    private Curso curso;
    private ArrayList<Pair<Cadeira, String>> cadeiras;
    private String situacaoCurso;
    //construtor
    public Aluno(long m, String nome, Curso c) {
        this.matricula = m;
        this.semestre = 1;
        this.nome = nome;
        this.situacaoCurso = "Graduando";
        this.curso = c;
        this.cadeiras = new ArrayList<>();
        this.curso.getAlunos().add(this);
    }
    //getters    
    public long getMatricula(){
        return this.matricula;
    }
    
    public Curso getCurso(){
        return this.curso;
    }
    
    public String getNomeCurso(){
        return this.curso.getNome();
    }

    public ArrayList<Pair<Cadeira, String>> getCadeiras() {
        return this.cadeiras;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getSemestre() {
        return this.semestre;
    }

    private String getSituacaoCurso() {
        return situacaoCurso;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    private void setSituacao(String sit){
        this.situacaoCurso = sit;
    }

    public void setCurso(Curso curso) {
        if(!(getCurso().equals(curso)))
            this.getCurso().getAlunos().remove(this);
        this.curso = curso;
        this.curso.getAlunos().add(this);
    }

    public void setCadeiras(ArrayList<Pair<Cadeira, String>> cadeiras) {
        this.cadeiras = cadeiras;
    }
    
    //métodos
    public void concluirCurso(){
        if(numCadeirasCursadas() == curso.getCadeiras().size())
            setSituacao("Graduado");
        else
            setSituacao("Desistente");
    }
    public void avancarSemestre(){
        this.semestre++;
    }
    public int numCadeirasCursadas(){
        int cont = 0;
        for (Pair<Cadeira, String> cadeira : this.cadeiras) {
            if("Cursada".equals(cadeira.getSecond()))
                cont++;
        }
        return cont;
    }
    public int cadeirasParaConcluir(){
        return this.curso.getCadeiras().size() - numCadeirasCursadas();
    }
    public void matricularCadeira(Cadeira c){
        for (Cadeira cadeira : this.curso.getCadeiras()) 
            if(c.equals(cadeira)){
                c.getAlunos().add(this);
                getCadeiras().add(new Pair(c, "Cursando"));
            }   
    }
    public void concluirCadeira(Cadeira c){
        for(Pair<Cadeira, String> cadeira : this.cadeiras)
            if(cadeira.getFirst().equals(c))
                cadeira.setSecond("Cursada");
        
    }
    public void desistirCadeira(Cadeira c){
        for(Pair<Cadeira, String> cadeira : this.cadeiras)
            if(cadeira.getFirst().equals(c))
                cadeira.setSecond("Desistente");
        
    }
    public String situacaoCurso(){
        return getSituacaoCurso();
    }
    public String situacaoCadeira(Cadeira c){
        for(Pair<Cadeira, String> cadeira : this.cadeiras)
            if(cadeira.getFirst().equals(c))
                return cadeira.getSecond();
        return null;
    }
      
}
