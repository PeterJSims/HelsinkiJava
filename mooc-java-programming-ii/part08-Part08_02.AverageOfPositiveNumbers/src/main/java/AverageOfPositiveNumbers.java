
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int count = 0;
        while (true) {
            int num = Integer.valueOf(scanner.next());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                positives += num;
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(positives * 1.0 / count);
        }

    }
}
