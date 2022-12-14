package Instrument;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Dog extends Animal{

    public Dog() {
        super("Dog");
        addSound();
    }
    @Override
    public void addSound(){
        String fileName = "src/main/resources/com/finals/myfinalproject/audio/Bark-dog-sound.mp3";
        this.animalSound = new Media(new File(fileName).toURI().toString());
        animalSoundPlayer = new MediaPlayer(animalSound);
    }
}
