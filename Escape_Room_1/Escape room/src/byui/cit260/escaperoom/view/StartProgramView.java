/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escaperoom.view;

import byui.cit260.escaperoom.control.GameControl;
import byui.cit260.escaperoom.model.Player;
import java.util.Scanner;

/**
 *
 * @author Devin Poe
 */
public class StartProgramView 
{
private String promptMessage;
public StartProgramView()
    {
    this.promptMessage = "\nPlease enter your name: ";
    this.displayBanner();
    }    

    private void displayBanner() 
    {
        System.out.println
        (
         "\n*************************************"
        + "\n*                                   *"
        + "\n* This is the escape room           *"
        + "\n* Use the clue and objects          *"
        + "\n* and implement your wit to escape  *"
        + "\n* Good Luck                         *"
        + "\n*                                   *"
        + "\n*************************************"
        );
    }

public void displayStartProgramView() 
{
boolean done = false; // set flag to not done
do 
    {
    // prompt for and get players name
    String playersName=this.getPlayersName();
    if (playersName.toUpperCase().equals("Q"))// user wants to quit
    return; // exit the game
    // do the requested action and display the next view
    done = this.doAction(playersName);
    } 
while (!done);
{
//propt for and get players name
String playersName = this.getPlayersName();
if (playersName.toUpperCase().equals("Q"))//user wants to quit
return;//exit the game

// do the requested action and display the next view
done = this.doAction(playersName);
}
while (!done);
}

    private String getPlayersName() 
    {
    Scanner keyboard = new Scanner(System.in);//get infile for keyboard
    String value = ""; // value to be reutrned
    boolean valid = false;//initialize to not valid
    while (!valid)
        {
        System.out.println("\n" + this.promptMessage);
        value = keyboard.nextLine();//get next line typed on keyboard
        value = value.trim();// tim off leading and trailing blanks
        if (value.length() < 1)
            {
            System.out.println("\nInvalid value: value can not be blank");
            continue;
            }
        break; // end the loop
        }
    return value; // return the value entered
    }    
    

    private boolean doAction(String playersName) 
    {
    if (playersName.length() < 2) 
        {
        System.out.println("\nInvalid players name:"
            + "The name must be greater than one character in length");
        return false;
        }
    // call createPlayer()control function
    Player player = GameControl.createPlayer(playersName);
    if (player == null) 
        {// if unsuccessful
        System.out.println("\nError creating the player.");
        return false;
        }
    
    // display next view
    this.displayNextView();
    
    return true; // success!
    }

    private void displayNextView() 
    {
    System.out.println("\n================================"
            + "\n Welcome to the game"
            + player.getName()
            + "\n We hope you have a lot of fun!"
                    + "\n================================="
                    );
    //Create MainMenuView object
    MainMenuView mainMenuView = new MainMenuView();
    // Display the main menu view
    mainMenuView.displayMainMenuView();
    }
}