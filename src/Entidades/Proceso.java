/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import org.jfree.data.xy.XYSeries;

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
    private XYSeries series_aux;
    private XYSeries series_auxSRT;
    private int id_grafica;
    private int id_graficaSRT;
    
    public Proceso(String nom, int lle, int ser, int pri){
        nombre = nom;
        llegada = lle;
        servicio = ser;
        prioridad = pri;
        duracion = ser;
    }
    public Proceso(String nom, int lle, int ser, int pri, int fin, XYSeries grafica, int id, XYSeries grafica2){
        nombre = nom;
        llegada = lle;
        servicio = 0;
        prioridad = pri;
        duracion = ser;
        tiempoFinalizacion = fin;
        series_aux = grafica;
        id_grafica = id;
        series_auxSRT = grafica2;
        id_graficaSRT = id;
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
    
    private void crearGrafica(){
        series_aux = new XYSeries(nombre);
    }
    public void inicializarGrafica(int tam, int id){
        crearGrafica();
        id = id + 1;
        id_grafica = id;
        for (int i = 0; i < tam; i++) {
           series_aux.add(i,null);
                    
        } 
    }
    public void setGrafica(int valor){
        if(series_aux.getItemCount()>valor){
       series_aux.remove(valor);
        }
       series_aux.addOrUpdate((int)valor, (int)id_grafica);
    }
    public XYSeries getGrafica(){
        
        return series_aux;
    }
    public int getIdGrafica(){
        return id_grafica;
    }
    /////////////////////////////////////
    // Parte de SRT                 /////
    /////////////////////////////////////
     private void crearGraficaSRT(){
        series_auxSRT = new XYSeries(nombre);
    }
    public void inicializarGraficaSRT(int tam, int id){
        crearGraficaSRT();
        id = id + 1;
        id_graficaSRT = id;
        for (int i = 0; i < tam; i++) {
           series_auxSRT.add(i,null);
                    
        } 
    }
    public void setGraficaSRT(int valor){
        if(series_auxSRT.getItemCount()>valor){
       series_auxSRT.remove(valor);
        }
       series_auxSRT.addOrUpdate((int)valor, (int)id_graficaSRT);
    }
    public XYSeries getGraficaSRT(){
        
        return series_auxSRT;
    }
    public int getIdGraficaSRT(){
        return id_graficaSRT;
    }
}
