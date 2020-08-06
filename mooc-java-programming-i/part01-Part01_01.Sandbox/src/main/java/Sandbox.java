
import java.util.ArrayList;


public class Sandbox {

    public static void main(String[] args) {
       Counter counter = new Counter();
       SuperCounter superCounter = new SuperCounter();
       int number = 3;
       number = superCounter.subtractFromNumber(number);
       number = superCounter.subtractFromNumber(number);
       number = counter.addToNumber(number);
       System.out.println(number);
    }

}
