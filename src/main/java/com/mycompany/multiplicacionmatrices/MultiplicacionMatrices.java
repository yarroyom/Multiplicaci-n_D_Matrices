/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicacionmatrices;

import java.util.Scanner;



/**
 *
 * @author Fernanda
 */
public class MultiplicacionMatrices {
    public static void Matrices(){
        
        //declaramos las variables
        int m1[][] = new int[2][3];
        int m2[][] = new int[3][2];
        int mr[][] = new int[2][2];

        //llevamos la matriz 1
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = (int) (Math.random() * 5);
            }
        }

        //llenamos la matriz 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = (int) (Math.random() * 5);
            }
        }

        //Multiplicación de matrices
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 2; j++) {
                
                int valorAcumulado = 0; // NO SE HA EJECUTADO LA ECUACION "0"
                
                for (int k = 0; k < 3; k++) {
                    
                    valorAcumulado += m1[i][k] * m2[k][j];

                    if (k == 2) {
                        mr[i][j] = valorAcumulado;
                    }
                }
            }
        }

        //impresion en pantalla
        for (int i = 0; i < 3; i++) { // INDICE , RECORRER IGUAL O MENOR A 3

            if (i < 2) {   // LA PRIMER MATRIZ LLEGA A 2 Y LA SEGUNDA A 3. POR ESO SE HACE LA CONDICION Y NO SE PUEDEN COLCAR 2 FOR.
                for (int j = 0; j < 3; j++) { // DEBE RECORRER HASTA LA TERCER COLUMA.
                    System.out.print("[" + m1[i][j] + "]");   //LN PARA QUE NO DE SALTO DE LINEA, Y CONTATENAMOS LO QUE QUEREMOS QUE NOS IMPRIMA.
                }

                //**********
                if (i == 0) {   //
                    System.out.print("   x   "); // DAR ESPACIOS
                } else {
                    System.out.print("       ");  //CUANDO EL INDICE ESTE EN CUALQUIER OTRA FILA QUE SOLO DE ESPACIOS.
                }
                //**********

                for (int j = 0; j < 2; j++) {  // EL INDICE J RECORRE LAS COLUMNAS
                    System.out.print("[" + m2[i][j] + "]"); //CONTATENAMOS LO QUE VA A IR EN LA MATRIZ 2
                }

                //*********
                if (i == 0) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
                //**********

                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + mr[i][j] + "]");
                }
                System.out.println("");
            } else {
                
                System.out.print("                ");
                
                for (int j = 0; j < 2; j++) {
                    System.out.print("["+m2[i][j]+"]");
                }
                System.out.println("");
            }
        }
        
    }

    
    
    public static void main(String[] args) {
        Matrices();
    }
}
  