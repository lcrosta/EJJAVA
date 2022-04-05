package ej7e;

import java.util.Scanner;

public class Ej7e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuántos números desea ingresar?");
        int cant = leer.nextInt();
        
        int max = 0;
        int min = 0;
        float promedio;
        int suma = 0;
        int contador = 0;
        int contador2 = 0;
        
        System.out.println("Ingrese un número");
        
        do {
            int num = leer.nextInt();
            while (contador2 < 1) {
                contador2++;
                min = num;
            }
            suma += + num;
            contador++;
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            
        } while (contador < cant);
        
        promedio = suma/cant;
        
        System.out.println("El mayor número fue: " + max);
        System.out.println("El menor número fue: " + min);
        System.out.println("Promedio: " + promedio);
        
        
    }
    
}
