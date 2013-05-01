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
        html = terminadosSJF.html(); 
        terminadosSJF.pintar();
        System.out.println(html);
        return html;
    }
    
}
