
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());     
        
        if (num > numTwo){
            System.out.println(num + " is greater than " + numTwo + ".");
        } else if (num < numTwo){
            System.out.println(num + " is smaller than " + numTwo + ".");
        } else{
            System.out.println(num + " is equal to " + num + ".");
        }
    }
}
