
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();
            
            if(str.isEmpty()){
                break;
            }
            
            String[] splitStr = str.split(" ");
            
            for(String s: splitStr){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
        }
    }
}
