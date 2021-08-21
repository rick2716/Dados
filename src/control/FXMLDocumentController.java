/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;




import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
    
    Image Recurso_1;
    Image Recurso_2;
    Image Recurso_3;
    Image Recurso_4;
    Image Recurso_5;
    Image Recurso_6;
    
    LinkedList<Image> listaImagenes;
    
    
    
    @FXML
    WebView listaLanzamiento = new WebView();
    WebEngine webEngine = listaLanzamiento.getEngine();
    
    
    @FXML
    private void IniciarDados(ActionEvent event) {
        int i = (int)(Math.random()*6+1);
        int j = (int)(Math.random()*6+1);
        TimerTask timerTask = new TimerTask(){
            @Override
            public void run() {
                dado1.setImage(listaImagenes.get(i-1));
                dado2.setImage(listaImagenes.get(j-1));
            }
        };
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 3000);
        
        
;
        
       
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        webEngine = listaLanzamiento.getEngine();
        listaImagenes = new LinkedList<>();
        Recurso_1 = new Image("/imagenes/Recurso_1.png");
        Recurso_2 = new Image("/imagenes/Recurso_2.png");
        Recurso_3 = new Image("/imagenes/Recurso_3.png");
        Recurso_4 = new Image("/imagenes/Recurso_4.png");
        Recurso_5 = new Image("/imagenes/Recurso_5.png");
        Recurso_6 = new Image("/imagenes/Recurso_6.png");
        listaImagenes.add(Recurso_1);
        listaImagenes.add(Recurso_2);
        listaImagenes.add(Recurso_3);
        listaImagenes.add(Recurso_4);
        listaImagenes.add(Recurso_5);
        listaImagenes.add(Recurso_6);
    }    
    
}
