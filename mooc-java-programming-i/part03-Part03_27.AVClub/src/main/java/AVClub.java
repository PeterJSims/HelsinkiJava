
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String[] lines = scanner.nextLine().split(" ");
            
            for(String l : lines){
                if(l.contains("av")){
                    System.out.println(l);
                }
            }
        }

    }
}
