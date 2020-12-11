
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numOne = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scan.nextLine());

        if (numOne == numTwo) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.print("Greater number");
            if (numOne > numTwo) {
                System.out.print(numOne);
            } else {
                System.out.print(numTwo);
            }
        }

    }
}
