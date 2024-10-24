package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class control1 {

    @FXML
    private Button bn;

    @FXML
    private TextField txtRc;

    @FXML
    private TextArea txtu;

    @FXML
    void e(ActionEvent event) {
        String valor = txtRc.getText();
        txtu.setText(valor);

    }

}