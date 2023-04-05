package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        // Read a line of text such as “I love Java. You love Java. She loves Java.”
        // Split them into words
        // Count number of times each word (excluding dot .) occurs
        // So the end result is something like following:
        // "I" occurs once
        // "love" occurs twice
        // "Java" occurs 3 times
        // "You" occurs once
        // "She" occurs once
        // "loves" occurs once
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence/phrase: ");
        String message = scanner.nextLine();

        String[] words = message.replaceAll("\\p{Punct}", "").split(" ");

        int wordCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (words[i].equals(word)) {
                wordCount++;
                System.out.println('"' + word + '"' + " occurs " + wordCount + " time(s).");
            }
        }
    }
}
