
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics evens = new Statistics();
        Statistics odds = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1) {
                break;
            }
            if(num % 2 == 0){
                evens.addNumber(num);
            } else {
                odds.addNumber(num);
            }
            stats.addNumber(num);
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());
    }
}
