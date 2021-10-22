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

            System.out.println("please input a letter, \nremember to think twice: ");

            String guess = HangManMain.scanner.nextLine();
            attempts.add(guess.charAt(0));
            if (wordToLines(word)) {
                System.out.println("nice!!, he gets to live another day!!");
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
        int wrongWordCounter = 0;
        while (true) {
            wrongWordCounter++;


            if (wrongWordCounter >= 1) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }

            if (wrongWordCounter >= 2) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |                |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }

            if (wrongWordCounter >= 3) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|.");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }

            if (wrongWordCounter >= 4) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|\\.");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }

            if (wrongWordCounter >= 5) {

                System.out.println("   __________________");
                System.out.println("   |  /             |");
                System.out.println("   | /              |");
                System.out.println("   |/               0");
                System.out.println("   |               /|\\ ");
                System.out.println("   |               /   ");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");

            }

            if (wrongWordCounter >= 6) {

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
                System.out.println("");

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









