public class IsPrime {
    public static void main(String[] args) {
        int num = 23;
        boolean isPrime = isPrime(num);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                System.out.println("The number is not prime");
                return false;
            } else {
                System.out.println("The number is prime");
                return true;

            }
        }
        return false;
    }
}
