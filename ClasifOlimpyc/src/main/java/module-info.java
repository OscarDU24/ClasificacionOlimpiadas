module org.example.clasifolimpyc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.clasifolimpyc to javafx.fxml;
    exports org.example.clasifolimpyc;
}