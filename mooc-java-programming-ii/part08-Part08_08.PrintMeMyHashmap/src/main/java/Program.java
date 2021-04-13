
import java.util.HashMap;

public class Program {
    
    public static void printKeys(HashMap<String, String> hashmap) {
        hashmap.keySet().forEach((k) -> {
            System.out.println(k);
        });
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    
    public static void main(String[] args) {
        
    }

}
