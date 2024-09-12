import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sadFace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SadFace extends Actor
{
    /**
     * Act - do whatever the sadFace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("space"))
        {
            Banana banana = new Banana();
            getWorld().addObject(banana,600,300);
            
            getWorld().removeObject(this);
        }
    }
}
