package co.com.ps.c5;

public class Ciclos {
    public static void main(String[] args) {

        int[] arreglo = {1,2,3,4,5};
        System.out.println("Elementos del arreglo numerico");
        for (int i=0; i < arreglo.length; i++){
            System.out.println("numero["+i+"] = "+arreglo[i]);
        }

        int contador = 0;
        while (contador < 5) {
            System.out.println("El contador es "+contador);
            contador ++;
        }

        do{
            System.out.println("El contador es "+contador);
            contador ++;
        }while(contador < 5);


    }
}
