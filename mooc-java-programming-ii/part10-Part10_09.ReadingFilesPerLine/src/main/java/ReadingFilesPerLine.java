
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        String fileName = scanner.nextLine();
        List<String> lines = read(fileName);
        lines.stream().forEach(line -> System.out.println(line));
    }
    
    public static List<String> read(String fileName){
        List<String> contents = new ArrayList<>();
        
        try {
            contents = Files.lines(Paths.get(fileName)).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return contents;
    }
}
