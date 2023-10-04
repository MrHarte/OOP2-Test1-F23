package com.champlain.oop2test1f23;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        // Create List
        List<Integer> myIntegers = new ReverseArrayList<Integer>();
        myIntegers.add(1);
        myIntegers.add(2);
        myIntegers.add(3);

        // Go through List
        for (Integer number : myIntegers) {
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION, number.toString());
            confirmAlert.showAndWait();
        }
    }

    @FXML
    protected void onByeButtonClick() {
        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION, "Bye!");
        confirmAlert.showAndWait();
    }
}