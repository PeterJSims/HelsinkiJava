
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int total = 0;
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                break;
            } else {
                if (inputNumber > 0) {
                    positives += 1;
                    total += inputNumber;
                }
            }
        }
        if (positives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((total * 1.0) / positives);
        }

    }
}
