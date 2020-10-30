
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner file = new Scanner(Paths.get(fileName))){
            while(file.hasNextLine()){
                String[] parts = file.nextLine().split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                if(age == 1){
                    System.out.println(name + ", age: 1 year");
                }else {
                    System.out.println(name + ", age: " + age + " years");
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
