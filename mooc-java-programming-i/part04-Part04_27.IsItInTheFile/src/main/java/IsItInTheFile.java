import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contents = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(fileName))){
            while(file.hasNextLine()){
                contents.add(file.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if(contents.contains(searchedFor)){
            System.out.println("Found!");
        }else {
            System.out.println("Not found.");
        }
    }
}
