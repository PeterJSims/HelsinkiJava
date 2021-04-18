
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("end")) {
                break;
            } else {
                nums.add(Integer.valueOf(input));
            }
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String outputType = scanner.nextLine();
        
        double average;
        if (outputType.toLowerCase().equals("p")) {
            average = nums.stream().mapToInt(i -> i).filter(n -> n > 0).average().getAsDouble();
        } else {
            average = nums.stream().mapToInt(i -> i).filter(n -> n < 0).average().getAsDouble();
        }
        System.out.println(average);
    }
}
