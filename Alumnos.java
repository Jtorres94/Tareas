package tarea1909;

public class Alumnos {

    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;
    private int fuerza;

    public Alumnos() {

    }

    public Alumnos(String nombre, String apellido, String rut, String matricula, int fuerza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void añadirFuerza(int fuerza){
        this.fuerza=(int)Math.random()*101;
    }
    
    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", matricula=" + matricula + '}';
    }

}
