package InterfaceGraficaUsuario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JFrame;


/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class VentanaPrincipalProcesador extends JFrame implements Action {

    PanelGeneralOpciones panelOpciones;
    
    public VentanaPrincipalProcesador() {
        //Configurar ventana principal
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.setSize(900, 600);
        this.setTitle("Proyecto Cuadro de Mando");
        this.setResizable(true);
        //Centramos la ventana en la pantalla
        this.setLocationRelativeTo(null);
        //

        



        //Inicializar controles
        panelOpciones = new PanelGeneralOpciones();
        this.setContentPane(panelOpciones);
        //Mostrar ventana principal
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    }

    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}