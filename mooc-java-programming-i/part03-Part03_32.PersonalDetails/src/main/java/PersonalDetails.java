
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        int birthSum = 0;
        int nameCount = 0;

        while (scanner.hasNext()) {
            String[] info = scanner.nextLine().split(",");
            if(info[0].length() > longest.length() ){
                longest = info[0];
            }
            birthSum += Integer.valueOf(info[1]);
            nameCount++;
            
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * birthSum / nameCount));

    }
}
