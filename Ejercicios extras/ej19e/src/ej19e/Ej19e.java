package ej19e;

import java.util.Scanner;

public class Ej19e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de los vectores");
        int tam = leer.nextInt();
        
        int[] a = new int[tam];
        int[] b = new int[tam];
        int contador = 0;
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese número para posición " + i);
            a[i] = leer.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese número para la posición " + i);
            b[i] = leer.nextInt();
        }
        
        for (int i = 0; i < tam; i++) {
            if (a[i] == b[i]) {
                contador++;
            }
        }
        if (contador == tam) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son diferentes");
        }
    
    }
    
}
