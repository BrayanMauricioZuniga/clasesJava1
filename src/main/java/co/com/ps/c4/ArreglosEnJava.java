package co.com.ps.c4;

public class ArreglosEnJava {
    public static void main(String[] args) {
        int[] arreglo = new int[5];

        arreglo[0]=1;
        arreglo[1]=2;
        arreglo[2]=3;
        arreglo[3]=4;
        arreglo[4]=5;

        System.out.println("Elementos del arreglo numerico");
        for (int i=0; i < arreglo.length; i++){
            System.out.println("numero["+i+"] = "+arreglo[i]);
        }


        // acuuladores

        int suma = 0;
        for (int i=0; i < arreglo.length; i++){
            suma += arreglo[i];
            System.out.println(suma);
        }
        System.out.println("promedio = " +(suma/ arreglo.length));
        // arreglo de cadena de caracteres

        String[] futbolistas = {"Ronaldo","Lionel","Haland","Klyan","Ney"};

        System.out.println("Elementos del arreglo futbolistas");
        for (int i=0; i < futbolistas.length; i++){
            System.out.println("futbolistas ["+i+"] = "+futbolistas[i]);
        }


    }
}
