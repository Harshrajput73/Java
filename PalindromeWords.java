import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalindromeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        List<String> palindromeWords = getPalindromeWords(sentence);
        if (palindromeWords.isEmpty()) {
            System.out.println("No palindrome words found in the sentence.");
        } else {
            String largest = getLargestPalindrome(palindromeWords);
            String smallest = getSmallestPalindrome(palindromeWords);
            System.out.println("The largest palindrome word is: " + largest);
            System.out.println("The smallest palindrome word is: " + smallest);
        }
    }

    private static List<String> getPalindromeWords(String sentence) {
        String[] words = sentence.split("\\s+");
        List<String> palindromeWords = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }
        return palindromeWords;
    }

    private static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().equals(word);
    }

    private static String getLargestPalindrome(List<String> palindromeWords) {
        return Collections.max(palindromeWords, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    private static String getSmallestPalindrome(List<String> palindromeWords) {
        return Collections.min(palindromeWords, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
