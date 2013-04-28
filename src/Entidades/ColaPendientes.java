/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author ivan
 */
public class ColaPendientes {

    private LinkedList<Proceso> coleccionElementos = new LinkedList<>();

    public void ColaPendientes() {
       
    }

    public void addProceso(Proceso pro) {
        coleccionElementos.add(pro);
        ordenar();
    }
    private void ordenar(){
         int tam = coleccionElementos.size();
         Proceso[] arr_pro = coleccionElementos.toArray(new Proceso[0]);
         Proceso pro_aux;
        for (int i = 0; i < tam; i++) {
            for (int j = i + 1; j < tam; j++) {
                if(arr_pro[j].getPrioridad() < arr_pro[i].getPrioridad()){
                    pro_aux = arr_pro[i];
                    arr_pro[i] = arr_pro[j];
                    arr_pro[j] = pro_aux;
                    
                }
            }
        }
        coleccionElementos.clear();
        for (int i = 0; i < tam; i++) {
            coleccionElementos.add(arr_pro[i]);
        }
        
    }
    
    public void pintar(){
        int tam = coleccionElementos.size();
        for (int i = 0; i < tam; i++) {
            System.out.println(coleccionElementos.get(i).getNombre());
        }
        
    }
}
