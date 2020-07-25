
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String numStr = scanner.next();
            if(numStr.equals("end")){
                break;
            }
            int num = Integer.valueOf(numStr);
            System.out.println(num * num * num);
            
        }
    }
}
