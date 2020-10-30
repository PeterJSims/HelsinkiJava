
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> contents = new ArrayList<>();
        boolean failed = false;
        try (Scanner fileContents = new Scanner(Paths.get(file))){
            while(fileContents.hasNextLine()){
                contents.add(fileContents.nextLine());
            }
        } catch (Exception e) {
            failed = true;
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if(contents.contains(searchedFor)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
        if(failed){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
