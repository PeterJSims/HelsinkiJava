
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println("Name: ");
            Item newItem = new Item(scanner.nextLine());
            items.add(newItem);
    }
        for(Item i: items){
            System.out.println(i);
        }
}
}