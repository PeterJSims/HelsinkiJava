
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        String longestName = "";
        int sum = 0;
        int count = 0;

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            String[] broken = input.split(",");
            int year = Integer.valueOf(broken[1]);
            String name = broken[0];
            if (name.length() > max) {
                max = name.length();
                longestName = name;
            }
            count++;
            sum += year;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of bith years: " + (sum * 1.0 / count));
    }
}
