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
public class ColaTerminadosSRT {
    private LinkedList<Proceso> coleccionElementos = new LinkedList<>();
    private static ColaTerminadosSRT _instancia;
    private ColaTerminadosSRT() {
       
    }
    public static ColaTerminadosSRT getInstancia(){ 
        if (_instancia == null) { 
            //Si la instancia no se ha creado crearla 
            _instancia = new ColaTerminadosSRT(); 
        } 
        return _instancia; 
    }
    public void addProceso(Proceso pro) {
        coleccionElementos.add(pro);
    }
    public void pintar(){
        int tam = coleccionElementos.size();
        System.out.println("Nombre  Tf  Tr  Tn");
        for (int i = 0; i < tam; i++) {
            System.out.println(coleccionElementos.get(i).getNombre()+"      "
                    +coleccionElementos.get(i).getTiempoFinalizacion()+"    "
                    +coleccionElementos.get(i).getTiempoReal()+"   "
                    +coleccionElementos.get(i).getTiempoNormalizado());
        }
        
    }
}
