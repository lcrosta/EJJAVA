package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese temperatura en grados centigrados");
        int grados = leer.nextInt();
        
        int grados2 = 32+(9*grados/5);
        
        System.out.println("En grados Fahrenheit es: " + grados2);
    }
    
}
