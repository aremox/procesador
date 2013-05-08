/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;

import Entidades.ListaProcesos;
import Entidades.Proceso;

/**
 *
 * @author ivan
 */
public class ControlServicioAddProcesos {
    
    public ControlServicioAddProcesos(){
       
    }
    
    public void addProceso(String nombre, String llegada, String servicio, String prioridad){
        Proceso pro = new Proceso();
        pro.crearProceso(nombre, Float.parseFloat(llegada), Float.parseFloat(servicio), Float.parseFloat(prioridad));
        ListaProcesos.getInstancia().addProceso(pro);
    }
}
