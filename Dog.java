import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Actor
{
    GreenfootImage dogImage = getImage();
    
    /**
     * Act - do whatever the Dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dog()
    {
        dogImage.scale(50, 50);
        setImage(dogImage);
    }
     private int numOfBalls= 8;
    
   public void act()  
   {
       move(3);
       turnAtEdge();
       checkKeyPress();
       onCollision();
    }

    private void turnAtEdge()
    {
       if (isAtEdge())
      {   
          turn(50); 
      }
    }
    // Turns the Crab at the edge

    // Checks for user key presses so user can turn the Crab
   private void checkKeyPress()
   {
     if(Greenfoot.isKeyDown("right"))  
     {
        turn(4);
     }
     
     if(Greenfoot.isKeyDown("left"))
     {
         turn(-4);
     }
     
     }

   private void onCollision () 
   {
       
    if(isTouching(Ball.class))
     {
        removeTouching(Ball.class);
        Greenfoot.playSound("slurp.wav");
        numOfBalls--;
        System.out.println("Number of balls" + numOfBalls);
    
         //Winning The Game
         if (numOfBalls == 0)
         {
             Greenfoot.setWorld(new WinSplash());
             Greenfoot.playSound("fanfare.wav");
             Greenfoot.stop();
            }
            // 
    }
    
     if (isTouching(Dog.class))
     {
    
        removeTouching(Ball.class);
        Greenfoot.playSound("au.wav");
        Greenfoot.stop();
    }
   }
}
