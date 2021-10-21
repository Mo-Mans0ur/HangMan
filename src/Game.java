import java.util.ArrayList;

public class Game extends FileReader {
static ArrayList<Character> attempts = new ArrayList<Character>();

public static void wordToLines() {
    String word = getRandomWord();

    for (int i = 0; i < listOfWords.size(); i++) {
        if (attempts.contains(word.charAt(i))) {
            System.out.print(word.charAt(i));
        }else {
            System.out.print("_");
        }
    }
    System.out.println();


}








}
