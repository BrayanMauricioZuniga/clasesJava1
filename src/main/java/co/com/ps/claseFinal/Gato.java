package co.com.ps.claseFinal;

public class Gato implements Animales {


    public void maullar(){
        System.out.println("El gato maulla");
    }

    @Override
    public void comer() {
        System.out.println("El gato come");
    }

    @Override
    public void dormir() {
        System.out.println("El gato duerme");
    }
}
