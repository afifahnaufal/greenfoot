import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class depan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class depan extends MyWorld
{

    /**
     * Constructor for objects of class depan.
     * 
     */
    public depan()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        startbutton startbutton = new startbutton();
        addObject(startbutton,314,622);
        startbutton.setLocation(454,630);
        rules rules = new rules();
        addObject(rules,127,631);
        rules.setLocation(131,629);
    }
}
