/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoProcesador;

import InterfaceGraficaUsuario.VentanaPrincipalProcesador;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ivan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        try {
            //Muestra el aspecto de las ventanas propio de los sistemas Windows
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
            //Muestra el aspecto de las ventanas propio del Sistema Operativo donde se ejecute
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        
        VentanaPrincipalProcesador ventanaPrincipalProcesador = new VentanaPrincipalProcesador();
    }
}
