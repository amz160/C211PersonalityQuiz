module com.mycompany.personalityquiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.mycompany.personalityquiz to javafx.fxml;
    exports com.mycompany.personalityquiz;
}
