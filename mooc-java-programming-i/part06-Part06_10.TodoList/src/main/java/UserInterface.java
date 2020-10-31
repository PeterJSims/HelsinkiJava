
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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "remove":
                    remove();
                    break;
                default:
                    unknown();
                    break;
            }
            System.out.println();
        }
    }

    private void unknown() {
        System.out.println("Unknown command");
    }

    private void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        list.add(task);
    }

    private void list() {
        list.print();
    }

    private void remove() {
        System.out.print("Which task is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        list.remove(number);
    }

}
