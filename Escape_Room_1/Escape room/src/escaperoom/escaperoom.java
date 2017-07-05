/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaperoom;

import byui.cit260.escaperoom.model.Player;
import byui.cit260.escaperoom.view.StartProgramView;

/**
 *
 * @author Devin Poe
 */
public class escaperoom 
{
private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        escaperoom.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        escaperoom.player = player;
    }
private static Player player = null;
public static void main (String[] args)
{
//create StartProgramViewoOrig and display the start program view
StartProgramView startProgramView = new StartProgramView();
startProgramView.displayStartProgramView();
}

    private static class Game {

        public Game() {
        }
    }
}
