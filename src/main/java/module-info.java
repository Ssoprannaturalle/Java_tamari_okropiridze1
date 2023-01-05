module com.example.java_tamari_okropiridze {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.java_tamari_okropiridze to javafx.fxml;
    exports com.example.java_tamari_okropiridze;
}