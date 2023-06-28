package co.com.ps.c4;

public class ControlDeFlujo {
    public static void main(String[] args) {
        int num = 10;

        if (num == 0 || num == 10){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }


        String diaSemana = "lunes";

        switch (diaSemana){
            case "lunes":
                System.out.println("Hoy es lunes");
                break;
            case "martes":
                System.out.println("Hoy es martes");
                break;
            case "miercoles":
                System.out.println("Hoy es miercoles");
                break;
            case "jueves":
                System.out.println("Hoy es jueves");
                break;
            case "viernes":
                System.out.println("Hoy es viernes");
                break;
            case "sabado":
                System.out.println("Hoy es sabado");
                break;
            case "doingo":
                System.out.println("Hoy es doingo");
                break;
            default:
                System.out.println("dia N/A");
                break;
        }
    }
}
