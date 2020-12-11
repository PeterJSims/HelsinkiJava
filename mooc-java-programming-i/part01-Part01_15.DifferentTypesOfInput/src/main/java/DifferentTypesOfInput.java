
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double numTwo = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + numTwo);
        System.out.println("You gave the boolean " + bool);
        

    }
}
