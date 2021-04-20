/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author petersims
 */
public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    
    public void execute(int times){
        if(times == 0){
            return;
        } else {
            System.out.println("Application logic is working");
            ui.update();
            execute(times - 1);
        }
    }
}
