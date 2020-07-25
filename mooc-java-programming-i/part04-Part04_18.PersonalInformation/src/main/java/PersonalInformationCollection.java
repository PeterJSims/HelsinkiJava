
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println("First name:");
            String firstName = scanner.next();
            System.out.println("Last name:");
            String lastName = scanner.next();
            System.out.println("Identification number:");
            String idNum = scanner.next();
            infoCollection.add(new PersonalInformation(firstName, lastName, idNum));

    }
            for(PersonalInformation person: infoCollection){
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
}
}
