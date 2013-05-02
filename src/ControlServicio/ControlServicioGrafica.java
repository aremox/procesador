/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;

import Entidades.ColaGraficaSJF;
import Entidades.ColaTerminadosSRT;
import Entidades.Proceso;
import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ivan
 */
public class ControlServicioGrafica {
    private XYSeriesCollection data = new XYSeriesCollection();
    public ControlServicioGrafica() {
    }

    public void DesarrollarServicio() {
        /*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.addValue(1.0, "Egresos", "Enero"); 
         dataset.addValue(3.0, "Egresos", "Febrero"); 
         dataset.addValue(2.0, "Egresos", "Marzo"); 
         dataset.addValue(2.0, "Ingresos", "Enero"); 
         dataset.addValue(3.0, "Ingresos", "Febrero"); 
         dataset.addValue(4.0, "Ingresos", "Marzo"); 
         JFreeChart chart = ChartFactory.createBarChart( 
         "Grafica de barras", // El titulo de la gráfica 
         "Mes", // Etiqueta de categoria 
         "Valor", // Etiqueta de valores 
         dataset, // Datos 
         PlotOrientation.VERTICAL, // orientacion 
         true, // Incluye Leyenda 
         true, // Incluye tooltips 
         false // URLs? 
         ); 

         XYSeries series = new XYSeries("Random Data");
         series.add(0, null);
         series.add(1, 1);
         series.add(2, 1);
         series.add(3, null);
         series.add(4, null);
         series.add(5, 1);
         series.add(6, null);
         series.add(7, 1);
         series.add(9, null);
         XYSeries series2 = new XYSeries("Random Data2");
         series2.add(0, 2);
         series2.add(1, 2);
         series2.add(2, null);
         series2.add(3, null);
         series2.add(2, 2);
         series2.add(5, null);
         series2.add(6, 2);
         series2.add(7, null);
         series2.add(9, 2);
         XYSeriesCollection data = new XYSeriesCollection(series);
         data.addSeries(series2);
         data.getSeriesCount();
         */
        ////////////////////////////////////////////////////////
         generarDatos();
        JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Series Demo",
                "X",
                "Y",
                data,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        ChartFrame frame = new ChartFrame("Graficador", chart);
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
}
