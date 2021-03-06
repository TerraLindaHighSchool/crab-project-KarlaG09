import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ocean here.
 * 
 * @author Karla Gonzalez
 * @version 9/13/21
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 560 x 560 cells with a cell size of 1x1 pixels.
        super(560, 560,1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog,288,272);
        dog.setLocation(275,296);
        dog.setLocation(336,296);
        dog.setLocation(351,242);
        dog.setLocation(308,233);
        Ball ball = new Ball();
        addObject(ball,331,109);
        ball.setLocation(345,107);
        ball.setLocation(348,118);
        Ball ball2 = new Ball();
        addObject(ball2,425,146);
        Ball ball3 = new Ball();
        addObject(ball3,287,524);
        Ball ball4 = new Ball();
        addObject(ball4,545,465);
        Ball ball5 = new Ball();
        addObject(ball5,493,254);
        Ball ball6 = new Ball();
        addObject(ball6,555,63);
        Ball ball7 = new Ball();
        addObject(ball7,427,55);
        ball3.setLocation(290,532);
        ball4.setLocation(540,503);
        ball5.setLocation(402,324);
        ball2.setLocation(525,167);
        ball.setLocation(266,44);
        Vet vet = new Vet();
        addObject(vet,300,318);
        Ball ball8 = new Ball();
        addObject(ball8,224,127);
        vet.setLocation(91,288);
    }
}
