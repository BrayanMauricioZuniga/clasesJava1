package co.com.ps.c4;

import java.util.*;
public class NotaFinalEstudiante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la nota del estudiante: ");
        Double nota = scanner.nextDouble();

        if (nota >= 3 && nota <=5) {
            System.out.println("Estudiante aprobó");
        } else if (nota < 3 && nota >=0) {
            System.out.println("Estudiante reprobó");
        } else {
            System.out.println("Estudiante no presentó el taller");
        }
    }
}
