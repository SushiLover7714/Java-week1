import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = input.nextLine();
        String ReverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            ReverseWord = ReverseWord.concat(Character.toString(word.charAt(i)));
            // System.out.println(word.charAt(i));

        }
        System.out.println(ReverseWord);
        System.out.println(isPalindrome(word, ReverseWord));
    }

    static boolean isPalindrome(String word, String ReverseWord) {
        boolean isPalindrome = false;
        for (int i = 0; i < word.length(); i++) {
            // System.out.println(i + " " + j);
            // System.out.println(word.charAt(i) + " " + ReverseWord.charAt(j));
            if (word.charAt(i) == ReverseWord.charAt(i)) {
                isPalindrome = true;
            } else {
                System.out.println("a");
                return false;
            }
        }
        return isPalindrome;

    }
}
