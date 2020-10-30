
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team)) {
                    count++;
                    if (homePoints > visitingPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (visitingTeam.equals(team)) {
                    count++;
                    if (visitingPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

        } catch (Exception ex) {
            System.out.println("File not opened: " + ex.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
