package Paquete;

public class Persona {
    private int edad;
    private Lugar lugarNacimiento;
    String nombre;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setLugarNacimiento(Lugar lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Lugar getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, int edad, Lugar lugarNacimiento) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
    }
}
