package calculadora;

public class Calculadora {

    public Calculadora(){
        
    }
    
    public double soma(double num1, double num2){
        
        return num1 + num2;
        
    }
    
    public double subtracao(double num1, double num2){
        
        return num1 - num2;
        
    }
    
    public double divisao(double num1, double num2){
        
        return num1 / num2;
        
    }
    
    public double multiplicacao(double num1, double num2){
        
        return num1 * num2;
        
    }
    
    public double porcentagem(double num1, double num2){
        
        return num1 * (num2 / 100);
        
    }
    
    public double potencia(double num1, double num2){
        
        return Math.pow(num1, num2);
                
    }
    
    public double raiz(double num1){
        
        return Math.sqrt(num1);
        
    }
}
