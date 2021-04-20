/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author petersims
 */



public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
    }
}