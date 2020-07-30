/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
import java.util.ArrayList;

public class Grader {

    private ArrayList<Integer> grades = new ArrayList<>();

    public Grader() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade > 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double average() {
        int sum = 0;
        for (Integer i : grades) {
            sum += i;
        }
        return sum * 1.0 / grades.size();
    }

    public double passingAverage() {
        int sum = 0;
        int passing = 0;
        for (Integer i : grades) {
            if (i >= 50) {
                sum += i;
                passing++;
            }
        }
        if (passing == 0) {
            return 0;
        } else {
            return sum * 1.0 / passing;

        }
    }

    public double passingPercentage() {
        int passing = 0;
        for (Integer i : grades) {
            if (i >= 50) {
                passing++;
            }
        }
        return (passing * 100.0) / grades.size();
    }

    public int[] gradeDistribution() {
        int[] dist = new int[6];
        for (Integer grade : grades) {
            if (grade < 50) {
                dist[0]++;
            } else if (grade < 60) {
                dist[1]++;
            } else if (grade < 70) {
                dist[2]++;
            } else if (grade < 80) {
                dist[3]++;
            } else if (grade < 90) {
                dist[4]++;
            } else {
                dist[5]++;
            }
        }
        return dist;
    }

    public String stars(int count) {
        String out = "";
        for (int i = 0; i < count; i++) {
            out += "*";
        }
        return out;
    }
}
