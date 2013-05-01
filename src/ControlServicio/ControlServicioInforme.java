/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;

import Entidades.ColaTerminados;
import Entidades.ColaTerminadosSRT;

/**
 *
 * @author ivan
 */
public class ControlServicioInforme {
    private ColaTerminados terminadosSJF = ColaTerminados.getInstancia();
    private ColaTerminadosSRT terminadosSRT = ColaTerminadosSRT.getInstancia();
    public ControlServicioInforme(){
       
    }
    
    public String DesarrollarServicio(){
       String html;
        html = "<h1>Algoritmo SJF</h1>"+terminadosSJF.html(); 
        html =html +"<h1>Algoritmo SRT</h1>"+ terminadosSRT.html(); 
        terminadosSJF.pintar();
        terminadosSRT.pintar();
        return html;
    }
    
}
