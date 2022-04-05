package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un número");
        int num2 = leer.nextInt();
        
        if (num1>num2) {
            
            System.out.println("El número " + num1 + " es mayor a " + num2);
        } else {
            System.out.println("El número " + num2 + " es mayor a " + num1);
        }
        
    }
    
}
