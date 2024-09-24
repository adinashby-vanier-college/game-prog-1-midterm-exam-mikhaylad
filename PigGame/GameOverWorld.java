// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        showTextWithBigRedFont("GAME OVER!", 150, 200);
    }

    /**
     * Method to display text
     */
    public void showTextWithBigRedFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}
