/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Book {
    private String title;
    private int ageReccomendation;

    public Book(String title, int ageReccomendation) {
        this.title = title;
        this.ageReccomendation = ageReccomendation;
    }

    public int getAgeReccomendation() {
        return ageReccomendation;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + " (reccomended for " + this.ageReccomendation + " year-olds or older)";
    }
    
    
}
