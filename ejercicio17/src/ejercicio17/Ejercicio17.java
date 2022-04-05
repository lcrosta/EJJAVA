package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        Scanner altura = new Scanner(System.in);
        
        System.out.println("Ingrese la altura del cuadrado:");
        int alt = altura.nextInt();
        
        ///Linea superior del cuadrado
        for (int i = 0; i < alt; i++) {
            System.out.print("*");   
        }
        
        System.out.println("");
        
        ///Centro del cuadrado
        for (int i = 0; i < alt-2; i++) {
            System.out.print("*");
            for (int j = 0; j < alt-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        ///Linea inferior del cuadrado
        for (int i = 0; i < alt; i++) {
            System.out.print("*");   
        }
        
    }
    
}
