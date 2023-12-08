module com.mycompany.personalityquiz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.personalityquiz to javafx.fxml;
    exports com.mycompany.personalityquiz;
}
