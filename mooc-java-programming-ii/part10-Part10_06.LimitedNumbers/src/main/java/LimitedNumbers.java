
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0) {
                break;
            } else {
                numbers.add(num);
            }
        }

        numbers.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(System.out::println);
    }
}
