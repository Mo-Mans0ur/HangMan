
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileReader {
    static Random random = new Random();

    /*

        static ArrayList<String> getRandomWords() {
            ArrayList<String> arrayListOfRandomWords = new ArrayList<>();
            File words = new File("Resource/randomWords.csv");
            try {
                Scanner scanner = new Scanner(words);
                while (scanner.hasNextLine());
                String line = scanner.nextLine();


            } catch (FileNotFoundException e) {
                System.out.println("File couldn't be found");
                e.printStackTrace();
            }
            return getRandomWords();
        }
        */
/*
    public static void ifFoundFile() {
        try {
            Scanner scanner = new Scanner(randomWords);

            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (counter != 0) {

                String[] arrayOfWords = line.split(";");
                arrayListOfWords.add(arrayOfWords[0]);

                }
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        }

        System.out.println(arrayListOfWords);
    }
*/
    static ArrayList<String> listOfWords = new ArrayList<String>();
    public static void getWords() {
        try {
            Scanner scanner = new Scanner(new File("Resource/randomWords.csv"));
            while (scanner.hasNextLine()) {
                listOfWords.add(scanner.nextLine());

            }
        } catch (FileNotFoundException e) {
            System.out.println("File couldn't be found");
            e.printStackTrace();
        }

    }

    public static String getRandomWord() {
        String word = listOfWords.get(random.nextInt(listOfWords.size()));
        System.out.println(word);
        return word;
    }


}
