import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static File randomWords = new File("Resource/randomWords.csv");
    static ArrayList<String> words = new ArrayList<String>();

    public static void main(String[] args) {


        System.out.println("welcome to Hangman. \ngoodluck. ");
        System.out.println("________________________________");

        ifFoundFile();

    }

    public static void ifFoundFile() {


        try {
            Scanner scanner = new Scanner(randomWords);

            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (counter != 0) {


                    System.out.println(words.size());


                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        }

    }
}
