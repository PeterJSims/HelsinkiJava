
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String[] lines = scanner.nextLine().split(" ");
            for (String l : lines) {
                System.out.println(l);
            }
        }
    }
}
