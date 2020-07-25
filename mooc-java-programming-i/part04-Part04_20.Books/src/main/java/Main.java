
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            Book book = new Book(name, pages, year);
            books.add(book);
        }
        System.out.println("What information will be printed?");
        String response = scanner.nextLine();
        if (response.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}