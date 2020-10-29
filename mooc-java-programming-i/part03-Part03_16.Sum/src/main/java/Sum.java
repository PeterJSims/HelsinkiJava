
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        sum = numbers.stream().map((n) -> n).reduce(sum, Integer::sum);
        return sum;
    }
}
