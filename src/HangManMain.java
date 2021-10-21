import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangManMain {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("|welcome to Hangman.        |\n|goodluck, try not to die 😘|");
        System.out.println("-----------------------------");

        FileReader.getWords();
        FileReader.getRandomWord();
        Game.wordToLines();
    }

}
