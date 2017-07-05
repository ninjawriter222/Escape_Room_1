/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escaperoom.view;

import buyi.cit260.escaperoom.control.GameControl;
import escaperoom.escaperoom;
import java.util.Scanner;

/**
 *
 * @author Devin Poe
 */
public class MainMenuView extends View
{
    public MainMenuView()
    {
    super("\n"
            + "\n-------------------------------------"
            + "\n| Main Menu                         |"
            + "\n-------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n-------------------------------------");
    
    private String getMenuOption(){
    System.out.println("\n*** getMenuOption() function called***");
    return "N";
    }
    @Override
    private boolean doAction (String value){
    choice = choice.toUpperCase();
    switch (choice){
        case"N":
            this.startNewGame();
            break;
        case"G":
            this.startExistingGame();
            break;
        case"H":
            this.displayHelpMenu();
            break:
        case"S":
            this.saveGame();
            break;
        default:
            System.out.println("\n*** Invalid selection *** Try again");
    }
    return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(escaperoom.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        }

    void displayMainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class menu {

        public menu() {
        }
    }
    
}