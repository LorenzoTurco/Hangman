package src;

/*A class responsible for storing your words with a method to randomly select a word.
A class responsible for displaying the results of the guess.
A class responsible for interacting with the player e.g. capture input, print messages.
A class responsible for connecting these classes together and running the game.*/

public class Main {
    public static void main(String args[]){
        startGame();
    }
    public static void startGame(){
        final Result result = new Result();
        final WordList wordList = new WordList();
        final Interaction interactions = new Interaction();

        System.out.println(wordList.getWordToGuess());
        System.out.println(interactions.getIntroduction());

        interactions.updateHangManImage(result.getLives());

        while(!wordList.checkIfGuessed() && result.getLives()>0){

            String guessedLetter = interactions.askForLetter(wordList.getCurrentWordState());

            if(wordList.remainingLettersToGuess().toLowerCase().contains(guessedLetter.toLowerCase())){
                System.out.println(interactions.CorrectCharGuessMessage(guessedLetter));
                wordList.updateWordToGuess(guessedLetter.charAt(0));
            }
            else{
                System.out.println(interactions.WrongCharGuessMessage(guessedLetter));
                result.reduceLives();
            }

            //UPDATE BOARD DISPLAYED IMAGES
            interactions.updateHangManImage(result.getLives());


        }

        if(wordList.checkIfGuessed()){
            System.out.println(interactions.WonMessage());
        }else{
            System.out.println(interactions.LostMessage());
        }
    }
}
