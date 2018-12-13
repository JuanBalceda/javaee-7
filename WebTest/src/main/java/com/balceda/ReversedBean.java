package com.balceda;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by jbalceda on Dec, 2018
 */
@ManagedBean
@ViewScoped
public class ReversedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String word;
    private String reversedWord;
    private int wordAmount;

    @PostConstruct
    public void init(){

    }

    public void reverse(){
        reversedWord = "";
        wordAmount = 0;

        if (word!=null && !word.isEmpty()){
            wordAmount = 1;
        }

        for (int i = word.length() -1; i>=0;i--){
            char letter = word.charAt(i);
            reversedWord += letter;
            if (letter==' '){
                wordAmount++;
            }
        }
        System.out.println("Reverse Word: " + reversedWord);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getReversedWord() {
        return reversedWord;
    }

    public void setReversedWord(String reversedWord) {
        this.reversedWord = reversedWord;
    }

    public int getWordAmount() {
        return wordAmount;
    }

    public void setWordAmount(int wordsAmount) {
        this.wordAmount = wordsAmount;
    }
}
