package InterfaceGraficaUsuario;

import ControlServicio.ControladorServicioProcesar;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class ManejadorEventosProcesar implements Action {

    
    public ManejadorEventosProcesar(){

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource(); 

        if ("Procesar".equals(boton.getText())) {
 
            ControladorServicioProcesar controlador = new ControladorServicioProcesar();
            controlador.DesarrollarServicio();
            JOptionPane.showMessageDialog(null,"Datos Procesados                            ","PROCESAR DATOS", JOptionPane.INFORMATION_MESSAGE);             
           
        }


    }
    

    @Override
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}