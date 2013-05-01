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
public class ColaTerminados {
    private LinkedList<Proceso> coleccionElementos = new LinkedList<>();
    private static ColaTerminados _instancia;
    private ColaTerminados() {
       
    }
    public static ColaTerminados getInstancia(){ 
        if (_instancia == null) { 
            //Si la instancia no se ha creado crearla 
            _instancia = new ColaTerminados(); 
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
    public String html(){
        int tam = coleccionElementos.size();
        String html="<div id=\"tabla\" width='400px' align='center'>"
                +"<table border=\"1\">"
               +"<thead><tr>"
                +"<th width:80px; >NOMBRE</th>"
                +"<th width:50px; >Tll</th>"
                +"<th width:50px; >Ts</th>"
                +"<th width:50px; >Tf</th>"
                +"<th width:50px; >Tr</th>"
                +"<th width:50px; >Te</th>"
                +"<th width:50px; >Tn</th>"
                +"</tr></thead><tbody>";
        for (int i = 0; i < tam; i++) {
           html= html + coleccionElementos.get(i).datoHtml();
        }
        html = html + "</tbody></table></div>";
        return html;
        
    }
}
