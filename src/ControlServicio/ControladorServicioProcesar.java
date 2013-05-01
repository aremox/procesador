/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;


import Entidades.ColaEjecucion;
import Entidades.ColaPendientes;
import Entidades.ColaTerminados;
import Entidades.ColaTerminadosSRT;
import Entidades.ListaProcesos;
import Entidades.Proceso;

/**
 *
 * @author ivan
 */
public class ControladorServicioProcesar {
    
    //private ColaPendientes pendientes = new ColaPendientes();
    //private ColaEjecucion ejecucion = new ColaEjecucion();
    private ColaTerminados terminadosSJF = ColaTerminados.getInstancia();
    private ColaTerminadosSRT terminadosSRT = ColaTerminadosSRT.getInstancia();
            
    public ControladorServicioProcesar(){
      
    }
    
    public void DesarrollarServicioSJF(){
        int ciclos=0;
        ColaPendientes pendientes = new ColaPendientes();
        ColaEjecucion ejecucion = new ColaEjecucion();
        //Calculamos el tiempo total que va a tardar el algoritmo
        ciclos = ListaProcesos.getInstancia().tiempoTotal();
        ListaProcesos procesos = ListaProcesos.getInstancia();
        //inicializamos todas las colas
        procesos.inicializar();
        //Empezamos a ejecutar ciclos
        for (int i = 0; i < ciclos; i++){
            //Si el tiempo de llegada es igual ciclo, asignamos el proceso a la cola de pendientes ordenado por prioridad
            if(procesos.getElementoCiclo(i) != null){
                Proceso pro = procesos.getElementoCiclo(i);
                pendientes.addProceso(pro);
            }
            //si hay algo en la cola de ejecucion lo ejecutamos
             if( ejecucion.tamano() > 0){
                int restantes = ejecucion.ejecutarCiclo(i);
                //Si el tiempo restante es igual a 0 termina el proceso y se añade a la cola de terminados
                if (restantes == 0){
                    Proceso pro = new Proceso(ejecucion.getPrimero().getNombre(),ejecucion.getPrimero().getLlegada(),ejecucion.getPrimero().getDuracion(),ejecucion.getPrimero().getPrioridad(),ejecucion.getPrimero().getTiempoFinalizacion());
                  terminadosSJF.addProceso(pro);
                  ejecucion.borrarPrimero();
                  
                }                
            }
            
            if(( ejecucion.tamano() < 1)&&(pendientes.getTamano() > 0)){
                ejecucion.addProceso(pendientes.getPrimero());
                pendientes.borrarPrimero();
            }
           
            
        }
        //terminadosSJF.pintar(); 
        
    }


    public void DesarrollarServicioSRT() throws CloneNotSupportedException{
        int ciclosSRT=0;
        ColaPendientes pendientesSRT = new ColaPendientes();
        ColaEjecucion ejecucionSRT = new ColaEjecucion();
        //Calculamos el tiempo total que va a tardar el algoritmo
        ciclosSRT = ListaProcesos.getInstancia().tiempoTotal();
        ListaProcesos procesos = ListaProcesos.getInstancia();
        //inicializamos todas las colas
        procesos.inicializar();
        //Empezamos a ejecutar ciclos
        for (int i = 0; i < ciclosSRT; i++){
            //Si el tiempo de llegada es igual ciclo, asignamos el proceso a la cola de pendientes ordenado por prioridad
            if(procesos.getElementoCiclo(i) != null){
                Proceso pro = procesos.getElementoCiclo(i);
                pendientesSRT.addProceso(pro);
            }
            //si no hay procesos en la cola de ejecucion se añade un proceso
            if(( ejecucionSRT.tamano() < 1)&&(pendientesSRT.getTamano() > 0)){
                ejecucionSRT.addProceso(pendientesSRT.getPrimero());
                pendientesSRT.borrarPrimero();
            }
            //si hay algo en la cola de ejecucion lo ejecutamos
            if( ejecucionSRT.tamano() > 0){
                if(pendientesSRT.getTamano() > 0){
                    //Si la prioridad del que se ejecuta es menor que la de algun proceso de la cola pendientes
                    //se mana el proceso en ejecucion a la cola de pendientes y se empeza a ejecutar el de mayor prioridad
                if(ejecucionSRT.getPrimero().getPrioridad() > pendientesSRT.getPrimero().getPrioridad()){
                    pendientesSRT.addProceso(ejecucionSRT.getPrimero());
                    ejecucionSRT.borrarPrimero();
                    ejecucionSRT.addProceso(pendientesSRT.getPrimero());
                    pendientesSRT.borrarPrimero();
                }}
                int restantes = ejecucionSRT.ejecutarCiclo(i+1);
                //Si el tiempo restante es igual a 0 termina el proceso y se añade a la cola de terminados
                if (restantes == 0){
                  Proceso pro = new Proceso(ejecucionSRT.getPrimero().getNombre(),ejecucionSRT.getPrimero().getLlegada(),ejecucionSRT.getPrimero().getDuracion(),ejecucionSRT.getPrimero().getPrioridad(),ejecucionSRT.getPrimero().getTiempoFinalizacion());
                  terminadosSRT.addProceso(pro);
                  ejecucionSRT.borrarPrimero();
                  
                }                
            }
           
            
        }
        //terminadosSRT.pintar(); 
        //terminadosSJF.pintar();
    }

}

