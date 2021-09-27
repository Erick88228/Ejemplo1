
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Ejemplo1 {

    //aqui van Metodos funciones variables
    int numero;
    
    public void suma (){  //Procedimiento
        int numero1=5;   // variables
        int numero2=5;
        int numero3=numero1+numero2;
        
        System.out.println(numero3);     
    }
    
    
     public void resta (){
         
     
        int numero1=6;
        int numero2=5;
        int numero3=numero1-numero2;
        
        System.out.println(numero3);
     }
     
      public void multiplicacion (){
         
     
        int numero1=6;
        int numero2=5;
        int numero3=numero1*numero2;
        
        System.out.println(numero3);
     }
      public void sumaP(int numero1, int numero2){
          int numero3=numero1+numero2;
        System.out.println("Resultado: "+numero3);  
      }
        
    public static void main(String[] args) {
        // Aqui llamo metodos variales y funciones
        
        Ejemplo1 func=new Ejemplo1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Primer Numero");
        int n1=sc.nextInt();
        System.out.println("Segundo Numero");
        int n2=sc.nextInt();
        
        func.sumaP(n1, n2);
        
      // Funciones Metodos e instancias Estudair concepto en java  
        
        
      /*func.suma();
        func.resta();
        func.multiplicacion();
        func.sumaP(7, 10); */
    }
    
}
