
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
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            executeCommand(command);
            System.out.println();
        }
        //System.out.println(dictionary); // *** temp
    }

    void executeCommand(String command) {

        switch (command) {
            case "add":
                add();
                break;
            case "search":
                search();
                break;
            default:
                unknown();
                break;
        }
    }

    void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }

    void unknown() {
        System.out.println("Unknown command");
    }

}
