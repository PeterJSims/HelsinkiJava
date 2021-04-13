
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

    private TodoList todos;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }

    public void start() {
        OUTER:
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("To add:");
                    todos.add(scanner.nextLine());
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int toRemove = Integer.valueOf(scanner.nextLine());
                    todos.remove(toRemove);
                    break;
                case "list":
                    todos.print();
                    break;
                case "stop":
                    break OUTER;
                default:
                    break;
            }
        }
    }

}
