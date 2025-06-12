import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String word = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("******************************");
        System.out.println("** Welcome to Java Hangman! **");
        System.out.println("******************************");

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                        
                        
                        
                        """;
            case 1 -> """
                         o
                        
                        
                        """;
            case 2 -> """
                         o
                         |
                        
                        """;
            case 3 -> """
                         o
                        /|
                        
                        """;
            case 4 -> """
                         o
                        /|\\
                        
                        """;
            case 5 -> """
                         o
                        /|\\
                        /
                        """;
            case 6 -> """
                         o
                        /|\\
                        / \\
                        """;
            default -> "";
        };
    }
}
