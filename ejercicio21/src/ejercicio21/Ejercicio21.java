package ejercicio21;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random aleat = new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector[i] = aleat.nextInt(20);
        }
        
        System.out.println("Ingrese el numero a buscar:");
        int num = leer.nextInt();
        
        boolean band = false;
        
        for (int i = 0; i < tam; i++) {
            
            if (vector[i] == num) {
                System.out.println("El número se ha encontrado en la posición " + i);
                band = true;
            }
            
        }
        
        if (band == false) {
            System.out.println("El número no ha sido encontrado");
        }
        
    }
    
}
