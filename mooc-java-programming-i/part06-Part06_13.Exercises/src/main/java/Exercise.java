/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Exercise {

    private String name;
    private boolean competed;

    public Exercise(String name) {
        this.name = name;
        this.competed = false;
    }

    public String getName() {
        return name;
    }

    public void setCompeted(boolean competed) {
        this.competed = competed;
    }

    public boolean isCompeted() {
        return competed;
    }
}
