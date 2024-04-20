package org.example.javafx;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import static org.example.EcommerceSystem.OOP;
import static org.example.EcommerceSystem.smartphone;
import static org.example.EcommerceSystem.tShirt;
import static org.example.EcommerceSystem.customer;
import static org.example.EcommerceSystem.cart;
import static org.example.EcommerceSystem.order;
import java.io.IOException;

public class ShowController {
    @FXML
    private ListView<String> productListView;
    @FXML
    private Label detailsMessage;

    @FXML
    public void initialize() throws IOException {
        productListView.getItems().addAll(order.getProducts());
        detailsMessage.setText(order.printOrderInfo());
    }
}
