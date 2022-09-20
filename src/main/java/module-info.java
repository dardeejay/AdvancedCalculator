module com.example.advancedcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.act2a.advancedcalculator to javafx.fxml;
    exports com.act2a.advancedcalculator;
}