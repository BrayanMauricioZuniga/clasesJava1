package co.com.ps.c5;

import java.util.*;
public class Login {
    private static final String LOGIN = "qwerty";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("         Iniciar sesión        ");
        System.out.println("-------------------------------");
        int cont=0;

        do {
            System.out.println("");
            System.out.println("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.println("Contraseña: ");
            String contrasena = scanner.nextLine();
            System.out.println("");

            if (usuario.equals(LOGIN) && contrasena.equals(PASSWORD)){
                System.out.println("Continuar");
                cont=100;
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
            cont ++;
        }while(cont <= 5);

    }
}
