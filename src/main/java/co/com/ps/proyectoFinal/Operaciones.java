package co.com.ps.proyectoFinal;

public class Operaciones {

    double num1;
    double num2;

    double suma;
    double resta;

    double producto;
    double division;
    double potencia;

    public double sumar (double num1, double num2) {
        suma = num1 + num2;
        return suma;
    }

    public double restar (double num1, double num2) {
        resta = num1 - num2;
        return resta;
    }

    public double multiplicar (double num1, double num2) {
        producto = num1 * num2;
        return producto;
    }

    public double dividir (double num1, double num2) {
        division = num1 / num2;
        return division;
    }

    public double potenciar (double num1, double num2) {
        potencia = Math.pow(num1, num2);;
        return potencia;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getProducto() {
        return producto;
    }

    public double getDivision() {
        return division;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
