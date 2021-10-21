import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static File randomWords = new File("Resource/randomWords.csv");
    static ArrayList<>

    public static void main(String[] args) {


        System.out.println("welcome to Hangman ");
        System.out.println("______________________________________");

        ifFoundFile();

    }

    public static void ifFoundFile() {

        int counter = 0;
        try {
            Scanner scanner = new Scanner(randomWords);

            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (counter != 0) {






                }
                counter++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        }

    }
}
