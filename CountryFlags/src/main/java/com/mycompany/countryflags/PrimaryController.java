package com.mycompany.countryflags;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    @FXML
    private Rectangle top;
    @FXML
    private Rectangle middle;
    @FXML
    private Rectangle bottom;
    @FXML
    private Button clear;
    @FXML
    private Button lesotho;
    @FXML
    private Button austria;
    @FXML
    private Button serbia;
    @FXML
    private Button bulgaria;
    @FXML
    private Button bolivia;
    
    
    @FXML
    private void lesothoFlag(ActionEvent event) {
        top.setFill(Color.BLUE);
        middle.setFill(Color.WHITE);
        bottom.setFill(Color.GREEN);
    }

    @FXML
    private void austriaFlag(ActionEvent event) {
        top.setFill(Color.RED);
        middle.setFill(Color.WHITESMOKE);
        bottom.setFill(Color.RED);
    }

    @FXML
    private void serbiaFlag(ActionEvent event) {
        top.setFill(Color.WHITESMOKE);
        middle.setFill(Color.GREEN);
        bottom.setFill(Color.RED);
    }

    @FXML
    private void bulgariaFlag(ActionEvent event) {
        top.setFill(Color.RED);
        middle.setFill(Color.BLUE);
        bottom.setFill(Color.WHITESMOKE);
    }

    @FXML
    private void boliviaFlag(ActionEvent event) {
        top.setFill(Color.RED);
        middle.setFill(Color.YELLOW);
        bottom.setFill(Color.GREEN);
    }

    @FXML
    private void clearFlags(ActionEvent event) {
        top.setFill(Color.BLACK);
        middle.setFill(Color.BLACK);
        bottom.setFill(Color.BLACK);
    }
}
