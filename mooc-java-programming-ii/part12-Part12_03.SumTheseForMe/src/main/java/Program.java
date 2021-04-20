
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        int min = Math.max(fromWhere, 0);
        int max = Math.min(toWhere, array.length);
        for(int i = min; i < max; i++){
            if((array[i] >= smallest) && (array[i] <= largest)){
                sum += array[i];
            }
        }
        return sum;
    }

}
