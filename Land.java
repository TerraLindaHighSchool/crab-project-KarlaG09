import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Land here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Land extends Actor
{
    GreenfootImage landImage = getImage();
    
    /**
     * Act - do whatever the Dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Land()
    {
        landImage.scale(300, 900);
        setImage(landImage);
  
    }
}
