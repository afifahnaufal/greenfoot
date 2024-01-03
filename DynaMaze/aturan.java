import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aturan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aturan extends MyWorld
{

    /**
     * Constructor for objects of class aturan.
     * 
     */
    public aturan()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,134,67);
        back.setLocation(121,60);
    }
}
