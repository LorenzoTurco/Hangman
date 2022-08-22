package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        startGame();
    }
    public static void startGame(){
        final Result result = new Result();
        final WordList wordList = new WordList();
        final Interaction interactions = new Interaction();
        boolean showDefinition = false;

        List lettersGuessed = new ArrayList<String>();

        System.out.println(wordList.getWordToGuess());
        System.out.println(interactions.getIntroduction());
        interactions.updateHangManImage(result.getLives());

        while(!wordList.checkIfGuessed() && result.getLives()>0){

            if(!showDefinition){System.out.println("Enter '1' to reveal definition.");}

            String guessedLetter = interactions.askForLetter(wordList.getCurrentWordState(), lettersGuessed);
            lettersGuessed.add(guessedLetter);

            if(showDefinition){System.out.println(interactions.showDefinition(wordList.getDefinition()));}

            if(guessedLetter.equals("1") && !showDefinition){
                System.out.println(interactions.showDefinition(wordList.getDefinition()));
                showDefinition = true;
                continue;
            }

            if (!interactions.checkIfValidInput(guessedLetter)){
              interactions.wrongInputMessage();
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
            System.out.println(interactions.wonMessage());
        }else{
            System.out.println(interactions.lostMessage(wordList.getWordToGuess()));
        }
    }

}
