import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int arrSize = input.nextInt();
        int[] numArr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter a number: ");
            numArr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numArr));
        System.out.println("The largest number is: " + findlargenum(numArr));
    }

    static int findlargenum(int[] numArr) {
        int largest = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            largest = Math.max(numArr[i], largest);
        }
        return largest;
    }

}
