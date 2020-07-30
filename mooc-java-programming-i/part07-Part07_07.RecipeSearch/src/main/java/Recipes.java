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
public class Recipes {
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public Recipes() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public ArrayList<Recipe> getRecipes(){
       return this.recipes;
    }
    
    @Override
    public String toString(){
        return String.valueOf(recipes.size());
    }
}
