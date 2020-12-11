
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String strOne = scan.nextLine();
        System.out.println("Enter the second string:");
        String strTwo = scan.nextLine();
        
        if(strOne.equals(strTwo)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
