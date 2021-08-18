/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JOptionPane;

/**
 *
 * @author betsy.moreno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label dados;
    @FXML
    private Label lanzamientos;
    @FXML
    private ImageView dado1;
    @FXML
    private ImageView dado2;
    
    @FXML
    WebView listaLanzamiento = new WebView();
    WebEngine webEngine = listaLanzamiento.getEngine();
    
    
    @FXML
    private void IniciarDados(ActionEvent event) {
        
        int dado1= (int)(Math.random()*6+1);
        JOptionPane.showMessageDialog(null, dado1);
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
