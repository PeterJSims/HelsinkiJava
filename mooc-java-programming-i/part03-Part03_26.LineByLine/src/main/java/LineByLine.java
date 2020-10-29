
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            
            String[] splitStr = s.split(" ");
            for(String str: splitStr){
                System.out.println(str);
            }
        }

    }
}
