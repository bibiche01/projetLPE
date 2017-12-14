
package lpe_soft.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class EditLivraisonController implements Initializable {
    
    @FXML private Button btnBack;
    @FXML private Button btnSave;
    @FXML private Label Nom;
    @FXML private Label NCommande;
    @FXML private DatePicker expe;
    @FXML private TextField NbColis;
    @FXML private TextField QteFacture;
    @FXML private TextField QteLivre;
    @FXML private TextField tfControle;
    @FXML private RadioButton rbtnVisu;        
    @FXML private RadioButton rbtnElec;
    @FXML private RadioButton rbtnAOI;        
    @FXML private RadioButton rbtnLibre;
    @FXML private RadioButton rbtnOui;        
    @FXML private RadioButton rbtnNon;
    @FXML private RadioButton rbtnS;        
    @FXML private RadioButton rbtnNS;
    
    @FXML
    private void handleBack (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DetailLivraison.fxml"));
        Scene scene = (Scene) ((Node) event.getSource()).getScene();
        scene.setRoot(root);
    }
    @FXML
    private void handleSave(ActionEvent event) throws IOException {
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
