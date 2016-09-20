package tarea1909;

public class Alumnos {

    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;

    public Alumnos() {

    }

    public Alumnos(String nombre, String apellido, String rut, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
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

}
