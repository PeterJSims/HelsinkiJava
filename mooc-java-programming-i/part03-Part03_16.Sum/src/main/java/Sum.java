
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static int sum(ArrayList<Integer> nums){
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        return sum;
    }

}
