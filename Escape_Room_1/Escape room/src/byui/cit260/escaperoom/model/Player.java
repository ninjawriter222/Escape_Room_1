/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escaperoom.model;

import escaperoom.escaperoom;

/**
 *
 * @author Devin Poe
 */
public class Player {

    public static Player createPlayer(String name) 
    {
    if (name == null)
        {
        return null;    
        }
    Player player = new Player();
    player.setName(name);
    
    escaperoom.setPlayer(player); // save the player
    return player;
    }

    private void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
