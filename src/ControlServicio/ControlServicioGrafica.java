/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;

import Entidades.ColaTerminadosSRT;
import Entidades.Proceso;
import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ivan
 */
public class ControlServicioGrafica {
    private XYSeriesCollection data = new XYSeriesCollection();
    private XYSeriesCollection dataSRT = new XYSeriesCollection();
    public ControlServicioGrafica() {
    }

    public void DesarrollarServicio() {
         generarDatos();
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Grafica SJF",
                "Tiempo",
                "Procesos",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
         
        ChartFrame frame = new ChartFrame("Grafica", chart);
        frame.pack();
        frame.setVisible(true);
    }

    private void generarDatos() {
        LinkedList terminados = ColaTerminadosSRT.getInstancia().getElementos();
         int tam = terminados.size();

        for (int i = 0; i < tam; i++) {
            Proceso pro = (Proceso) terminados.get(i);
            if(pro.getGrafica()!= null){
            data.addSeries(pro.getGrafica());             
            }
        } 
       
    }
    public void DesarrollarServicioSRT() {
         generarDatosSRT();
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Grafica SRT",
                "Tiempo",
                "Procesos",
                dataSRT,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
       
        ChartFrame frame = new ChartFrame("Grafica", chart);
        frame.pack();
        frame.setVisible(true);
    }

    private void generarDatosSRT() {
        LinkedList terminadosSRT = ColaTerminadosSRT.getInstancia().getElementos();
         int tam = terminadosSRT.size();

        for (int i = 0; i < tam; i++) {
            Proceso pro = (Proceso) terminadosSRT.get(i);
            if(pro.getGraficaSRT()!= null){
            dataSRT.addSeries(pro.getGraficaSRT());             
            }
        } 
      
    }
}
