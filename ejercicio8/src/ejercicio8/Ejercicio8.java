package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        if ("eureka".equals(frase)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
