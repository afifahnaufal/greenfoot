import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallpaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallpaper extends MyWorld
{

    /**
     * Constructor for objects of class wallpaper.
     * 
     */
    public wallpaper()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
          brick2 brick2 = new brick2();
        addObject(brick2,529,636);
        brick2 brick22 = new brick2();
        addObject(brick22,386,634);
        brick2 brick23 = new brick2();
        addObject(brick23,71,590);
        brick2 brick24 = new brick2();
        addObject(brick24,214,590);
        brick24.setLocation(130,590);
        brick22.setLocation(443,634);
        brick2 brick25 = new brick2();
        addObject(brick25,277,524);
        brick2 brick26 = new brick2();
        addObject(brick26,527,65);
        brick2 brick27 = new brick2();
        addObject(brick27,384,65);
        brick2 brick28 = new brick2();
        addObject(brick28,71,115);
        brick2 brick29 = new brick2();
        addObject(brick29,127,113);
        brick2 brick210 = new brick2();
        addObject(brick210,277,170);
        brick2 brick211 = new brick2();
        addObject(brick211,73,453);
        brick2 brick212 = new brick2();
        addObject(brick212,528,451);
        brick2 brick213 = new brick2();
        addObject(brick213,384,451);
        brick2 brick214 = new brick2();
        addObject(brick214,418,323);
        brick2 brick215 = new brick2();
        addObject(brick215,213,373);
        brick210.setLocation(251,174);
        brick2 brick216 = new brick2();
        addObject(brick216,422,180);
        brick2 brick217 = new brick2();
        addObject(brick217,101,276);
        brick29.setLocation(171,107);
        brick210.setLocation(309,178);
        removeObject(brick210);
        removeObject(brick29);
        removeObject(brick22);
        brick2 brick218 = new brick2();
        addObject(brick218,386,636);
        brick2 brick219 = new brick2();
        addObject(brick219,123,115);
        brick2 brick220 = new brick2();
        addObject(brick220,278,180);
        poya poya = new poya();
        addObject(poya,30,668);
    }
}
