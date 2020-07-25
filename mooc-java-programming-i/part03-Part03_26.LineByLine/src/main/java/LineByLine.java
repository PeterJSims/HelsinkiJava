
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            String[] splitStr = str.split((" "));
            for (String word : splitStr) {
                System.out.println(word);
            }
        }
    }
}
