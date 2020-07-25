
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner file = new Scanner(Paths.get(fileName))){
            while(file.hasNextLine()){
                String line = file.nextLine();
                String[] info = line.split(",");
                Person person = new Person(info[0], Integer.valueOf(info[1]));
                persons.add(person);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return persons;

    }
}
