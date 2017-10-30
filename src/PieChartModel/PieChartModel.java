/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PieChartModel;

import javafx.application.*;
import javafx.collections.*;
import javafx.scene.*;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.*;

/**
 *
 * @author mlh5614
 */
public class PieChartModel extends Application {
//PieChartModel p1;
private static Stage theStage;
private static PieChart theChart;
String[] args = null;
Scene scene;
//PieChart chart;
//ObservableList<PieChart.Data> pieChartdata = FXCollections.observableArrayList();

    @Override public void start(Stage stage) {
        scene = new Scene(new Group());
        
        stage.setTitle("Food/Mood Pie Chart Prototype");
        stage.setWidth(500);
        stage.setHeight(500);
        
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
        new PieChart.Data("Default 1", 50),
        new PieChart.Data("Default 2", 50));
        //new PieChart.Data("Strawberry", 50));
    
    PieChart chart = new PieChart(pieChartData);
    
    //addDataMethod(chart, "Pears", 50); //use this method to customize the prototype values
    //chart.setData(pieChartData);
    chart.setTitle("Food/Mood Pie Chart Prototype");
    
    ((Group) scene.getRoot()).getChildren().add(chart);
    stage.setScene(scene);
    setTheChart(chart);
    stage.show();    
}
    public PieChartModel() {
        //launch(args);
    }
    
    public void launchApp() {   //add parameters here to pass from createChart in chartsController
        launch(args);
        //chart = new PieChart();
        //return scene;
    }
    
    public static PieChart getTheChart() {
        return theChart;
    }
    
    private void setTheChart(PieChart chart) {
        PieChartModel.theChart = chart;
    }
    
   /* public void populatePrototype(Scene scene) {
      // scene = new Scene(new Group());
       
       //ObservableList<PieChart.Data> pieChartData = chart.getData();
       
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
        new PieChart.Data("Apple", 33),
        new PieChart.Data("Pear", 33),
        new PieChart.Data("Bear", 34));
      

        System.out.println(chart.getData());
        //chart.setData(pieChartData);
        
        chart = new PieChart(pieChartData);
            chart.setTitle("Forks and Spoons");
    
    ((Group) scene.getRoot()).getChildren().add(chart);
        
   //     pieChartData.add("Apple",100);
    }
    */
   // final PieChart chart = new PieChart(pieChartData);
    
   /*public PieChartModel getInstance() {
       if (p1 == null) {
           p1 = new PieChartModel();
       }
       
       return p1;
   }*/ 
    
    public void addSlice(PieChart chart, String name, double value) {
        ObservableList<PieChart.Data> pieChartData;
        //scene = stage.getScene();
        //chart = (PieChart)  ((Group) scene.getRoot()).getChildren().get(0);
        
        pieChartData = chart.getData();
        pieChartData.add(new Data(name, value));
        chart.setData(pieChartData);
        setTheChart(chart);
        
        
    }
    
    public void addDataMethod(PieChart chart, String name, double value) {
       //ADD CODE HERE TO PULL CHART DATA FROM STORAGE :)
       
        ObservableList<PieChart.Data> pieChartData;
        //scene = stage.getScene();
        //int theIndex = ((Group) scene.getRoot()).getChildren().lastIndexOf(chart);
//        chart = (PieChart) ((Group) scene.getRoot()).getChildren().get(0);
        pieChartData = chart.getData();
        
        for(Data d : pieChartData) {
            if(d.getName().equals(name))
            {
                d.setPieValue(value);
                return;
            }
        }
        addSlice(chart, name, value);
    }
    
   public static void main(String[] args) {
        launch(args);
    }
}
