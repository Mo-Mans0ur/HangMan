import java.util.ArrayList;

public class Game extends FileReader {
static ArrayList<Character> attempts = new ArrayList<Character>();

    public static void wordToLines() {
        String word = getRandomWord();     // <--- second problem
        try {
            for (int i = 0; i < listOfWords.size(); i++) {

                if (attempts.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));

                } else {
                    System.out.print( " _ " );
                }
            }
            System.out.println();

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace(); // can continue but still irritating
        }
    }

    /* gets this
    java.lang.StringIndexOutOfBoundsException: String index out of range: 6
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1512)
	at Game.wordToLines(Game.java:10)
	at HangManMain.main(HangManMain.java:18)

	and im getting 2 words instead of one
     */


    public static void userInput() {
      System.out.println();
      System.out.println();

      System.out.println("please input a letter, \nremember to think twice: ");
      System.out.println();

      String guess = "";

     if (guess == HangManMain.scanner.nextLine()) {
         attempts.add(guess.charAt(0));
         wordToLines();
     }

    }


}









