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
        Scene scene = new Scene(root);
        stage.setTitle("MiniPiano");
        stage.setScene(scene);
        stage.show();
        //Piano p = new Piano();
        //PianoKeys p = new PianoKeys(keyName.G,1);
        //p.playKey();

    }

    public static void main(String[] args) {
        launch();
    }
}