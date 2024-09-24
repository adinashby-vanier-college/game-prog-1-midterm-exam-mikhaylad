// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Method to prepare the world - random burgers will spawn, pig will spawn in center and snake will spawn in bottom right corner at the start of the game
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        burger.setLocation(104, 36);
        burger.setLocation(117, 36);
        Burger burger2 =  new  Burger();
        addObject(burger2, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger3 =  new  Burger();
        addObject(burger3, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger4 =  new  Burger();
        addObject(burger4, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger5 =  new  Burger();
        addObject(burger5, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger6 =  new  Burger();
        addObject(burger6, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger7 =  new  Burger();
        addObject(burger7, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger8 =  new  Burger();
        addObject(burger8, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Burger burger9 =  new  Burger();
        addObject(burger9, Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        Snake snake =  new  Snake();
        addObject(snake, 524, 349);
        Pig pig =  new  Pig();
        addObject(pig, 315, 206);
    }
}
