package InterfaceGraficaUsuario;

import ControlServicio.ControlServicioInforme;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


    

    

/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class ManejadorEventosInforme implements Action {

   
    
    public ManejadorEventosInforme(){

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource(); 
        if ("Ver informe".equals(boton.getText())) {
            ControlServicioInforme ControlInforme = new ControlServicioInforme();
             
                String linea = ControlInforme.DesarrollarServicio();
                //String lineaTiendas = controladorInformeCarga.DesarrollarServicio().obtenerAuditoriaCargaTiendas().getTextoInformeCarga();
                //String lineaClientes = controladorInformeCarga.DesarrollarServicio().obtenerAuditoriaCargaClientes().getTextoInformeCarga();
                //String lineaProductos = controladorInformeCarga.DesarrollarServicio().obtenerAuditoriaCargaProductos().getTextoInformeCarga();
                //String lineaVentas = controladorInformeCarga.DesarrollarServicio().obtenerAuditoriaCargaVentas().getTextoInformeCarga();
              
                // Opción normal
                //JOptionPane.showMessageDialog(null,"\n\n"+lineaClientes+"\n"+lineaProductos+"\n"+lineaTiendas+"\n"+lineaAlmacen+"\n"+lineaVentas+"\n\n\n\n","INFORME DE CARGA       ", JOptionPane.PLAIN_MESSAGE);             
                
                // Opción centrado en el MessageDialog con HTML
                String message = "<html>"
                        + "<body>"
                        +linea
                        +"</body></html>";
                JLabel messageLabel = new JLabel(message);
                JOptionPane.showMessageDialog(null,messageLabel,"INFORME DE CARGA       ", JOptionPane.PLAIN_MESSAGE);            
               
            } 
        }

    @Override
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override    
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }
