
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.Assert.assertEquals;
import calculadora.Calculadora;
import junit.framework.TestCase;

public class CalculadoraTeste extends TestCase{
    
   @Test
   public void testaSoma(){
       
       double num1 = 10.0;
       double num2 = 10.0;
       double retorno = 20.0;
       
       double resultado = new Calculadora().soma(num1, num2);
       
       assertEquals(retorno, resultado);
       
   }
    
   @Test 
   public void testaSubtracao(){
       
       double num1 = 10.0;
       double num2 = 2.00;
       double retorno = 8.0;
       
       double resultado = new Calculadora().subtracao(num1, num2);
              
       assertEquals(retorno, resultado);
       
   }
   
   @Test 
   public void testaDivisao(){
      
       double num1 = 10.0;
       double num2 = 2.00;
       double retorno = 5.00;
       
       double resultado = new Calculadora().divisao(num1, num2);
       
       assertEquals(retorno, resultado);
       
   }
   
   @Test
   public void testaMultiplicacao(){
       
       double num1 = 100.00;
       double num2 = 2.00;
       double retorno = 200;
       
       double resultado = new Calculadora().multiplicacao(num1, num2);
               
       assertEquals(retorno, resultado);
       
   }
   
   @Test 
   public void testaPorcentagem(){
       
       double num1 = 100.0;
       double num2 = 20.0;
       double retorno = 20.0;
       
       double resultado = new Calculadora().porcentagem(num1, num2);
       
       assertEquals(retorno, resultado);
       
   }
   
   @Test
   public void testaPotencia(){
       
       double num1 = 10.0;
       double num2 = 2.0;
       double retorno = 100.0;

       double resultado = new Calculadora().potencia(num1, num2);
       
       assertEquals(retorno, resultado);
       
   }
   
   @Test
   public void testaRaiz(){
       
       double num1 = 49.0;
       double retorno = 7.0;
       
       double resultado = new Calculadora().raiz(num1);
       
       assertEquals(retorno, resultado);
       
   }
   
}
