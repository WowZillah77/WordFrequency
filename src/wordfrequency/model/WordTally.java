/*
 * this class construct the object that will be part of the logic of word display 
based on correct and incorrect guess of a given word
 */
package wordfrequency.model;

/**
 *
 * @author david
 */
public class WordTally {
    
    private int idUser,idWord,nbIncorrect,nbCorrect;
    
    
    //full constructor

    public WordTally(int idUser, int idWord, int nbIncorrect, int nbCorrect) {
        this.idUser = idUser;
        this.idWord = idWord;
        this.nbIncorrect = nbIncorrect;
        this.nbCorrect = nbCorrect;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdWord() {
        return idWord;
    }

    public void setIdWord(int idWord) {
        this.idWord = idWord;
    }

    public int getNbIncorrect() {
        return nbIncorrect;
    }

    public void setNbIncorrect(int nbIncorrect) {
        this.nbIncorrect = nbIncorrect;
    }

    public int getNbCorrect() {
        return nbCorrect;
    }

    public void setNbCorrect(int nbCorrect) {
        this.nbCorrect = nbCorrect;
    }
    
    
    
}
