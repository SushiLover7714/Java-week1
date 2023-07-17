import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arrSize = input.nextInt();
        int[] numArr = new int[arrSize];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < arrSize; i++) {
            numArr[i] = input.nextInt();
        }

        int largest = FindLargestNum(numArr);
        System.out.println("The largest number is: " + largest);
    }

    static int FindLargestNum(int[] numArr) {
        int largest = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > largest) {
                largest = numArr[i];
            }
        }
        return largest;
    }
}
