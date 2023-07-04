package co.com.ps.claseFinal;

public class Canario implements Animales{

    @Override
    public void comer() {
        System.out.println("El canario come");
    }

    @Override
    public void dormir() {
        System.out.println("El canario duerme");
    }

    public void trinar(){
        System.out.println("El canario trina");
    }
}
