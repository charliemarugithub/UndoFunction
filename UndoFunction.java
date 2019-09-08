/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undofunction;

import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author Charlie
 */
public class UndoFunction {
    private static Scanner sc = new Scanner(System.in);
    private static String input;
    private static Stack<String> directionsList = new Stack();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //getting user input for directions
        while (true) {
            System.out.println("Press D to enter new direction, U to cancel last entry and E to quit the program");
            input = sc.nextLine();
            input = input.toUpperCase();
            if (input.equals("D")) {
                addDirection();
                
            }
            else if (input.equals("U")) {
                removeDirection();
                
            }
            else if (input.equals("E")){
                System.out.println("Bye...");
                System.exit(0);
                
            }
            else {
                System.out.println("Invalid entry");
            }
        }
        
    }
    //removing direction from stack list
    public static void removeDirection() {
        if (directionsList.isEmpty()) {
            System.out.println("The list of directions is empty");
        } 
        else {
            System.out.println(directionsList.peek() + " has been removed from the directions list");
            directionsList.pop();
            displayDirections();
        }   
        
    }
    //addint direction to stack list
    public static void addDirection() {
        System.out.println("Type in the direction\n");
        input = sc.nextLine();
        directionsList.push(input);
        displayDirections();
        
    }
    //displaying current stack list 
    public static void displayDirections() {
        System.out.println("LIST OF DIRECTIONS: ");
        for (String s: directionsList ) {
            System.out.println(s);
        }
        
    }
}





