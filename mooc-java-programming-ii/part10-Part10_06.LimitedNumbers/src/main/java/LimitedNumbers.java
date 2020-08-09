
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            int num = Integer.valueOf(scanner.next());
            if(num < 0) break;
            
            nums.add(num);
        }
        
        nums.stream().filter(num -> num >= 1 && num <=5).forEach(num -> System.out.println(num));
    }
}
