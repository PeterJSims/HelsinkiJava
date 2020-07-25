
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String[] splitString = scanner.nextLine().split(" ");
            for(String word: splitString){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }
    }
}
