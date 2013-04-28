package InterfaceGraficaUsuario;

import java.awt.Color;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 *
 * @author Ivan Arenas
 *
 */

public class PanelProcesar extends JPanel {

   
   private JButton botonProcesar;
   
   
    
    public PanelProcesar(PanelGeneralOpciones objeto) {
        botonProcesar = new JButton("Procesar");
    
        ManejadorEventosProcesar evento = new ManejadorEventosProcesar();
        
        this.setLayout(null);
        this.add(botonProcesar);
        botonProcesar.setBounds(290,165,320,30);
        botonProcesar.addActionListener(evento);
       
    }
   
    
    
    
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
