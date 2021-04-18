
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();
        while(scanner.hasNext()){
            userInput.add(scanner.nextLine());
        }
        
        userInput.stream().forEach(System.out::println);
    }
}
