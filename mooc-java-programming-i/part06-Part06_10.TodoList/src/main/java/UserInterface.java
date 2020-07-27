/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */

import java.util.Scanner;

public class UserInterface {
       private TodoList todos;
       private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }
      
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todos.add(task);
            }
            if(command.equals("list")){
                todos.print();
            }
            
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int taskNum = Integer.valueOf(scanner.next());
                todos.remove(taskNum);
            }
            
        }
    }
    
    
}
