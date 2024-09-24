// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * Constructor for snake
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        killPig();
    }

    /**
     * Method to have snake move
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * Method that kills pig when snake touches
     */
    public void killPig()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
            Greenfoot.playSound("lose.wav");
            transitionToGameOverWorld();
        }
    }

    /**
     * Method that transitions to game over world
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
