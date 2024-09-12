import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowman extends Actor
{
    boolean atTop = true;
    /**
     * Act - do whatever the Snowman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("s"))
        {
            atTop = false;
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            atTop = true;
        }
        
        if(atTop)
        {
            setLocation(100,100);
        }
        else
        {
            setLocation(100,300);
        }
    }
}
