package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    System.out.println ("Ingrese un número");
    int num1 = leer.nextInt();
 
    System.out.println("Ingrese el otro número");
    int num2 = leer.nextInt();
    
    int suma = num1 + num2 ;
    
    System.out.println("La suma de los dos números es " + suma);
    
    }
    
}

