
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                int num = Integer.valueOf(file.nextLine());

                if (num >= lowerBound && num <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
        }

        System.out.println("Numbers: " + count);
    }

}
