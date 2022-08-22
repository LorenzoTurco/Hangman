package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final Result result = new Result();
    static final WordList wordList = new WordList();
    static final Interaction interactions = new Interaction();
    public static void main(String args[]){
        Main main = new Main();
        main.startGame();
    }
    public static void startGame(){

        boolean showDefinition = false;

        List lettersGuessed = new ArrayList<String>();

        System.out.println(wordList.getWordToGuess());
        System.out.println(interactions.getIntroduction());
        interactions.updateHangManImage(result.getLives());

        while(!wordList.checkIfGuessed() && result.getLives()>0){

            if(!showDefinition){System.out.println("Enter '1' to reveal definition.");}

            String guessedLetter = interactions.askForLetter(wordList.getCurrentWordState(), lettersGuessed, showDefinition);

            if(!guessedLetter.equals("1"))lettersGuessed.add(guessedLetter);

            if(showDefinition){System.out.println(interactions.showDefinition(wordList.getDefinition()));}

            if(guessedLetter.equals("1") && !showDefinition){
                System.out.println(interactions.showDefinition(wordList.getDefinition()));
                showDefinition = true;
                continue;
            }

            if(wordList.remainingLettersToGuess().toLowerCase().contains(guessedLetter.toLowerCase())){
                System.out.println(interactions.correctCharGuessMessage(guessedLetter));
                wordList.updateWordToGuess(guessedLetter.charAt(0));
            }
            else{
                System.out.println(interactions.wrongCharGuessMessage(guessedLetter));
                result.reduceLives();
            }

            //UPDATE BOARD DISPLAYED IMAGES
            interactions.updateHangManImage(result.getLives());
        }
        if(wordList.checkIfGuessed()){
            System.out.println(interactions.wonMessage(wordList.getWordToGuess()));
        }else{
            System.out.println(interactions.lostMessage(wordList.getWordToGuess()));
        }
    }

}
