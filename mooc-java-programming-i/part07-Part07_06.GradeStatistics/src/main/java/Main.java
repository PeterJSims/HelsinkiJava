
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grader grader = new Grader();
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }

            grader.addGrade(grade);
        }

        System.out.println("Point average (all): " + grader.average());
        if (grader.averagePassing() > 0) {
            System.out.println("Point average (passing): " + grader.averagePassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage:" + grader.passPercentage());
        int[] dist = grader.gradeDistribution();
        System.out.println("5: " + grader.stars(dist[5]));
        System.out.println("4: " + grader.stars(dist[4]));
        System.out.println("3: " + grader.stars(dist[3]));
        System.out.println("2: " + grader.stars(dist[2]));
        System.out.println("1: " + grader.stars(dist[1]));
        System.out.println("0: " + grader.stars(dist[0]));
    }

}