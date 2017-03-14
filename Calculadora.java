package peoo4;

public class Calculadora {
    double soma(double a, double b){
        return a+b;
    }
    
    double subtracao(double a, double b){
        return a-b;
    }
    
    double multiplicacao(double a, double b){
        return a*b;
    }
    
    double divisao(double a, double b){
        return a/b;
    }
    double radiciacao(double a){
        return Math.sqrt(a);
    }
    
    double potenciacao(double a, double b){
        return Math.pow(a, b);
    }
}
