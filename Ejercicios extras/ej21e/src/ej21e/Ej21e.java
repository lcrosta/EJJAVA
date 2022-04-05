package ej21e;

import java.util.Scanner;

public class Ej21e {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        float[][] matriz = new float[10][5];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo evaluativo (en escala de 100)");
                        float nota = (float) (leer.nextFloat()*0.10);
                        matriz[i][j] = nota;
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo evaluativo (en escala de 100)");
                        nota = (float) (leer.nextFloat()*0.15);
                        matriz[i][j] = nota;
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer integrador (en escala de 100)");
                        nota = (float) (leer.nextFloat()*0.25);
                        matriz[i][j] = nota;
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo integrador (en escala de 100)");
                        nota = (float) (leer.nextFloat()*0.50);
                        matriz[i][j] = nota;
                        break;
                }
            }
        }
        
        float suma = 0;
        int contador1 = 0;
        int contador2 = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }
            matriz[i][4] = (suma);
            suma = 0;
        }
        
        for (int i = 0; i < 10; i++) {
            if (matriz[i][4] >= 7) {
                contador1 += + 1;
            } else {
                contador2 += + 1;
            }
        }
        
        System.out.println("Cantidad de desaprobados: " + contador2);
        System.out.println("Cantidad de aprobados: " + contador1);
        
    }
    
}
