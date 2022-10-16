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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static com.example.app.OrderItems.items;

public class BakeryController {

    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addTiramisu;

    @FXML
    private Button addNapoleon;

    @FXML
    private Button addCheesecake;

    @FXML
    private Button buyCake;

    @FXML
    private Button cart;

    @FXML
    void initialize() {
        buyCake.setOnAction(event -> {
            System.out.println("SLAAAAAY");
        });


    }

    public void changeSceneButton(ActionEvent event) throws IOException {

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene cartScene = new Scene(root, 640, 480);
        window.setScene(cartScene);
        window.show();
        window.setResizable(false);
    }

    public void addTiramisuButton(ActionEvent event) throws IOException {
        Confectionery confectionery = new Tiramisu();

        addItemToCart(confectionery);
    }

    private void addItemToCart(Confectionery confectionery) throws IOException {

        Cart.getCart().addCheckInfo(confectionery.getDescription() + " - "
                + confectionery.price() + "KZT " + "x" + confectionery.amount());
        String checkInfo = Cart.getCart().showCheckInfo();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));
        root = loader.load();

        CartController cartController = loader.getController();
        cartController.displayCheck(checkInfo);
    }

    public void addNapoleonButton(ActionEvent event) throws IOException {
        Confectionery confectionery = new NapoleonCake();

        addItemToCart(confectionery);
    }

    public void addCheesecakeButton(ActionEvent event) throws IOException {
        Confectionery confectionery = new Cheesecake();

        addItemToCart(confectionery);
    }

}
