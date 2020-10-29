
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            String str = scanner.nextLine();

            if (str.isEmpty()) {
                break;
            }
            String[] splitStr = str.split(",");
            int age = Integer.valueOf(splitStr[1]);
            if(age > max){
                max = age;
            }
        }
        System.out.println("Age of the oldest: " + max);
    }
}
