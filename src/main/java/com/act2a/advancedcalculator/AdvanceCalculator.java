package com.act2a.advancedcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdvanceCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.setProperty("prism.lcdtext", "false");
        FXMLLoader fxmlLoader = new FXMLLoader(AdvanceCalculator.class.getResource("AdvancedCalcu.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        stage.setResizable(false);
        stage.setTitle("Advance Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}