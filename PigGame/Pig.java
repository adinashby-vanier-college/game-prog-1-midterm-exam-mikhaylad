// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        munch();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * Method to control Pig's movement with arrow keys
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * Method for pig to eat burgers
     */
    public void munch()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * Method to see if game is won
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Method to transition to winning screen
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
