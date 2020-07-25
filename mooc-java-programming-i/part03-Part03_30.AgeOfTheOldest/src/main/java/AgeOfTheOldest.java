
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(scanner.hasNext()){
            String[] nameAge = scanner.nextLine().split(",");
            if(Integer.valueOf(nameAge[1]) > oldest){
                oldest = Integer.valueOf(nameAge[1]);
            }
        }
        
        System.out.println("Age of oldest: " + oldest);
    }
}
