package com.finals.myfinalproject;

import Instrument.Piano;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("piano-view.fxml"));
        Parent root = fxmlLoader.load();
        PianoController pC = fxmlLoader.getController();
        pC.initialize();
        Scene scene = new Scene(root);
        stage.setTitle("MiniPiano");
        stage.setScene(scene);
        stage.show();
        //pC.getPiano().getKey("A", 3).playKey();
        //PianoKeys p = new PianoKeys(keyName.G,1);


    }

    public static void main(String[] args) {
        launch();
    }
}