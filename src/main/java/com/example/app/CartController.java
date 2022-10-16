package com.example.app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class CartController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    private Button buyCake;

    @FXML
    private Text cartText;

    @FXML
    private TextFlow cartTextFlow;

    @FXML
    void initialize() {

    }

    public void displayCheck(String checkInfo){
        Text cartText = new Text(checkInfo);
        cartText.setFont(Font.font("system", FontWeight.BOLD, FontPosture.ITALIC, 22));
        cartText.setFill(Color.web("#9e6240"));

        cartTextFlow.getChildren().add(cartText);
        System.out.println(checkInfo);
    }

    public void changeSceneButton(ActionEvent event) throws IOException {
        Parent cartParent = FXMLLoader.load(getClass().getResource("bakery.fxml"));
        Scene cartScene = new Scene(cartParent, 640, 480);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(cartScene);
        window.show();
        window.setResizable(false);
    }

}
