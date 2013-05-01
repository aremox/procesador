/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlServicio;

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
    
   public ControlServicioGrafica()
	{
		
	}
   public void DesarrollarServicio()
	{
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
    ); */
    
    
    ////////////////////////////////////////////////////////
    XYSeries series = new XYSeries("Random Data");
        series.add(0.0, 1);
        series.add(1.0, 1);
        series.add(2.0, 1);
        series.add(3.0, 1);
        series.add(4.0, 1);
        series.add(5.0, 1);
        series.add(6.0, null);
        series.add(7.0, 1);
        series.add(9.0, 1);
     XYSeries series2 = new XYSeries("Random Data2");
        series2.add(0.0, 2);
        series2.add(1.0, 2);
        series2.add(2.0, 2);
        series2.add(3.0, 2);
        series2.add(4.0, 2);
        series2.add(5.0, 2);
        series2.add(6.0, null);
        series2.add(7.0, 2);
        series2.add(9.0, 2);
        XYSeriesCollection data = new XYSeriesCollection(series);
        data.addSeries(series2);
    JFreeChart chart = ChartFactory.createXYLineChart(
            "XY Series Demo",
            "X", 
            "Y", 
            data,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
    
    ChartFrame frame = new ChartFrame("Graficador", chart); 
    frame.pack(); 
    frame.setVisible(true); 
	}
private IntervalXYDataset createDataset() {
        final XYSeries series = new XYSeries("Random Data");
        series.add(1.0, 400.2);
        series.add(5.0, 294.1);
        series.add(4.0, 100.0);
        series.add(12.5, 734.4);
        series.add(17.3, 453.2);
        series.add(21.2, 500.2);
        series.add(21.9, null);
        series.add(25.6, 734.4);
        series.add(30.0, 453.2);
        final XYSeriesCollection dataset = new XYSeriesCollection(series);
        return dataset;
    }
	
}
