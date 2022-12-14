package com.finals.myfinalproject;

import Instrument.Animal;
import Instrument.Dog;
import Instrument.Piano;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;

import java.util.ArrayList;

public class PianoController{
    private Piano p;
    private ArrayList<Animal> animals;
    private Animal a;
    private Animal d;
    @FXML
    MenuButton moreButton;
    @FXML
    private Button keyC2;
    @FXML
    private Button keyC3;
    @FXML
    private Button keyC4;
    @FXML
    private Button keyC5;
    @FXML
    private Button keyC6;

    @FXML
    private Button keyDb2;
    @FXML
    private Button keyDb3;
    @FXML
    private Button keyDb4;
    @FXML
    private Button keyDb5;
    @FXML
    private Button keyDb6;

    @FXML
    private Button keyD2;
    @FXML
    private Button keyD3;
    @FXML
    private Button keyD4;
    @FXML
    private Button keyD5;
    @FXML
    private Button keyD6;


    @FXML
    private Button keyEb2;
    @FXML
    private Button keyEb3;
    @FXML
    private Button keyEb4;
    @FXML
    private Button keyEb5;
    @FXML
    private Button keyEb6;


    @FXML
    private Button keyE2;
    @FXML
    private Button keyE3;
    @FXML
    private Button keyE4;
    @FXML
    private Button keyE5;
    @FXML
    private Button keyE6;

    @FXML
    private Button keyF2;
    @FXML
    private Button keyF3;
    @FXML
    private Button keyF4;
    @FXML
    private Button keyF5;

    @FXML
    private Button keyGb2;
    @FXML
    private Button keyGb3;
    @FXML
    private Button keyGb4;
    @FXML
    private Button keyGb5;

    @FXML
    private Button keyG1;
    @FXML
    private Button keyG2;
    @FXML
    private Button keyG3;
    @FXML
    private Button keyG4;
    @FXML
    private Button keyG5;

    @FXML
    private Button keyAb1;
    @FXML
    private Button keyAb2;
    @FXML
    private Button keyAb3;
    @FXML
    private Button keyAb4;
    @FXML
    private Button keyAb5;

    @FXML
    private Button keyA1;
    @FXML
    private Button keyA2;
    @FXML
    private Button keyA3;
    @FXML
    private Button keyA4;
    @FXML
    private Button keyA5;

    @FXML
    private Button keyBb1;
    @FXML
    private Button keyBb2;
    @FXML
    private Button keyBb3;
    @FXML
    private Button keyBb4;
    @FXML
    private Button keyBb5;

    @FXML
    private Button keyB1;
    @FXML
    private Button keyB2;
    @FXML
    private Button keyB3;
    @FXML
    private Button keyB4;
    @FXML
    private Button keyB5;

    public void initialize(){
        p = new Piano();
        animals = new ArrayList<>();
        animals.add(new Animal("None"));
        animals.add(new Dog());
    }
    public Piano getPiano(){
        return p;
    }

    public void playKeyG1(){
        p.getKey("G", 1).playKey();
    } public void playKeyAb1(){
        p.getKey("Ab", 1).playKey();
    } public void playKeyA1(){
        p.getKey("A", 1).playKey();
    } public void playKeyBb1(){
        p.getKey("Bb", 1).playKey();
    } public void playKeyB1(){
        p.getKey("B", 1).playKey();
    } public void playKeyC2(){
        p.getKey("C", 2).playKey();
    } public void playKeyDb2(){
        p.getKey("Db", 2).playKey();
    } public void playKeyD2(){
        p.getKey("D", 2).playKey();
    } public void playKeyEb2(){
        p.getKey("Eb", 2).playKey();
    } public void playKeyE2(){
        p.getKey("E", 2).playKey();
    } public void playKeyF2(){
        p.getKey("F", 2).playKey();
    } public void playKeyGb2(){
        p.getKey("Gb", 2).playKey();
    } public void playKeyG2(){
        p.getKey("G", 2).playKey();
    } public void playKeyAb2(){
        p.getKey("Ab", 2).playKey();
    } public void playKeyA2(){
        p.getKey("A", 2).playKey();
    } public void playKeyBb2(){
        p.getKey("Bb", 2).playKey();
    } public void playKeyB2(){
        p.getKey("B", 2).playKey();
    } public void playKeyC3(){
        p.getKey("C", 3).playKey();
    } public void playKeyDb3(){
        p.getKey("Db", 3).playKey();
    } public void playKeyD3(){
        p.getKey("D", 3).playKey();
    } public void playKeyEb3(){
        p.getKey("Eb", 3).playKey();
    } public void playKeyE3(){
        p.getKey("E", 3).playKey();
    } public void playKeyF3(){
        p.getKey("F", 3).playKey();
    } public void playKeyGb3(){
        p.getKey("Gb", 3).playKey();
    } public void playKeyG3(){
        p.getKey("G", 3).playKey();
    } public void playKeyAb3(){
        p.getKey("Ab", 3).playKey();
    } public void playKeyA3(){
        p.getKey("A", 3).playKey();
    } public void playKeyBb3(){
        p.getKey("Bb", 3).playKey();
    } public void playKeyB3(){
        p.getKey("B", 3).playKey();
    } public void playKeyC4(){
        p.getKey("C", 4).playKey();
    } public void playKeyDb4(){
        p.getKey("Db", 4).playKey();
    } public void playKeyD4(){
        p.getKey("D", 4).playKey();
    } public void playKeyEb4(){
        p.getKey("Eb", 4).playKey();
    } public void playKeyE4(){
        p.getKey("E", 4).playKey();
    } public void playKeyF4(){
        p.getKey("F", 4).playKey();
    } public void playKeyGb4(){
        p.getKey("Gb", 4).playKey();
    } public void playKeyG4(){
        p.getKey("G", 4).playKey();
    } public void playKeyAb4(){
        p.getKey("Ab", 4).playKey();
    } public void playKeyA4(){
        p.getKey("A", 4).playKey();
    } public void playKeyBb4(){
        p.getKey("Bb", 4).playKey();
    } public void playKeyB4(){
        p.getKey("B", 4).playKey();
    } public void playKeyC5(){
        p.getKey("C", 5).playKey();
    } public void playKeyDb5(){
        p.getKey("Db", 5).playKey();
    } public void playKeyD5(){
        p.getKey("D", 5).playKey();
    } public void playKeyEb5(){
        p.getKey("Eb", 5).playKey();
    } public void playKeyE5(){
        p.getKey("E", 5).playKey();
    } public void playKeyF5(){
        p.getKey("F", 5).playKey();
    } public void playKeyGb5(){
        p.getKey("Gb", 5).playKey();
    } public void playKeyG5(){
        p.getKey("G", 5).playKey();
    } public void playKeyAb5(){
        p.getKey("Ab", 5).playKey();
    }public void playKeyA5(){
        p.getKey("A", 5).playKey();
    } public void playKeyBb5(){
        p.getKey("Bb", 5).playKey();
    } public void playKeyB5(){
        p.getKey("B", 5).playKey();
    } public void playKeyC6(){
        p.getKey("C", 6).playKey();
    } public void playKeyDb6(){
        p.getKey("Db", 6).playKey();
    } public void playKeyD6(){
        p.getKey("D", 6).playKey();
    } public void playKeyEb6(){
        p.getKey("Eb", 6).playKey();
    } public void playKeyE6(){
        p.getKey("E", 6).playKey();
    }
    public void playAnimalNone(){
        animals.get(0).playSound();
    }
    public void playAnimalDog(){
        animals.get(1).playSound();
    }
}
