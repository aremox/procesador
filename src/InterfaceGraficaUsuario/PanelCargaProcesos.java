package InterfaceGraficaUsuario;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 *
 * @author Ivan Arenas
 *
 */

public class PanelCargaProcesos extends JPanel {

   
   private JButton botonCancelar;
   private JButton botonCargar;
   private JTextField CampoNombre;
   private JTextField CampoLlegada;
   private JTextField CampoServicio;
   private JTextField CampoPrioridad;
   
    
    public PanelCargaProcesos(PanelGeneralOpciones objeto) {
        //Establecer tamaño y otros parámetros
        //Inicializar controles
        JLabel etiquetaNombre = new JLabel("Nombre : ");
        JLabel etiquetaLlegada = new JLabel("Tiempo llegada: ");
        JLabel etiquetaServicio = new JLabel("Tiempo servicio: ");
        JLabel etiquetaPrioridad = new JLabel("Prioridad: ");
        CampoNombre = new JTextField(20);
        CampoServicio = new JTextField(20);
        CampoLlegada = new JTextField(20);
        CampoPrioridad = new JTextField(20);
        botonCancelar = new JButton("Cancelar");
        botonCargar = new JButton("Cargar");
        

            
        this.setLayout(null);
        this.add(etiquetaNombre);
        etiquetaNombre.setBounds(200,165,120,30);
        this.add(CampoNombre);
        CampoNombre.setBounds(300,165,120,30);
        this.add(etiquetaLlegada);
        etiquetaLlegada.setBounds(200,200,120,30);
        this.add(CampoLlegada);
        CampoLlegada.setBounds(300,200,120,30);
        this.add(etiquetaServicio);
        etiquetaServicio.setBounds(200,235,120,30);
        this.add(CampoServicio);
        CampoServicio.setBounds(300,235,120,30);
        this.add(etiquetaPrioridad);
        etiquetaPrioridad.setBounds(200,270,120,30);
        this.add(CampoPrioridad);
        CampoPrioridad.setBounds(300,270,120,30);
        
        

        ManejadorEventosAddProcesos evento = new ManejadorEventosAddProcesos(this,objeto);
        
        
       
        this.add(botonCargar);
        botonCargar.addActionListener(evento);
        botonCargar.setBounds(670,380,150,30);
        botonCargar.setEnabled(true);
       
    }
    public JTextField getCampoNombre(){
        return CampoNombre;
    }
    public JTextField getCampoLlegada(){
        return CampoLlegada;
    }
    public JTextField getCampoServicio(){
        return CampoServicio;
    }
    public JTextField getCampoPrioridad(){
        return CampoPrioridad;
    }
    
    public void setInicial(){
        CampoNombre.setText("");
        CampoLlegada.setText("");
        CampoServicio.setText("");
        CampoPrioridad.setText("");
    }
    
    
    
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
