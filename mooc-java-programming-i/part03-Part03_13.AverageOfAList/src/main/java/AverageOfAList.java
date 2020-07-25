
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                break;
            }
            numbers.add(num);
        }
        int sum = 0;
        for(int n: numbers){
            sum += n;
        }
        System.out.println("Average: " + (sum * 1.0 / numbers.size()));
    }
}
