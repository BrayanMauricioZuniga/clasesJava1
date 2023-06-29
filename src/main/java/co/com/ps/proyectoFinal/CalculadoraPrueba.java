package co.com.ps.proyectoFinal;

import java.util.Scanner;

public class CalculadoraPrueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int OP;
        System.out.println("----------------------------");
        System.out.println("     Calculadora Básica     ");
        System.out.println("----------------------------");
        System.out.println("Digite el primer número: ");
        Double A = scanner.nextDouble();
        //operaciones.setNum1(A);
        System.out.println("Digite el segundo número: ");
        Double B = scanner.nextDouble();
        //operaciones.setNum2(B);
        System.out.println("Operaciones a realizar");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Mulitiplicación ");
        System.out.println("4. Potenciación ");
        System.out.println("5. División ");
        System.out.println("6. Salir ");
        System.out.println("");

        boolean isSalir = false;

        do {
            System.out.println("");
            System.out.println("Digite la operación que desea realizar : ");
            OP = scanner.nextInt();

            switch (OP) {
                case 1:
                    System.out.println("1. Suma ");
                    double suma = operaciones.sumar(A,B);
                    System.out.println("la suma de "+A+" mas "+B+" es igual a "+suma);
                    break;
                case 2:
                    System.out.println("2. Resta ");
                    double resta = operaciones.restar(A,B);
                    System.out.println("la resta de "+A+" menos "+B+" es igual a "+resta);
                    break;
                case 3:
                    System.out.println("3. Mulitiplicación ");
                    double producto = operaciones.multiplicar(A,B);
                    System.out.println("El produncto de "+A+" por "+B+" es igual a "+producto);
                    break;
                case 4:
                    System.out.println("4. Potenciación ");
                    double potencia = operaciones.potenciar(A, B);
                    System.out.println(A+" elevado a la "+B+" es igual a "+potencia);
                    break;
                case 5:
                    System.out.println("5. División ");
                    if (B == 0) {
                        System.out.println("No es posible dividir entre cero");
                    }else {
                        double division = operaciones.dividir(A,B);
                        System.out.println("La division de "+A+" entre "+B+" es igual a "+division);
                    }
                    break;
                case 6:
                    System.out.println("6. salir");
                    isSalir = true;
                    break;
                default:
                    System.out.println("Valor no válido");
                    break;
            }
        }while(isSalir == false );

    }
}
