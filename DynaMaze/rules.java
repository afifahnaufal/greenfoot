import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rules extends Actor
{
    /**
     * Act - do whatever the rules wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rules(){
        GreenfootImage image = getImage();
        image.scale(451, 445);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new aturan());
        }
    }
}
