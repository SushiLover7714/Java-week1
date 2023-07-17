import java.util.Scanner;

public class CharsOccourences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence:");
        String sentence = input.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("The character a appered " + count + " times");
    }
}
