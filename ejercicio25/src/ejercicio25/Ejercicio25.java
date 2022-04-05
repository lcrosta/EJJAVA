package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Ingrese un número entre 1 y 9 para la posición [" + i + "][" + j + "]");
                int num = leer.nextInt();

                if (num >= 1 && num <= 9) {

                    matriz[i][j] = num;

                } else {

                    do {
                        System.out.println("Ingrese un valor válido para la posición [" + i + "][" + j + "]");
                        num = leer.nextInt();

                    } while (num < 1 || num > 9);

                    matriz[i][j] = num;

                }

            }
        }

        int sumadiag = 0;
        int sumadiagsec = 0;
        boolean diags;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumadiag += +matriz[i][j];
                }
                if ((i + j == 2)) {
                    sumadiagsec += +matriz[i][j];
                }
            }
        }

        if (sumadiag == sumadiagsec) {
            diags = true;
        } else {
            diags = false;
        }

        int[] filas = new int[3];

        for (int i = 0; i < 3; i++) {
            filas[i] = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                filas[i] += +matriz[i][j];
            }
        }

        int[] columnas = new int[3];

        for (int i = 0; i < 3; i++) {
            columnas[i] = 0;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                columnas[i] += +matriz[i][j];
            }
        }
        
        boolean band = false;
        
        for (int i = 0; i < 3; i++) {
            if (columnas[0] == columnas[i] && filas[0] == filas[i]) {
                band=true;
            } else {
                band=false;
            }
        }

        if (band == true && diags == true) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");
        }
    }

}
