
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try ( Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                String[] info = file.nextLine().split(",");
                if (Integer.valueOf(info[1]) == 1) {
                    System.out.println(info[0] + ", age: " + info[1] + " year");
                } else {
                    System.out.println(info[0] + ", age: " + info[1] + " years");

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
