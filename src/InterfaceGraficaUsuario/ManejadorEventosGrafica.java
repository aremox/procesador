package InterfaceGraficaUsuario;

import ControlServicio.ControlServicioGrafica;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;


    

    

/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class ManejadorEventosGrafica implements Action {

   
    
    public ManejadorEventosGrafica(){

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource(); 
        if ("Ver Grafica".equals(boton.getText())) {
            ControlServicioGrafica ControlGrafica = new ControlServicioGrafica();
             
                ControlGrafica.DesarrollarServicio();
                
                          
               
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
