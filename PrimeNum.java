import java.util.Scanner;
import java.lang.Math;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rand;
        System.out.print("Enter min number: ");
        int min = input.nextInt();
        System.out.print("Enter max num: ");
        int max = input.nextInt();
        boolean isPrime = false;
        do {
            rand = randNum(max, min);
            isPrime = isPrime(rand);
        } while (isPrime == false);
        System.out.println("The prime number is " + rand);
    }

    static int randNum(int max, int min) {
        return (int) (Math.random() * (max - min)) + min;
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
