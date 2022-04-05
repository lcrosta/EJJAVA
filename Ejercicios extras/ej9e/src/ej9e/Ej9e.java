package ej9e;

import java.util.Scanner;

public class Ej9e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo");
        int dividendo = leer.nextInt();
        
        System.out.println("Ingrese el divisor");
        int divisor = leer.nextInt();
        
        int resta;
        
        resta = dividendo - divisor;
        
        int contador = 1;
        
        do {
            resta = resta - divisor;
            contador++;
        } while (resta >= divisor);
        
        System.out.println("El residuo es " + resta);
        System.out.println("El cociente es " + contador);
        
        
    }
    
}
