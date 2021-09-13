import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vet extends Actor
{
    GreenfootImage vetImage = getImage();
    /**
     * Act - do whatever the Vet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Vet()
    {
        vetImage.scale(60, 60);
        setImage(vetImage);
    }
}
