/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfrequency.model;

/**
 *
 * @author david
 */
public class Dictionary {
    
    private int id;
    private String englishWord,englishSound,frenchWord,frenchSound;
    //full constructor

    public Dictionary(int id, String englishWord, String englishSound, String frenchWord, String frenchSound) {
        this.id = id;
        this.englishWord = englishWord;
        this.englishSound = englishSound;
        this.frenchWord = frenchWord;
        this.frenchSound = frenchSound;
    }
    
    //constructor without sound

    public Dictionary(int id, String englishWord, String frenchWord) {
        this.id = id;
        this.englishWord = englishWord;
        this.frenchWord = frenchWord;
    }
    
    //constructor for input(again without sound) V1

    public Dictionary(String englishWord, String frenchWord) {
        this.englishWord = englishWord;
        this.frenchWord = frenchWord;
    }
    
    

    public int getId() {
        return id;
    }


    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getEnglishSound() {
        return englishSound;
    }

    public void setEnglishSound(String englishSound) {
        this.englishSound = englishSound;
    }

    public String getFrenchWord() {
        return frenchWord;
    }

    public void setFrenchWord(String frenchWord) {
        this.frenchWord = frenchWord;
    }

    public String getFrenchSound() {
        return frenchSound;
    }

    public void setFrenchSound(String frenchSound) {
        this.frenchSound = frenchSound;
    }
    
    
    
  
}
