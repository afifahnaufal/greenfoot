import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poya here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;

public class poya extends Actor 
{
    private int vSpeed = 0;
    private int acceleratio  = 1;
    private int jumpHeight = -17;
    private int live =3;
    private int pinkcrystal;
    private int 
    private boolean isJumping;
    
     private static final double GRAVITY = 0.5;
    private double verticalSpeed = 0;
    public boolean isOnGround()
    {
    // Pemeriksaan keberadaan di lokasi tertentu (misalnya, pada koordinat Y tertentu)
    int groundHeight = getWorld().getHeight() - getImage().getHeight() / 2;
    return getY() >= groundHeight;
    }
    public void jump() {
    if (!isJumping && isOnGround()) {
        isJumping = true;
        verticalSpeed = -10;
    }
}

public void tembok(){
    
}


    
    public void act() {
        
        
    verticalSpeed = verticalSpeed + GRAVITY;
    
    
    setLocation(getX(), getY() + (int) verticalSpeed);
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
        verticalSpeed = 0;
        setLocation(getX(), getWorld().getHeight() - getImage().getHeight() / 2);
    }
    
     if (!isOnGround()) {
        verticalSpeed = verticalSpeed + GRAVITY;
        setLocation(getX(), getY() + (int) verticalSpeed);
    } else {

        verticalSpeed = 0;
        isJumping = false;
    }

        if(Greenfoot.isKeyDown("right")){
            move(5);
        

        }   
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        
        }
        if(Greenfoot.isKeyDown("up")){
            jump();
        

        }   
    }
     
    
    
}

    /**
     * Act - do whatever the poya wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    


