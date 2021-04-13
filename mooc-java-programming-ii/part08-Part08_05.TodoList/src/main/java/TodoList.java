
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class TodoList {

    private ArrayList<String> todos;
    
    public TodoList(){
        this.todos = new ArrayList<>();
    }
    
    public void add(String task){
        todos.add(task);
    }
    
    public void remove(int number){
        todos.remove(number - 1);
    }
    
    public void print(){
        for(int i = 0; i < todos.size(); i++){
            System.out.println((i + 1)  + ": " + todos.get(i));
        }
    }
}
