package peoo03;

/**
 *
 * @author Marcos Vinicius Sombra
 */
public class ContaBancária {
    private int numConta;
    private String nomeTitular;
    private double saldo;
    
    public void depositarValor(double quantia){
        this.saldo += quantia;
    }
     public void sacar(double quantia){
         if(this.saldo > 0 && this.saldo > quantia){
             this.saldo -= quantia;
         }
             
     }

    //construtor 
    public ContaBancária(String nome) {
        this.nomeTitular = nome;
    }
     
    //getters
    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
