package ej18e;

import java.util.Scanner;

public class Ej18e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        
        int[] vector = new int[tam];
        int suma = 0;
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un número para la posición " + i);
            vector[i] = leer.nextInt();
        }
        
        for (int i = 0; i < tam; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de los valores del vector es de: " + suma);
        
    }
    
}
