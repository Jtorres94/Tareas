//La verdad de las cosas es que lo hice hoy dia mismo y no me calzaban las validaciones por estar mucho rato pensando... disculpas y aviso para que pruebe con los valores que darian correcta la solucion.
package tareaayudantia01;

import java.util.*;
public class Tareaayudantia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
        menu();
        opcion(leerOpc());}
        while(leerOpc()!=0);
    }
    public static int leerOpc(){
        Scanner leer = new Scanner (System.in);
        int n;
        n=leer.nextInt();
        return n;
    }
    public static char[] stringtoChar(String cadena){//Transforma nuestro string en un arreglo de char
        char vector[]=cadena.toCharArray();
        return vector;
    }
    public static int espacio(char vector[]){//Indica en que posicion esta el primer espacio que separa numeros y operador matematico.
        int pos=0;
        boolean existe=false;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==' '){
                existe=true;
                pos=i;
                break;
            }
        }
        return pos;
    }
    public static int espacio2(char vector[],int espacio){//Indica en que posicion esta el segundo espacio que separa numeros y operador matematico.
        int pos=0;
        boolean existe=false;
        for (int i = espacio+1; i < vector.length; i++) {
            if(vector[i]==' '){
                existe=true;
                pos=i;
                break;
            }
        }
        return pos;
    }
    public static String cadena1(char vector[],int espacio){//me entrega el primer numero pero en tipo string
        String num= new String(vector);
        String numero=num.substring(0,espacio);
        return numero;
    }
    public static String cadena2(char vector[],int espacio){//me entrega el segundo numero pero en tipo string
        String num= new String(vector);
        String numero=num.substring(espacio+1);
        return numero;
    }
    public static char operador(char vector[],int espacio){
        char operador=vector[espacio+1];
        return operador;
    }
    public static boolean validar(String cadena){
        try{
            double numero=Double.parseDouble(cadena);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    public static double numero(String cadena){
        double numero;
        if(validar(cadena)==true){
            numero=Double.parseDouble(cadena);
        }else
            numero=0;
        return numero;
    }
    public static double suma(double num1, double num2){
        double resultado;
        resultado=num1+num2;
        return resultado;
    }
    public static double resta(double num1, double num2){
        double resultado;
        resultado=num1-num2;
        return resultado;
    }
    public static double multiplicacion(double num1, double num2){
        double resultado;
        resultado=num1*num2;
        return resultado;
    }
    public static double division(double num1, double num2){
        double resultado;
        resultado=num1/num2;
        return resultado;
    }
    public static double operacion(char operador, double num1, double num2){
        double resultado=0;
        if(operador=='+'){
           return resultado=suma(num1,num2); 
        }else if(operador=='-'){
            return resultado=resta(num1,num2);
        }else if(operador=='*'){
            return resultado=multiplicacion(num1,num2);
        }else if(operador=='/'){
            return resultado=division(num1,num2);
        }else return resultado;
    }
    public static void menu(){
        System.out.println("Ingrese opcion para operar");
        System.out.println("1.- ocupar calculadora");
        System.out.println("2.- salir de la calculadora");
    }
    public static void opcion(int opc){
        Scanner leer = new Scanner(System.in);
        double resultado;
        String cadena;
        if(opc==1){
            System.out.println("Ingrese cadena a operar");
            cadena=leer.nextLine();
            resultado=operacion(operador(stringtoChar(cadena),espacio(stringtoChar(cadena))),numero(cadena1(stringtoChar(cadena),espacio(stringtoChar(cadena)))),numero(cadena2(stringtoChar(cadena),espacio2(stringtoChar(cadena),espacio(stringtoChar(cadena))))));
            System.out.println("El resultado es: "+resultado);
        }else
            System.out.println("Gracias por utilizar la aplicacion");
    }
}
