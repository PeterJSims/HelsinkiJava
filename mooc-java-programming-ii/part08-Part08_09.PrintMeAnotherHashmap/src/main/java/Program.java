
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        hashmap.values().forEach((book) -> {
            System.out.println(book);
        });
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        hashmap.values().forEach((_item) -> {
            if (_item.getName().contains(text)) {
                System.out.println(_item);
            }
        });
    }
}
