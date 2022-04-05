package ej8e;

import java.util.Scanner;

public class Ej8e {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador1 = 0;
        int contpares = 0;
        int contimp = 0;
        int larg;
        

        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            String numcadena = String.valueOf(num);
            larg = numcadena.length();
            
            if (!"0".equals(numcadena.substring(larg-1,larg)) && !"5".equals(numcadena.substring(larg-1,larg)) && !"1".equals(numcadena.substring(larg-1,larg))) { //if no es multiplo de 5
                if (num > 1) {
                    contador1 ++;                    
                    suma += + num;
                    if (num % 2 == 0) {
                        contpares ++;
                    } else if (num % 2 != 0) {
                        contimp ++;
                    }
                }
            } else {
                break;
            }
        } while (true);
        
        System.out.println("Cantidad de números ingresados " + contador1);
        System.out.println("Suma de números ingresados " + suma);
        System.out.println("Cantidad de números pares ingresados " + contpares);
        System.out.println("Cantidad de números impares ingresados " + contimp);

    }

}
