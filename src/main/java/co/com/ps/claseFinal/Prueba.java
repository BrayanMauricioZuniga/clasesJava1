package co.com.ps.claseFinal;

public class Prueba {
    public static void main(String[] args) {
        Carro carro = new Carro();
        String frenos = carro.frenos;


        DiaSemana dia = DiaSemana.MARTES;

        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO){
            System.out.println("Es fin de semana");
        } else {
            System.out.println("NO es fin de semana");
        }
    }
}
