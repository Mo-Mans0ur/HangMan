import java.util.ArrayList;

public class Game extends FileReader {
    static ArrayList<Character> attempts = new ArrayList<Character>();
    private String word;
    private int wrongGuesses = 0;


    public Game(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }



    public static boolean wordToLines(String word) {

            int correctLetter = 0;
            for (int i = 0; i < word.length(); i++) {

                if (attempts.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                    correctLetter++;
                } else {

                    System.out.print( "{_}" );
                }
            }
            System.out.println();
        return word.length() == correctLetter ;
    }


    public void userInput() {

        while (true) {

            System.out.println();

            System.out.println("please input a letter below, \nremember to think twice: ");

            String guess = HangManMain.scanner.nextLine();
            attempts.add(guess.charAt(0));
            if (wordToLines(word)) {
                System.out.println("nice!!, he get to live another day!!");
                break;

            }else {

            wrongWord();

            }

        }

    }

public static void hangManImage () {

    System.out.println("   __________________");
    System.out.println("   |  /             |");
    System.out.println("   | /              |");
    System.out.println("   |/                ");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("___|___");
}

    public void wrongWord() {
        wrongGuesses++;

        while (wrongGuesses <= 6) {
            if (wrongGuesses == 1) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                System.out.println("");
            }

            if (wrongGuesses == 2) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |                |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                System.out.println("");

            }

            if (wrongGuesses == 3) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|.");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                System.out.println("");
            }

            if (wrongGuesses == 4) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|\\.");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                System.out.println("");
            }

            if (wrongGuesses == 5) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|\\ ");
                System.out.println("   |               /   ");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                System.out.println("");
            }

            if (wrongGuesses == 6) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|\\");
                System.out.println("   |               / \\");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }else {
                break;
            }
            break;
        }
    }
    /*
    errors

    when i type a wrong letter it show the head of the man
    and when i type a wrong letter again it keeps giving me the head.
     */
}









