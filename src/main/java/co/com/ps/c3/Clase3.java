package co.com.ps.c3;

import java.util.*;

public class Clase3 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in); // Lectura de datos
        System.out.println("Digite su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Digite su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Su nombre es: "+nombre+" y su edad es "+edad+" años, Bienvenido");*/

        /*
        Persona persona = new Persona();
        persona.setEdad(13);
        persona.setNombre("Brayan");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        */

        Persona persona = new Persona("Brayan",28,"179","0987","m");
        System.out.println(persona.toString());

    }
}
