/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ivan
 */
public class Proceso {
    private String nombre;
    private int llegada;
    private int servicio;
    private int prioridad;
    
    public Proceso(String nom, int lle, int ser, int pri){
        nombre = nom;
        llegada = lle;
        servicio = ser;
        prioridad = pri;
    }
    public int getLlegada(){
        return llegada;        
    }
    public int getServicio(){
        return servicio;        
    }
    public int getPrioridad(){
        return prioridad;        
    }
    public String getNombre(){
        return nombre;        
    }
}
