package eje6;

import java.util.Scanner;

public class Eje6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese de cuantos sera la muestra");
        int cant = leer.nextInt();

        float suma = 0;
        int contador = 0;
        float suma2 = 0;

        float[] altura = new float[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la altura de la persona número " + (i + 1));
            altura[i] = leer.nextFloat();
        }
        for (int i = 0; i < cant; i++) {
            if (altura[i] < 1.60) {

                suma += altura[i];
                contador += +1;
            }
            suma2 += altura[i];
        }

        if (contador > 0) {
            System.out.println("La estatura media de los que miden menos de 1.60 es de: " + (suma / contador));
        }
        
        System.out.println("La estatura media en general es de: " + (suma2 / cant));

    }

}
