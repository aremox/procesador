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
public class ListaProcesos {

    private LinkedList<Proceso> coleccionElementos;
    int tiempo=0;
    private static ListaProcesos _instancia;
    
    
    private ListaProcesos() {
        coleccionElementos = new LinkedList();
    }
    public static ListaProcesos getInstancia(){ 
        if (_instancia == null) { 
            //Si la instancia no se ha creado crearla 
            _instancia = new ListaProcesos(); 
        } 
        return _instancia; 
    }
    
    public void addProceso(Proceso pro) {
        coleccionElementos.add(pro);
        
    }
    
    public int tiempoTotal(){
       int tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            
              tiempo= tiempo + coleccionElementos.get(i).getServicio();
             
        } 
        return tiempo + coleccionElementos.get(0).getLlegada()+1;
       
    }   
    
    public Proceso getElementoCiclo(int ciclo) {

        int tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            if (ciclo == (coleccionElementos.get(i).getLlegada())) {
                return coleccionElementos.get(i);
            }
        }
        return null;

    }
    
    public void inicializar(){

        int tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            coleccionElementos.get(i).inicializar();
        }

    }
    
}
