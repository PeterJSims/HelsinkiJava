
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Give the first number:");
        sum += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        sum += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        sum += Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + sum);
    }
}
