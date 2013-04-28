package InterfaceGraficaUsuario;

import ControlServicio.ControlServicioAddProcesos;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 *
 * @author Ivan Arenas
 *
 */

public class ManejadorEventosAddProcesos implements Action{
    
    private PanelCargaProcesos panel;
    private PanelGeneralOpciones panelGeneral;
    private File file;
    private LinkedList coleccionElementos = new LinkedList();
    private ControlServicioAddProcesos servicio = new ControlServicioAddProcesos();
    
  public ManejadorEventosAddProcesos(PanelCargaProcesos objeto, PanelGeneralOpciones objeto2){
        panel = objeto;
        panelGeneral = objeto2;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource(); 

        if ("Cargar".equals(boton.getText())) {
        
              
            servicio.addProceso(panel.getCampoNombre().getText(), panel.getCampoLlegada().getText(), panel.getCampoServicio().getText(), panel.getCampoPrioridad().getText());
            System.out.println(panel.getCampoNombre().getText()+" "+panel.getCampoLlegada().getText()+" "+panel.getCampoServicio().getText()+" "+panel.getCampoPrioridad().getText());   
            panel.setInicial();
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
