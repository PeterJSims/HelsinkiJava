
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
        OUTER:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch (command) {
                case "end":
                    break OUTER;
                case "add":
                    System.out.println("Word:");
                    String word = scanner.nextLine();
                    System.out.println("Translation:");
                    String translation = scanner.nextLine();
                    dictionary.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated:");
                    String translate = scanner.nextLine();
                    String returnedTranslation = this.dictionary.translate(translate);
                    if (returnedTranslation != null) {
                        System.out.println("Translation: " + returnedTranslation);
                    } else {
                        System.out.println("Word " + translate + " was not found");
                    }
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
        System.out.println("Bye bye!");
    }

}
