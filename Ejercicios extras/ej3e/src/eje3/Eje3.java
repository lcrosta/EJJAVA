package eje3;

import java.util.Scanner;

public class Eje3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        if ("A".equalsIgnoreCase(letra) || "E".equalsIgnoreCase(letra) || "I".equalsIgnoreCase(letra) || "O".equalsIgnoreCase(letra) || "U".equalsIgnoreCase(letra)) {
            System.out.println("El caracter ingresado es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
        
    }
    
}
