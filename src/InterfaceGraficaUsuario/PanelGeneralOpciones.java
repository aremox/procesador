package InterfaceGraficaUsuario;


import java.io.File;
import javax.swing.JTabbedPane;

/*
 *
 * @author Ivan Arenas
 * @author Javier Roncero
 *
 */

public class PanelGeneralOpciones extends JTabbedPane {
    private File directorioActual = new File("src//ArchivoDatos//");

    public PanelGeneralOpciones() {
        //Crear un panel por cada pestaña
        //Pestaña carga de clientes
        PanelCargaProcesos tabA = new PanelCargaProcesos(this);
        PanelProcesar tabB = new PanelProcesar(this);
       // PanelCargarVentas tabC = new PanelCargarVentas(this);
               
        tabA.setSize( 100,100);
        this.addTab( "Carga de procesos" , tabA );
        //pestaña carga de articulos

        tabB.setSize( 100,100 );
         this.addTab( "Procesar" , tabB );
/*
        tabC.setSize( 100,100 );
         this.addTab( "Carga de ventas" , tabC );
         
       */
         
    }

    public File getCurrentDirectory(){
        return directorioActual;
    }

    public void setCurrentDirectory(File dir){
        directorioActual = dir;
    }
    
}
