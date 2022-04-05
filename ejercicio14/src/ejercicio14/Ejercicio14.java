package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int suma = 0;
        
        do {
            
            contador=contador+1;
            
            System.out.println("Ingrese un número, si ingresa 0 terminará el bucle.");
            int num = leer.nextInt();
            
            if (num>0) {
                suma=suma+num;
            }
            
            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }
            
                
            
        } while (contador<20);
        
        System.out.println("La suma de los números ingresados es de: " + suma);
        
    }
    
}
