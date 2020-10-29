
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String success = "You have succesfully logged in!";
        String rejected = "Incorrect username or password!";
        System.out.print("Enter a username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        if (name.equals("alex") && pass.equals("sunshine")) {
            System.out.println(success);
        } else if (name.equals("emma") && (pass.equals("haskell"))) {
            System.out.println(success);
        } else {
            System.out.println(rejected);
        }
    }
}
