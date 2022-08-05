package src;
import java.util.Scanner;
public class Interaction {

    String playerName;

    public void Interaction(String playerName){
        this.playerName = playerName;
    }

    final String introduction = "Welcome to Hangman";

    public String getIntroduction(){
        return this.introduction + " "  + this.playerName + " !!!";
    }

    public String askForLetter(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess letter ");
        String letter = scanner.nextLine();

        return letter;
    }

    public String incorrectMessage(){
        return "Incorrect letter";
    }

    public String goodbye(){
        return "Goodbye";
    }

}
