/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Timer {

    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    @Override
    public String toString() {
        String timeString = "";
        if (this.seconds < 10) {
            timeString += ("0" + this.seconds);
        } else {
            timeString += seconds;
        }
        timeString += ":";
        if (this.hundredths < 10) {
            timeString += ("0" + this.hundredths);
        } else {
            timeString += this.hundredths;
        }
        return timeString;
    }

    public void advance() {
        if (this.hundredths == 99) {
            if (this.seconds == 59) {
                this.seconds = 0;
            } else {
                this.seconds += 1;
            }

            this.hundredths = 0;
        } else {
            this.hundredths++;
        }
    }

}
