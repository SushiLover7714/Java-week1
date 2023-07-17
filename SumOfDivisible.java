public class SumOfDivisible {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum = sum + i;
                System.out.print(i + ",");
            }
        }
        System.out.println("\nThe sum of all nums is: " + sum);
    }
}
