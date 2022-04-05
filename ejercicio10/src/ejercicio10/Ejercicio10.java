package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        
        if ("A".equals(frase.substring(0,1))) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("INCORRECTO");
        }
                
    }
    
}
