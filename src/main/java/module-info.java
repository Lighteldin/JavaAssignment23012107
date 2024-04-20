module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example to javafx.fxml;
    exports org.example;
    exports org.example.javafx;
    opens org.example.javafx to javafx.fxml;
    exports org.example.product;
    opens org.example.product to javafx.fxml;
}
