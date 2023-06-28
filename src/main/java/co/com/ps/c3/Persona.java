package co.com.ps.c3;

public class Persona{
    private String nombre;
    private int edad;
    private String estatura;
    private String id;
    private String sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(){

    }

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, String estatura, String id, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura='" + estatura + '\'' +
                ", id='" + id + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
