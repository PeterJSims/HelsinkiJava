
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        // Write your program here
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        double positiveAvg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
        double negativeAvg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        if (scanner.next().equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAvg);
        } else {
            System.out.println("Average of the positive numbers: " + positiveAvg);

        }
    }
}
