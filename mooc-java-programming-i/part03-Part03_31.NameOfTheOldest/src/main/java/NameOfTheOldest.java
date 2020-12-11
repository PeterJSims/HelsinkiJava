
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        int oldestAge = 0;

        while (scanner.hasNext()) {
            String[] info = scanner.nextLine().split(",");
            if (Integer.valueOf(info[1]) > oldestAge) {
                oldestAge = Integer.valueOf(info[1]);
                oldest = info[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
