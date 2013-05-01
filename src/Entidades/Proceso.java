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
    private int duracion;
    private int prioridad;
    private int tiempoFinalizacion;
    
    public Proceso(String nom, int lle, int ser, int pri){
        nombre = nom;
        llegada = lle;
        servicio = ser;
        prioridad = pri;
        duracion = ser;
    }
    public Proceso(String nom, int lle, int ser, int pri, int fin){
        nombre = nom;
        llegada = lle;
        servicio = 0;
        prioridad = pri;
        duracion = ser;
        tiempoFinalizacion = fin;
    }
    public int getLlegada(){
        return llegada;        
    }
    public int getServicio(){
        return servicio;        
    }
    public int getDuracion(){
        return duracion;        
    }
    public int getPrioridad(){
        return prioridad;        
    }
    public String getNombre(){
        return nombre;        
    }
    public void procesarCiclo(){
        servicio = servicio-1;        
    }
    public void setTiempoFinalizacion(int fin){
        tiempoFinalizacion = fin;        
    }
    public int getTiempoFinalizacion(){      
        return tiempoFinalizacion;
    }
    public int getTiempoReal(){
        return tiempoFinalizacion - llegada;
    }
     public int getTiempoEspera(){
        return this.getTiempoReal() - duracion;
    }
    public double getTiempoNormalizado(){
        return (this.getTiempoReal()/duracion);
    }
    public void inicializar(){
        servicio = duracion;
    }
    
    public String datoHtml(){
    
       String html = "<tr>"
               +"<td>"+nombre+"</td>"
               +"<td>"+llegada+"</td>"
                +"<td>"+duracion+"</td>"
                +"<td>"+tiempoFinalizacion+"</td>"
                +"<td>"+this.getTiempoReal()+"</td>"
                +"<td>"+this.getTiempoEspera()+"</td>"
                +"<td>"+this.getTiempoNormalizado()+"</td>"
               +"</tr>";
        
        
        return html;        
    }
}
