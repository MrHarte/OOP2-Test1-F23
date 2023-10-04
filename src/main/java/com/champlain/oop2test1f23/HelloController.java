package com.champlain.oop2test1f23;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onByeButtonClick() {
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION, "Bye!");
        confirmAlert.showAndWait();
    }
}