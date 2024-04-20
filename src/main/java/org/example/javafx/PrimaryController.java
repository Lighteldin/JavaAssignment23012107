package org.example.javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Cart;
import org.example.Customer;
import org.example.EcommerceSystem;
import org.example.Order;
import org.example.product.BookProduct;
import org.example.product.ClothingProduct;
import org.example.product.ElectronicProduct;
import static org.example.EcommerceSystem.OOP;
import static org.example.EcommerceSystem.smartphone;
import static org.example.EcommerceSystem.tShirt;
import static org.example.EcommerceSystem.customer;
import static org.example.EcommerceSystem.cart;
import static org.example.EcommerceSystem.order;

public class PrimaryController {
    @FXML
    private Label errorMessage;
    @FXML
    private Button enterButton;
    @FXML
    private TextField addressTextfield;
    @FXML
    private TextField idTextfield;
    @FXML
    private TextField nameTextfield;



    @FXML
    public void initialize() throws IOException {
        smartphone = new ElectronicProduct(1, "Smartphone", 599.9, "Samsung", 1);
        tShirt = new ClothingProduct(2, "T-Shirt", 19.99, "Medium", "Cotton");
        OOP = new BookProduct(3, "OOP", 39.99, "O'Reilly", "X Publications");

        idTextfield.setText("23012107");
        nameTextfield.setText("Noureldin Ashraf Ahmed");
        addressTextfield.setText("Milkyway, Solar System, Earth");
    }


    @FXML
    void onClickEnter(ActionEvent event) throws IOException {

        if (!hasErrors()){
            int id = Integer.parseInt(idTextfield.getText());
            String name = nameTextfield.getText();
            String address = addressTextfield.getText();

            customer = new Customer(id, name, address);
            cart = new Cart(id);
            switchToSecondary();
        }
    }

    private boolean hasErrors(){
        //CHECK IF EMPTY
        String id = idTextfield.getText();
        String address = addressTextfield.getText();
        String name = nameTextfield.getText();
        if (name.isEmpty() || address.isEmpty() || id.isEmpty()){
            errorMessage.setText("ERROR: FILL IN YOUR INFORMATION!");
            return true;
        }
        if(!isNumeric(id)){
            errorMessage.setText("ERROR: ENTER AN APPROPRIATE NUMERIC ID!");
            return true;
        }
        return false;
    }

    private boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private void switchToSecondary() throws IOException {
        EcommerceSystem.setRoot("secondary");
    }
}
