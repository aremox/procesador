/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;


import Entidades.ColaPendientes;
import Entidades.ListaProcesos;
import Entidades.Proceso;

/**
 *
 * @author ivan
 */
public class ControladorServicioProcesar {
    private int ciclos;
    private ColaPendientes pendientes = new ColaPendientes();
    
    public ControladorServicioProcesar(){
      
    }
    
    public void DesarrollarServicio(){
        ciclos = ListaProcesos.getInstancia().tiempoTotal();
        ListaProcesos procesos = ListaProcesos.getInstancia();
        System.out.println(ciclos);
        for (int i = 0; i < ciclos; i++){
            if(procesos.getElementoCiclo(i) != null){
                Proceso pro = procesos.getElementoCiclo(i);
                pendientes.addProceso(pro);
            }
        }
        
    }
}
