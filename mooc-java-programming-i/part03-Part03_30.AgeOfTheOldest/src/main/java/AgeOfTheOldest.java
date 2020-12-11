
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        
        while(scanner.hasNext()){
            String[] info = scanner.nextLine().split(",");
            if(Integer.valueOf(info[1]) > oldestAge){
                oldestAge = Integer.valueOf(info[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
