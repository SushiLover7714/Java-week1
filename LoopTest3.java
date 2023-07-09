import java.util.Scanner;
public class LoopTest3 {
    public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Please enter a number: ");
int num = input.nextInt();
for(int i=1; i<13;i++){
    System.out.print(num);
    System.out.print(" x ");
    System.out.print(i);
    System.out.print(" = ");
    System.out.println(i*num);
}

    }
    
}
