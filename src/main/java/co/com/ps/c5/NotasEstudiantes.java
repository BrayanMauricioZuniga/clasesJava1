package co.com.ps.c5;

import java.util.*;
public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[5];


        for (int i=0; i< notas.length;i++){
            System.out.println("Digite la nota del estudiante "+(i+1));
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Elementos del arreglo numerico");
        for (int i=0; i < notas.length; i++){
            System.out.println("numero["+i+"] = "+notas[i]);
        }

        int suma = 0;
        for (int i=0; i < notas.length; i++){
            suma += notas[i];
            //System.out.println(suma);
        }
        System.out.println("promedio = " +(suma/ notas.length));

    }
}
