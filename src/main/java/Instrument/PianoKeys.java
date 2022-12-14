package Instrument;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


import java.io.File;


public class PianoKeys{
    MediaPlayer soundPlayer;
    Media keySound;
    int keyOctave;
    keyName k;

    public PianoKeys(keyName key, int keyOctave){
        this.keyOctave = keyOctave;
        this.k = key;
        if(key == keyName.C){
            octavePick("C", String.valueOf(keyOctave));
        } else if (key == keyName.DFLAT) {
            octavePick("Db", String.valueOf(keyOctave));
        } else if (key == keyName.D) {
            octavePick("D", String.valueOf(keyOctave));
        } else if (key == keyName.EFLAT) {
            octavePick("Eb", String.valueOf(keyOctave));
        } else if (key == keyName.E) {
            octavePick("E", String.valueOf(keyOctave));
        } else if (key == keyName.F) {
            octavePick("F", String.valueOf(keyOctave));
        } else if (key == keyName.GFLAT) {
            octavePick("Gb", String.valueOf(keyOctave));
        } else if (key == keyName.G) {
            octavePick("G", String.valueOf(keyOctave));
        } else if (key == keyName.AFLAT) {
            octavePick("Ab", String.valueOf(keyOctave));
        } else if (key == keyName.A) {
            octavePick("A", String.valueOf(keyOctave));
        } else if (key == keyName.BFLAT) {
            octavePick("Bb", String.valueOf(keyOctave));
        } else if (key == keyName.B) {
            octavePick("B", String.valueOf(keyOctave));
        }

    }

    public void playKey(){
        soundPlayer.seek(soundPlayer.getStartTime());
        soundPlayer.play();
    }

    private void octavePick(String key, String octave){
        String source = "src/main/resources/com/finals/myfinalproject/audio/";
        String extension = ".mp3";
        String fileName = source + key + octave + extension;
        System.out.println(fileName);
        try{

            this.keySound = new Media(new File(fileName).toURI().toString());
            soundPlayer = new MediaPlayer(keySound);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
