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
public class ColaGraficaSJF {
    String[] procesos;
    int tamano;
    private static ColaGraficaSJF _instancia;
    private ColaGraficaSJF(){
        
    }
    public static ColaGraficaSJF getInstancia(){ 
        if (_instancia == null) { 
            //Si la instancia no se ha creado crearla 
            _instancia = new ColaGraficaSJF(); 
        } 
        return _instancia; 
    }
    public void crearCola(int tama, int numProcesos){
        procesos = new String[tama];
        tamano = numProcesos;
    }
    
    public void addProceso(String proce, int ciclo){
        if(proce != null){
          procesos[ciclo] = proce;  
        }else{
            procesos[ciclo] = "0";
        }
    }
    
    public String[] getProcesos(){
        return procesos;
        
    }
    public int getTamano(){
        return tamano;
        
    }
    
}
