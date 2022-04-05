package ej23e;

import java.util.Random;
import java.util.Scanner;

public class Ej23e {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random aleat = new Random();

        String[][] sopa = new String[20][20];

        int k;
        int largo;
        int contador = 0;

        do {
            System.out.println("Ingrese una palabra de 3 hasta 5 carácteres");
            String palabra = leer.next();

            k = aleat.nextInt(14);
            largo = palabra.length();

            while (null != sopa[k][0]) {
                k = aleat.nextInt(14);
            }

            if (palabra.length() >= 3 && palabra.length() <= 5) {
                for (int i = k; i <= k; i++) {
                    for (int j = 0; j < largo; j++) {
                        sopa[i][j] = palabra.substring(j, j + 1);
                    }
                }
            } else {
                do {
                    System.out.println("Ingrese una palabra que cumpla con los parametros");
                    palabra = leer.next();
                } while (palabra.length() < 3 || palabra.length() > 5);
                for (int i = k; i <= k; i++) {
                    for (int j = 0; j < largo; j++) {
                        sopa[i][j] = palabra.substring(j, j + 1);
                    }
                }
            }

            contador++;

        } while (contador < 5);

        int num;
        String numcadena;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (null == sopa[i][j]) {
                    num = (int) (Math.random() * 10);
                    numcadena = String.valueOf(num);
                    sopa[i][j] = numcadena;
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
