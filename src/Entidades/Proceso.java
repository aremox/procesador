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
    private float llegada;
    private float servicio;
    private float duracion;
    private float prioridad;
    private float tiempoFinalizacion;
    private XYSeries series_aux;
    private XYSeries series_auxSRT;
    private float id_grafica;
    private float id_graficaSRT;
    
    public Proceso(){
        
    }
    public Proceso(String nom, float lle, float ser, float pri, float fin, XYSeries grafica, float id, XYSeries grafica2){
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
    public strictfp void crearProceso(String nom, float lle, float ser, float pri){
        nombre = nom;
        llegada =  (float)Math.round(lle*100);
        servicio = (float)Math.round(ser*100);
        prioridad = (float)Math.round(pri*100);
        duracion = (float)Math.round(ser*100);
    }
    
    public float getLlegada(){
        return llegada;        
    }
    public float getServicio(){
        return servicio;        
    }
    public float getDuracion(){
        return duracion;        
    }
    public float getPrioridad(){
        return prioridad;        
    }
    public String getNombre(){
        return nombre;        
    }
    public void procesarCiclo(){
        servicio = servicio-1;        
    }
    public void setTiempoFinalizacion(float fin){
        tiempoFinalizacion = fin;        
    }
    public float getTiempoFinalizacion(){      
        return tiempoFinalizacion;
    }
    public float getTiempoReal(){
        return tiempoFinalizacion - llegada;
    }
     public float getTiempoEspera(){
        return this.getTiempoReal() - duracion;
    }
    public float getTiempoNormalizado(){
        return this.getTiempoReal()/duracion;
    }
    public void inicializar(){
        servicio = duracion;
    }
    
    public String datoHtml(){
    
       String html = "<tr>"
               +"<td>"+nombre+"</td>"
               +"<td>"+(llegada/100)+"</td>"
                +"<td>"+(duracion/100)+"</td>"
                +"<td>"+(tiempoFinalizacion/100)+"</td>"
                +"<td>"+(this.getTiempoReal()/100)+"</td>"
                +"<td>"+(this.getTiempoEspera()/100)+"</td>"
                +"<td>"+this.getTiempoNormalizado()+"</td>"
               +"</tr>";
        
        
        return html;        
    }
    
    private void crearGrafica(){
        series_aux = new XYSeries(nombre);
    }
    public void inicializarGrafica(float tam, float id){
        crearGrafica();
        id = id + 1;
        id_grafica = id;
        for (float i = 0; i < tam; i++) {
           series_aux.add(i/10,null);
                    
        } 
    }
    public void setGrafica(float valor){
        valor = valor/10;
        if(series_aux.getItemCount()>valor){
       series_aux.remove(valor);
        }
       series_aux.addOrUpdate((int)valor, (int)id_grafica);
    }
    public XYSeries getGrafica(){
        
        return series_aux;
    }
    public float getIdGrafica(){
        return id_grafica;
    }
    /////////////////////////////////////
    // Parte de SRT                 /////
    /////////////////////////////////////
     private void crearGraficaSRT(){
        series_auxSRT = new XYSeries(nombre);
    }
    public void inicializarGraficaSRT(float tam, float id){
        crearGraficaSRT();
        id = id + 1;
        id_graficaSRT = id;
        for (float i = 0; i < tam; i++) {
           series_auxSRT.add(i/10,null);
                    
        } 
    }
    public void setGraficaSRT(float valor){
        valor = valor/10;
        if(series_auxSRT.getItemCount()>valor){
       series_auxSRT.remove(valor);
        }
       series_auxSRT.addOrUpdate((int)valor, (int)id_graficaSRT);
    }
    public XYSeries getGraficaSRT(){
        
        return series_auxSRT;
    }
    public float getIdGraficaSRT(){
        return id_graficaSRT;
    }
}
