package printwords;

import java.util.Scanner;

public class PrintWords {
    public static void main(String[] args) {
        String word;
        String exitWord = "exit";

        do {
            word = inputWord();
            System.out.println(word);
        } while (!word.equals(exitWord));
    }

    public static String inputWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        return sc.nextLine();
    }
}
