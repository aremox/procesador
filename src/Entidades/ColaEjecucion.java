/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.LinkedList;

/**
 *
 * @author ivan
 */
public class ColaEjecucion {
    
    private LinkedList<Proceso> coleccionElementos = new LinkedList<>();
    
    public void ColaPendientes() {
       
    }
    public void addProceso(Proceso pro) {
        coleccionElementos.add(pro);
    }
    public int tamano(){
        return coleccionElementos.size();
    }
    public int ejecutarCiclo(int ciclo){
        coleccionElementos.get(0).procesarCiclo();
        if(coleccionElementos.get(0).getServicio() == 0){
            coleccionElementos.get(0).setTiempoFinalizacion(ciclo);
            return 0;
        }
        return coleccionElementos.get(0).getServicio();
    }
    public Proceso getPrimero(){
        return coleccionElementos.get(0);                
    }
    public void borrarPrimero(){
       coleccionElementos.removeFirst();                
    }
}
