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

    int seconds;
    int hundredths;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    @Override
    public String toString() {
        String secs = seconds < 10 ? "0" + String.valueOf(seconds) : String.valueOf(seconds);
        String hundths = hundredths < 10 ? "0" + String.valueOf(hundredths) : String.valueOf(hundredths);

        return secs + ":" + hundths;
    }

    public void advance() {
        if (hundredths == 99 && seconds != 59) {
            seconds++;
            hundredths = 0;
        } else if(hundredths == 99 && seconds == 59)  {
            seconds = 0;
            hundredths = 0;
        } else {
            hundredths++;
        }
    }

}
