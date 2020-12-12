import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String response = scanner.nextLine();
        
        books.forEach((b) -> {
            if(response.equals("everything")){
                System.out.println(b);
            } else {
                System.out.println(b.getTitle());
            }
        });

    }
}
