package co.com.ps.proyectoFinal;

/*
* Calculadora  semibásica:
* En este proyecto, los estudiantes deberán crear una calculadora básica
* que pueda realizar operaciones aritméticas simples.
*
* El programa debe permitir al usuario ingresar dos números y
* luego elegir una operación (suma, resta, multiplicación,potencia o división)
* para obtener el resultado correspondiente.
*
* El programa debe mostrar el resultado en pantalla de forma clara.
* Conceptos clave: Entrada y salida de datos, variables, operaciones aritméticas básicas,
* estructuras de control (como condicionales o bucles para permitir que el usuario realice
* múltiples operaciones).
 */

import java.util.*;


public class Calculadora {
    public static double sumar (double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public static double restar (double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public static double multiplicar (double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public static double dividir (double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

    public static double potenciar (double num1, double num2) {
        double resultado = Math.pow(num1, num2);;
        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("     Calculadora Básica     ");
        System.out.println("----------------------------");
        System.out.println("Digite el primer número: ");
        Double A = scanner.nextDouble();
        System.out.println("Digite el segundo número: ");
        Double B = scanner.nextDouble();
        System.out.println("Operaciones a realizar");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Mulitiplicación ");
        System.out.println("4. Potenciación ");
        System.out.println("5. División ");
        System.out.println("6. Salir ");
        System.out.println("");



        boolean bandera = true;

        do {
            System.out.println("");
            System.out.println("Digite la operación que desea realizar : ");
            int OP = scanner.nextInt();

            switch (OP) {
                case 1:
                    System.out.println("1. Suma ");
                    Double suma = sumar(A,B);
                    System.out.println("la sua de "+A+" mas "+B+" es igual a "+suma);
                    break;
                case 2:
                    System.out.println("2. Resta ");
                    Double resta = restar(A,B);
                    System.out.println("la resta de "+A+" menos "+B+" es igual a "+resta);
                    break;
                case 3:
                    System.out.println("3. Mulitiplicación ");
                    Double producto = multiplicar(A,B);
                    System.out.println("El produncto de "+A+" por "+B+" es igual a "+producto);
                    break;
                case 4:
                    System.out.println("4. Potenciación ");
                    Double potencia = potenciar(A,B);
                    System.out.println(A+" elevado a la "+B+" es igual a "+potencia);
                    break;
                case 5:
                    System.out.println("5. División ");
                    if (B == 0) {
                        System.out.println("No es posible dividir entre cero");
                    }else {
                        Double division = dividir(A, B);
                        System.out.println("La division de "+A+" entre "+B+" es igual a "+division);
                    }
                    break;
                case 6:
                    System.out.println("6. salir");
                    bandera = false;
                    break;
                default:
                    System.out.println("Valor no válido");
                    break;
            }
        }while(bandera == true);
    }
}
