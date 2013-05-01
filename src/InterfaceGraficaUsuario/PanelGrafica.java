package InterfaceGraficaUsuario;


import javax.swing.JButton;
import javax.swing.JPanel;


/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class PanelGrafica extends JPanel{

    private JButton botonVerGrafica;


    /**
     *
     */
    public PanelGrafica(PanelGeneralOpciones objeto){
        //Establecer tamaño y otros parámetros
        //Inicializar controles

        botonVerGrafica = new JButton("Ver Grafica");
    
        ManejadorEventosGrafica evento = new ManejadorEventosGrafica();
        
        this.setLayout(null);
        this.add(botonVerGrafica);
        botonVerGrafica.setBounds(290,165,320,30);
        botonVerGrafica.addActionListener(evento);
       
    }

    
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }



}
