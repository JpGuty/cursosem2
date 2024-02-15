/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.cursosem2;

import Modelo.Punto2D;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author juan_p.gutierrez
 */
public class FXMLPuntosController implements Initializable {

 
    //Punto2D h = new Punto2D(0, 0);
    /**
     * Initializes the controller class.
     */
    @FXML
    public Label idLabel1;
    @FXML
    public Canvas idCanvas;
    @FXML 
    public TextArea idTXTArea;
    @FXML
    public menuBar idMenuB;
    
    GraphicsContext g;
    LinkedList<Punto2D> listaP;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        listaP = new LinkedList();
        g=idCanvas.getGraphicsContext2D();
        double h = idCanvas.getHeight();
        double w = idCanvas.getWidth();
        
        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);
    }    
    
    @FXML
    public void idClick(MouseEvent m){
        System.out.println("a");
        double x =m.getX();
        double y=m.getY();
      
       
        System.out.println("x es " + x + "Y es " + y );
        listaP.add(new Punto2D(x,y));
    }
    
    @FXML
    public void mostrarPuntos(ActionEvent a){
       
        String mostrar ="";
        for (int i = 0; i< listaP.size(); i++){
            Punto2D get = listaP.get(i);
            mostrar += get.toString() + "\n";
                
            
        }
        idTXTArea.setText(mostrar);
    }
    
    
    
    
    
    
    
    
    
    @FXML
    public void datosJson(ActionEvent b){
        
        String asd = listaP.toString();
        
        
    }


}
