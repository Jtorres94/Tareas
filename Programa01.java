/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa01;

import java.util.*;

public class Programa01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,a,d,t,at;
        System.out.println("Ingrese cantidad de personas a encuestar, tenga en cuenta que son el mismo numero de hombres que mujeres.");
        n=leerNumero();
        char encuesta[][]= new char[2][n];
        System.out.println("Llene con datos de la encuesta");
        llenarMatriz(encuesta);
        mostrarMatriz(encuesta);
        a=aprobacionHombres(encuesta);
        System.out.println("Aprovacion hombres"+" : "+a);
        d=desaprobacionMujeres(encuesta);
        System.out.println("Desaprovacion mujeres"+" : "+d);
        t=totalEncuestados(encuesta);
        System.out.println("Total encuestados"+" : "+t);
        at=aprobacionTotal(encuesta);
        System.out.println("Aprobacion total"+" : "+at); 
    }
    
    public static int leerNumero(){
        int n;
        Scanner leer=new Scanner(System.in);
        n=leer.nextInt();
        return n;
    }
    public static char leerRespuesta(){
        String respuesta;
        char r;
        Scanner leer=new Scanner(System.in);
        respuesta=leer.next();
        r=respuesta.charAt(0);
        return r;
    }
    public static void llenarMatriz(char[][] encuesta){
        int i,j;
        for (i=0;i<encuesta.length;i++){
            for(j=0;j<encuesta[i].length;j++){
                    encuesta[i][j]=leerRespuesta();
                }
            }
        }
    public static void mostrarMatriz(char encuesta[][]){
        int i,j;
        for(i=0;i<encuesta.length;i++){
            for(j=0;j<encuesta[i].length;j++){
                System.out.print(encuesta[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int aprobacionHombres(char encuesta[][]){
        int i,j,cont=0;
        for(i=0;i<1;i++){
            for(j=0;j<encuesta[i].length;j++){
                if(encuesta[i][j]=='s'){
                    cont++;
                }
            }
        }
        return cont;
    }
    public static int desaprobacionMujeres(char encuesta[][]){
        int i,j,cont=0;
        for(i=1;i<encuesta.length;i++){
            for(j=0;j<encuesta[i].length;j++){
                if(encuesta[i][j]=='n'){
                    cont++;
                }
            }
        }
        return cont;
    }
    public static int totalEncuestados(char encuesta[][]){
        int i,j,cont=0;
        for(i=0;i<encuesta.length;i++){
            for(j=0;j<encuesta[i].length;j++){
                if(encuesta[i][j]=='n'||encuesta[i][j]=='s'){
                    cont++;
                }
            }
        }
        return cont;
    }
        public static int aprobacionTotal(char encuesta[][]){
        int i,j,cont=0;
        for(i=0;i<encuesta.length;i++){
            for(j=0;j<encuesta[i].length;j++){
                if(encuesta[i][j]=='s'){
                    cont++;
                }
            }
        }
        return cont;
    }
    }
    
