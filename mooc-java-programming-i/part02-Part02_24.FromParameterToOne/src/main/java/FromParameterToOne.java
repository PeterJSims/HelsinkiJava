
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printFromNumberToOne(num);
    }

    public static void printFromNumberToOne(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
