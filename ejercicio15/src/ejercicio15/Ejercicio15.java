package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = numeros.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = numeros.nextInt();
        
        System.out.println("MENÚ");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        boolean band = true;
        
        do {
            
            System.out.println("ELIJA OPCIÓN");
            Scanner opcion = new Scanner(System.in);
            int opc1 = opcion.nextInt();
            
            switch (opc1) {
                case 1:
                    System.out.println("Suma: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("Resta: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("División: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Seguro desea salir del sistema? (S/N)");
                    Scanner logico = new Scanner(System.in);
                    String opc2 = logico.nextLine();
                    if ("S".equals(opc2)) {
                        band=false;
                    }
            }
            
        } while (band==true);
        
    }
    
}
