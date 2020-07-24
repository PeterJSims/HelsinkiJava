
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Shall we carry one?");

        } while (!scanner.nextLine().equals("no"));
    }
}
