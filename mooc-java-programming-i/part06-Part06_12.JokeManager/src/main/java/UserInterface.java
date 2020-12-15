
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        OUTER:
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();

            switch (command) {
                case "1": {
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokes.addJoke(joke);
                    break;
                }
                case "2": {
                    System.out.println("Drawing a joke.");
                    String joke = jokes.drawJoke();
                    System.out.println(joke);
                    break;
                }
                case "3":
                    jokes.printJokes();
                    break;
                case "X":
                    break OUTER;
                default:
                    break;
            }
        }
    }
}
