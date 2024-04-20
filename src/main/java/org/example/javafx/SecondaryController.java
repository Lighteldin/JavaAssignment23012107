package org.example.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import org.example.EcommerceSystem;
import org.example.Order;
import org.example.product.Product;

import static org.example.EcommerceSystem.OOP;
import static org.example.EcommerceSystem.smartphone;
import static org.example.EcommerceSystem.tShirt;
import static org.example.EcommerceSystem.customer;
import static org.example.EcommerceSystem.cart;
import static org.example.EcommerceSystem.order;



public class SecondaryController {
    @FXML
    private ListView<String> productListView;
    @FXML
    private Label welcomeMessage;
    @FXML
    private Label totalMessage;




    @FXML
    public void initialize() throws IOException {
        String welcomemsg = welcomeMessage.getText().replaceAll("replace", customer.getName());
        welcomeMessage.setText(welcomemsg);

    }




    @FXML
    void onClickOOP(ActionEvent event) {
        cart.addProduct(OOP);
        addProductToViewList(OOP.getName());
        totalMessage.setText("TOTAL: $"+cart.calculatePrice());
    }

    @FXML
    void onClickSmartphone(ActionEvent event) {
        cart.addProduct(smartphone);
        addProductToViewList(smartphone.getName());
        totalMessage.setText("TOTAL: $"+cart.calculatePrice());
    }

    @FXML
    void onClickTshirt(ActionEvent event) {
        cart.addProduct(tShirt);
        addProductToViewList(tShirt.getName());
        totalMessage.setText("TOTAL: $"+cart.calculatePrice());
    }

    @FXML
    void onClickCancelOrder(ActionEvent event) {
        cart.removeAllProducts();
        productListView.getItems().clear();
        totalMessage.setText("TOTAL: $"+cart.calculatePrice());
    }

    @FXML
    void onClickCreateOrder(ActionEvent event) throws IOException {
        order = cart.placeOrder();
        switchToShow();
    }


    private void addProductToViewList(String productName){
        productListView.getItems().add(productName);
    }

    private void switchToShow() throws IOException {
        EcommerceSystem.setRoot("show");
    }
}