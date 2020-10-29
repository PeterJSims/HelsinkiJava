
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name = "";
        while (true) {
            String str = scanner.nextLine();

            if (str.isEmpty()) {
                break;
            }
            String[] splitStr = str.split(",");
            int age = Integer.valueOf(splitStr[1]);
            if (age > max) {
                max = age;
                name = splitStr[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
