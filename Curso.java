package tarea1909;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private ArrayList<Alumnos> curso = new ArrayList<>();

    public Curso() {

    }

    public void agregarAlumno(String nombre, String apellido, String rut, String matricula) {
        Alumnos obj = new Alumnos();
        if (existeAlumno(rut) || "Rut no valido".equals(rut)) {
            System.out.println("El alumno ya existe en el curso o el rut no es valido");
        } else {
            obj.setNombre(nombre);
            obj.setApellido(apellido);
            obj.setRut(rut);
            obj.setMatricula(matricula);
            curso.add(obj);
        }
    }

    public void eliminarAlumno(String rut) {
        if (existeAlumno(rut)) {
            for (int i = 0; i < curso.size(); i++) {
                if (curso.get(i).getRut().equals(rut)) {
                    curso.remove(i);
                }
            }
        } else {
            System.out.println("No existe alumno en el curso o rut no valido");
        }
    }

    public void buscarAlumno(String rutAlumno) {
        if (existeAlumno(rutAlumno)) {
            for (int i = 0; i < curso.size(); i++) {
                Alumnos obj = curso.get(i);
                if (rutAlumno.equals(obj.getRut())) {
                    System.out.println("El alumno: " + obj.getNombre() + " " + obj.getApellido() + " " + obj.getRut() + " " + obj.getMatricula() + " si se encuentra en el curso");
                    break;
                }
            }
        } else {
            System.out.println("El alumno no existe");
        }
    }

    private boolean existeAlumno(String rut) {
        boolean existe = false;
        for (int i = 0; i < curso.size(); i++) {
            Alumnos obj = curso.get(i);
            if (rut.equals(obj.getRut())) {
                existe = true;
            }
        }
        return existe;
    }

    public void mostrarCurso() {
        for (int i = 0; i < curso.size(); i++) {
            Alumnos obj = curso.get(i);
            System.out.println((i + 1) + "- " + obj.getNombre() + " " + obj.getApellido() + " " + obj.getRut() + " " + obj.getMatricula());
        }
    }

    public String leerString() {
        Scanner leer = new Scanner(System.in);
        String cadena;
        cadena = leer.nextLine();
        return cadena;
    }

    private boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public String rut(String rutValidar) {
        String rut = "Rut no valido";
        if (validarRut(rutValidar)) {
            rut = rutValidar;
        }
        return rut;
    }

    public void menu() {
        Curso obj = new Curso();
        String opc;
        do {
            System.out.println("Ingrese opcion");
            System.out.println("1.-Añadir alumno");
            System.out.println("2.-Quitar alumno");
            System.out.println("3.-Buscar alumnos por rut");
            System.out.println("4.-Mostrar Curso");
            System.out.println("5.-Salir");
            opc = leerString();
            switch (opc) {
                case "1":
                    System.out.println("Ingrese nombre, apellido, rut, año de ingreso");
                    obj.agregarAlumno(obj.leerString(), obj.leerString(), obj.rut(obj.leerString()), obj.leerString());
                    break;
                case "2":
                    System.out.println("Ingrese el rut del alumno a eliminar");
                    obj.eliminarAlumno(obj.rut(obj.leerString()));
                    break;
                case "3":
                    System.out.println("Ingrese rut");
                    obj.buscarAlumno(obj.rut(obj.leerString()));
                    break;
                case "4":
                    obj.mostrarCurso();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (!opc.equals("5"));
    }
}
