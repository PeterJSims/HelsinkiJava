
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();
            
            if(str.isEmpty()){
                break;
            }
            String[] splitStr = str.split(" ");
            System.out.println(splitStr[0]);
        };
    }
}
