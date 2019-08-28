/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int n;
        estudiante alumnoJuli=new estudiante();
        alumnoJuli.setNombre("julian andres");
        System.out.println(alumnoJuli.getNombre());
        System.out.print("ingrese la cantidad de notas: ");
        n=Teclado.nextInt();
        alumnoJuli.setNumnotas(n);
        double[] notas=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("ingrese nota #" +(i+1));
            notas[i]=Teclado.nextDouble();
        }
        int[] porcentajenotas=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ingrese porcentaje nota #" +(i+1));
            porcentajenotas[i]=Teclado.nextInt();
        }
        double notafinal=alumnoJuli.calcularNota(notas, porcentajenotas);
        System.out.println("la nota finales "+notafinal);
        
        if(alumnoJuli.validar(notafinal)==true){
            System.out.println("Aprobo");
        }else{
            System.out.println("perdio");
        // TODO code application logic here
    }
    
    }}
