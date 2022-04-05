package ejercicio22;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random aleat = new Random();
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        
        System.out.println("Ingrese tamaño del vector");
        int tam = leer.nextInt();
        
        int[] vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector[i] = aleat.nextInt(99999);
        }
        
        for (int i = 0; i < tam; i++) {
            String numcadena = String.valueOf(vector[i]);
            int largo;
            largo = numcadena.length();
            switch (largo) {
                case 1:
                    contador1 += + 1;
                    break;
                case 2:
                    contador2 += + 1;
                    break;
                case 3:
                    contador3 += + 1;
                    break;
                case 4: 
                    contador4 += + 1;
                    break;
                case 5:
                    contador5 += + 1;
                    break;
            }
            
        }
        
        System.out.println("Cantidad de una cifra: " + contador1);
        System.out.println("Cantidad de dos cifras: " + contador2);
        System.out.println("Cantidad de tres cifras: " + contador3);
        System.out.println("Cantidad de cuatro cifras: " + contador4);
        System.out.println("Cantidad de cinco cifras: " + contador5);
        
    }
    
}
