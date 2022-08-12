package src;
import java.util.Scanner;
public class Interaction {

    String playerName = "player";
    final String introduction = "Welcome to Hangman";

    public String getIntroduction(){
        return this.introduction + " "  + this.playerName + " !!!";
    }

    public String askForLetter(String currentWordState){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess letter: "+ currentWordState);
        String letter = scanner.nextLine();

        return letter;
    }

    public String CorrectCharGuessMessage(String guessedChar){
        return guessedChar + " is a CORRECT guess";
    }
    public String WrongCharGuessMessage(String guessedChar){
        return guessedChar + " is a WRONG guess";
    }

    public String WonMessage (){
        return "You WON! You guessed the word correctly!";
    }
    public String LostMessage (){
        return "You LOST! You did NOT guess the word correctly!";
    }

    public void updateHangManImage(int lives){

        switch(lives){

            case 6:

                System.out.println("+---+");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   ———");
                break;

            case 5:

                System.out.println("+---+");
                System.out.println("O   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   ———");
                break;

            case 4:

                System.out.println("+---+");
                System.out.println("O   |");
                System.out.println("|   |");
                System.out.println("    |");
                System.out.println("   ———");
                break;

            case 3:

                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|  |");
                System.out.println("    |");
                System.out.println("   ———");
                break;


            case 2:

                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\t|");
                System.out.println("    |");
                System.out.println("   ———");
                break;


            case 1:

                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\t|");
                System.out.println("/   |");
                System.out.println("   ———");
                break;


            case 0:

                System.out.println("+---+");
                System.out.println(" O  |");
                System.out.println("/|\t|");
                System.out.println("/ \t|");
                System.out.println("   ———");
                break;

        }
    }

    public void updateLetterLeftImage(String word){

    }

    public String incorrectMessage(){
        return "Incorrect letter";
    }

    public String goodbye(){
        return "Goodbye";
    }

}
