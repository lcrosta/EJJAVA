package ej11e;

import java.util.Scanner;

public class Ej11e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número para saber cuantos dígitos tiene");
        int num = leer.nextInt();
        
        String numcadena = String.valueOf(num);
        
        System.out.println("La cantidad de dígitos del número es de: " + numcadena.length());
    }
    
}
