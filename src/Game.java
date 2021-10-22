import java.util.ArrayList;

public class Game extends FileReader {
    static ArrayList<Character> attempts = new ArrayList<Character>();
    private String word;

    public Game(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public static void wordToLines(String word) {

        try {
            for (int i = 0; i < word.length(); i++) {

                if (attempts.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));

                } else {
                    System.out.print( "{_}" );
                }
            }
            System.out.println();

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }


    public void userInput() {
        while (true) {

            System.out.println();
            System.out.println("");
            System.out.println("please input a letter, \nremember to think twice: ");
            System.out.println();

            String guess = "";

            if (guess.equals(HangManMain.scanner.nextLine())) {
                attempts.add(guess.charAt(0));
                wordToLines(word);
            }
        }
    }


}









