/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Estudiante
 */
public class estudiante {
    private String nombre;
    private int codigo;
    private String asignatura;
    private int cantnotas;
    private double notas[];
    private int pornotas[];
    private double notasfinal;
    private int numnotas;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setAsignatura(String asignatura){
        this.asignatura=asignatura;
    }
    public String getAasignatura(){
        return asignatura;
    }
    public void setCantnotas(int cantnotas){
        this.cantnotas=cantnotas;
    }
    public int getCantnotas(){
        return cantnotas;
    }
    public void setNotas(double[] notas){
        this.notas=notas;
    }
    public double[] getNotas(){
        return notas;
    }
    public void setPornotas( int[] pornotas){
        this.pornotas=pornotas;
    }
    public int[] getPornotas(){
        return pornotas;
    }
    public void setNotasfinal(int notasfinal){
        this.notasfinal=notasfinal;
    }
    public int getNotasfinal(){
        return (int) notasfinal;
    }
    public void setNumnotas(int numnotas){
        this.numnotas=numnotas;
    }
    public int getNumnotas(){
        return numnotas;
    }

    //metodos de instancia
    public double calcularNota(double[] notas, int[]pornotas){
       this.notas=notas;
       this.pornotas=pornotas;
       for(int i=0;i<numnotas;i++){
        notasfinal+=notas[i]*pornotas[i]/100;
        
    }
        return notasfinal;
    }
    public boolean validar(double notasfinal){
    this.notasfinal=notasfinal;
        boolean aprueba =  notasfinal>3.0;
    return aprueba;
    }
}
