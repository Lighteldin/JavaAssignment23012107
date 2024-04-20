package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.javafx.PrimaryController;
import org.example.javafx.SecondaryController;
import org.example.product.BookProduct;
import org.example.product.ClothingProduct;
import org.example.product.ElectronicProduct;

import java.io.IOException;

public class EcommerceSystem extends Application {
    public static ElectronicProduct smartphone;
    public static ClothingProduct tShirt;
    public static BookProduct OOP;
    public static Customer customer;
    public static Cart cart;
    public static Order order;
    private static Scene scene;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EcommerceSystem.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}