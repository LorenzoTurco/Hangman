package src;
import java.util.ArrayList;
import java.util.Random;

public class WordList {
    private ArrayList<String> words = new ArrayList<>();
    private String wordToGuess = "";
    private String remainingLettersToGuess = "";
    private String currentWordState = "";
    private Random random = new Random();

    public WordList(){
        //default words
        this.words.add("Dog");
        this.words.add("Tiger");
        this.words.add("Elephant");

        this.wordToGuess = words.get(random.nextInt(words.size()));

        this.remainingLettersToGuess = this.wordToGuess;

        for(int i = 0; i<this.wordToGuess.length(); i++){
            this.currentWordState += "_";
        }
    }
    public void updateWordToGuess(char letter){

        for(int i = 0; i<this.remainingLettersToGuess.length(); i++){
            if(this.remainingLettersToGuess.toLowerCase().charAt(i) == Character.toLowerCase(letter)){
                this.currentWordState = this.currentWordState.substring(0,i) + letter + this.currentWordState.substring(i+1);
                this.remainingLettersToGuess = this.remainingLettersToGuess.substring(0,i) + " " + this.remainingLettersToGuess.substring(i+1);
            }
        }
        System.out.println(this.currentWordState);
    }
    public String getWordToGuess(){
        return this.wordToGuess;
    }

    public boolean checkIfGuessed(){
        return this.wordToGuess.toLowerCase().equals(currentWordState.toLowerCase()) ? true : false;
    }
    public String remainingLettersToGuess() {
        return this.remainingLettersToGuess;
    }
    public String getCurrentWordState() {
        return this.currentWordState;
    }
}

