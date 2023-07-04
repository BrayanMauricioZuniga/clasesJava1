package co.com.ps.claseFinal;

import java.util.Calendar;
import java.util.Date;
public class FechasEnJava {
    public static void main(String[] args) {

/*
    Date fechaActual = new Date();
    System.out.println("Fecha y hora actual: " + fechaActual);

  */

        Calendar calendar = Calendar.getInstance();
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; //mese inician en 0
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha y hora actual: " + dia + "/" + mes + "/" + anio );

        //Agregar 7 dias del mes actual
        calendar.add(Calendar.DAY_OF_MONTH,10);
        Date newDate = calendar.getTime();
        System.out.println("Fecha después de 7 días: "+newDate);
    }
}
