import java.util.Scanner;

public class PrintTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
