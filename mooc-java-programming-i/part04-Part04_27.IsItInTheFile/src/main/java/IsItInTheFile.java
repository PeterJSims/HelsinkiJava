
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        String result = "Not found";

        try (Scanner file = new Scanner(Paths.get(fileName))) {
            while (file.hasNextLine()) {
                if (file.nextLine().equals(searchedFor)) {
                    result = "Found";
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        
        System.out.println(result);

    }
}
