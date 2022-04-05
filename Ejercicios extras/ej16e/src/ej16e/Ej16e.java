package ej16e;

import java.util.Scanner;

public class Ej16e {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();

        String[] nom = new String[cant];
        int[] edad = new int[cant];

        rellenar(edad, nom, cant, leer);
        String r;
        
        for (int i = 0; i < cant; i++) {
            
            do {
                System.out.print(nom[i] + " ");
                System.out.print(edad[i] + " ");
                if (edad[i] >= 18) {
                    System.out.print("Mayor de edad");
                } else {
                    System.out.print("Menor de edad");
                }
                System.out.println("¿Desea seguir mostrando? No/Si");
                r = leer.next();
                
                if (!"No".equals(r)) {
                    break;
                }

            } while (!"No".equals(r));
            
            if (!"No".equals(r)) {
            } else {
                break;
            }
        }

    }

    public static void rellenar(int[] edad, String[] nom, int cant, Scanner leer) {
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona número " + (i + 1));
            nom[i] = leer.next();
            System.out.println("Ingrese su edad");
            edad[i] = leer.nextInt();
        }

    }

}
