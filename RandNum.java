import java.lang.Math;

public class RandNum {
    public static void main(String[] args) {
        int max = 100;
        int min = 20;
        double rand = Math.random();
        int rand2 = (int) (rand * 15);
        int rand3 = (int) (rand * (max - min)) + min;
        System.out.println(rand);
        System.out.println(rand2);
        System.out.println(rand3);
    }

}
