package co.com.ps.c4;

public class Universidad {
    public static void main(String[] args) {

        String nombre = "Brayan";
        Double nota = null;

        if (nota == null){
            System.out.println("Revisar estudiante");
        } else if (nota >= 3){
            System.out.println("EStudiante aprobó");
        } else {
            System.out.println("Estudiante reprobó");
        }

    }
}
