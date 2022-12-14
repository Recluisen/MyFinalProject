package Instrument;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Animal {
    String animalName;
    Media animalSound;
    MediaPlayer animalSoundPlayer;

    public Animal(String name){
        this.animalName = name;
        addSound();
    }
    public void playSound(){
        animalSoundPlayer.seek(animalSoundPlayer.getStartTime());
        animalSoundPlayer.play();
    }

    public void addSound(){
        String fileName = "src/main/resources/com/finals/myfinalproject/audio/no.mp3";
        this.animalSound = new Media(new File(fileName).toURI().toString());
        animalSoundPlayer = new MediaPlayer(animalSound);
    }
}
