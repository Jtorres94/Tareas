/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa02;

import java.util.*;
public class Programa02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        String magico;
        magico=magico(fila(sumaFila(matriz)),columna(sumaColumna(matriz)),diagonal1(diagonal(matriz)),diagonal2(diagonalInversa(matriz)));
        System.out.println(magico);
    }
    public static int generarRandom(int matriz[][]){
        Random rdm= new Random();
        int numero;
        numero=1+ rdm.nextInt(9);
        if(repetido(matriz,numero)==true){
            numero=generarRandom(matriz);
        }
        return numero;
    }
    public static boolean repetido(int matriz[][],int numero){
        boolean repetido=false;
        int i,j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(matriz[i][j]==numero){
                    repetido=true;
                }
            }
        }
        return repetido;
    }
    public static void llenarMatriz(int[][] matriz){
        int i,j;
        for (i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                    matriz[i][j]=generarRandom(matriz);
                }
            }
        }
    public static void mostrarMatriz(int matriz[][]){
        int i,j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[] sumaFila(int matriz[][]){
        int suma=0,i,j;
        int sumav[]=new int[3];
        for(i=0;i<matriz.length;i++){
            suma=0;
            for(j=0;j<matriz[i].length;j++){
                suma=suma+matriz[i][j];
                sumav[i]=suma;
            }
        }
        return sumav;
    }
    public static int[] sumaColumna(int matriz[][]){
        int suma=0,i,j;
        int sumav[]=new int[3];
        for(i=0;i<matriz[0].length;i++){
            suma=0;
            for(j=0;j<matriz.length;j++){
                suma=suma+matriz[i][j];
                sumav[i]=suma;
            }
        }
        return sumav;
    }
    public static void mostrarVector(int arreglo[]){
        int i;
        for(i=0;i<arreglo.length;i++)
        {
            System.out.print(arreglo[i]+" ");
        }
    }
    public static int diagonal(int matriz[][]){
        int suma=0,i,j;
        for(i=0;i<matriz.length;i++){
            suma=suma+matriz[i][i];
        }
        return suma;
    }
    public static int diagonalInversa(int matriz[][]){
        int suma=0,i,j;
        for (i=0;i<matriz.length;i++){
            for(j=0;j<matriz[i].length;j++){
                if(i+j==matriz.length-1){
                    suma=suma+matriz[i][j];
                }
            }
        }
        return suma;
    }
    public static boolean fila(int vector[]){
        boolean magico=true;
        int i;
        for(i=0;i<vector.length;i++){
            if(vector[i]!=15){
                magico=false;
            }
        }
        return magico;
    }
    public static boolean columna(int vector[]){
        boolean magico=true;
        int i;
        for(i=0;i<vector.length;i++){
            if(vector[i]!=15){
                magico=false;
            }
        }
        return magico;
    }  
    public static boolean diagonal1(int numero){
        boolean magico;
        if(numero==15){
            magico=true;
        }else 
            magico=false;
        return magico;
    } 
    public static boolean diagonal2(int numero){
        boolean magico;
        if(numero==15){
            magico=true;
        }else 
            magico=false;
        return magico;
    } 
    public static String magico(boolean fila, boolean columna, boolean diagonal1,boolean diagonal2){
        String msj;
        if(fila==true&&columna==true&&diagonal1==true&&diagonal2==true){
            msj="Si es magico";}
        else
            msj="No es magico";
        return msj;
    }
    
    
}
