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
    float tiempo=0;
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
    public float getTamano() {
        return coleccionElementos.size();
        
    }
    
    public float tiempoTotal(){
       float tam = coleccionElementos.size();
       int i = 0;
        while ( i < tam) {
            
              tiempo= tiempo + coleccionElementos.get(i).getServicio();
            i++; 
        } 
        return tiempo + coleccionElementos.get(i-1).getLlegada();
       
    }   
    
    public Proceso getElementoCiclo(float ciclo) {

        float tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            if (ciclo == coleccionElementos.get(i).getLlegada()) {
                return coleccionElementos.get(i);
            }
        }
        return null;

    }
    
    public void inicializar(){

        float tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
          
            coleccionElementos.get(i).inicializar();
        }

    }
    public void inicializarGrafica(float tiempo){

        float tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            coleccionElementos.get(i).inicializarGrafica(tiempo, i);
        }

    }
    public void inicializarGraficaSRT(float tiempo){

        float tam = coleccionElementos.size();

        for (int i = 0; i < tam; i++) {
            coleccionElementos.get(i).inicializarGraficaSRT(tiempo, i);
        }

    }
    
}
