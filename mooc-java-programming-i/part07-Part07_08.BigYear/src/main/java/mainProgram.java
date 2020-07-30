
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdDB birdDB = new BirdDB();

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                birdDB.addBird(name, latin);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                if (birdDB.containsBird(name)) {
                    birdDB.observeBird(name);
                } else {
                    System.out.println("Not  bird!");
                }
            }

            if (command.equals("All")) {
                System.out.print("");
                for (Bird bird : birdDB.getBirds()) {
                    System.out.println(bird.getName() + " (" + bird.getLatin() + "): "
                            + birdDB.getObservation(bird.getName()) + " observations");
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                if (birdDB.containsBird(name)) {
                    Bird bird = birdDB.getBird(name);
                    System.out.println(bird.getName() + " (" + bird.getLatin() + "): "
                            + birdDB.getObservation(name) + " observations");
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }
    }

}
