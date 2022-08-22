package src;
import java.util.Scanner;
import java.util.List;
public class Interaction {
    Scanner scanner = new Scanner(System.in);
    final String introduction = "Welcome to Hangman";
    public String getIntroduction(){
        return this.introduction;}

    public String askForLetter(String currentWordState, List lettersGuessed){

        System.out.println("Guess letter: "+ currentWordState);
        System.out.println("Already guessed letters: " + lettersGuessed.toString());
        String letter = scanner.nextLine();

        while(lettersGuessed.contains(letter)){
            System.out.println("letter" + " '" + letter+"' " + "already guessed!");
            System.out.println("Guess different letter: "+ currentWordState);
            System.out.println("Already guessed letters: " + lettersGuessed.toString());
            letter = scanner.nextLine();
        }

        return letter;
    }

    public String correctCharGuessMessage(String guessedChar){
        return guessedChar + " is a CORRECT guess";
    }
    public String wrongCharGuessMessage(String guessedChar){
        return guessedChar + " is a WRONG guess";
    }

    public String showDefinition(String hint){
        return "DEFINITION: " +hint;
    }
    public String wonMessage (){
        return "You WON! You guessed the word correctly!";
    }
    public String lostMessage (String word){
        return "You LOST! You did NOT guess the word correctly! The word was "+ word;
    }

    public void updateHangManImage(int lives){

        switch(lives){

            case 6:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;

            case 5:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println("O   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;

            case 4:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println("O   |");
                System.out.println("|   |");
                System.out.println("    |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();

                break;

            case 3:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|  |");
                System.out.println("    |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;


            case 2:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\\ |");
                System.out.println("    |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;


            case 1:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\\ |");
                System.out.println("/   |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;


            case 0:

                System.out.println();
                System.out.println();
                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\\ |");
                System.out.println("/ \\ |");
                System.out.println("   ———");
                System.out.println();
                System.out.println();
                break;

        }
    }

    public boolean checkIfValidInput(String s){

        if(s.length()>1){return false;}

        //check if it has a number
        if(s.matches("[0-9]")){
            return false;
        }
        return true;
    }
    public void wrongInputMessage(){

        System.out.println();
        System.out.println("You can only pick alphabet characters!");
        System.out.println();
        return;
    }
    public String incorrectMessage(){
        return "Incorrect letter";
    }

    public String goodbye(){
        return "Goodbye";
    }



}
