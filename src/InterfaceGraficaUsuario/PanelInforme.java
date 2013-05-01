package InterfaceGraficaUsuario;


import javax.swing.JButton;
import javax.swing.JPanel;


/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class PanelInforme extends JPanel{

    private JButton botonVerInforme;


    /**
     *
     */
    public PanelInforme(PanelGeneralOpciones objeto){
        //Establecer tamaño y otros parámetros
        //Inicializar controles

        botonVerInforme = new JButton("Ver informe");
    
        ManejadorEventosInforme evento = new ManejadorEventosInforme();
        
        this.setLayout(null);
        this.add(botonVerInforme);
        botonVerInforme.setBounds(290,165,320,30);
        botonVerInforme.addActionListener(evento);
       
    }

    
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
