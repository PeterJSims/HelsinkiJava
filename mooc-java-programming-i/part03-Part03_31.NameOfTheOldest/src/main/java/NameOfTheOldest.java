
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while (scanner.hasNext()) {
            String[] nameAge = scanner.nextLine().split(",");
            if (Integer.valueOf(nameAge[1]) > oldest) {
                oldest = Integer.valueOf(nameAge[1]);
                oldestName = nameAge[0];
            }
        }

        System.out.println("Name of the oldest: " + oldestName);
    }
}
