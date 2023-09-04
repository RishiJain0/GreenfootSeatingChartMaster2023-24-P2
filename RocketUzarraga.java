import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RocketUzarraga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketUzarraga extends Student implements SpecialInterestOrHobby
{
    public RocketUzarraga(String f, String l, int r, int s)
    {
        firstName=f;
        lastName=l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;        
    }
    
    public RocketUzarraga()
    {
        firstName="Rocket";
        lastName="Uzarraga";
        mySeatX=9;
        mySeatY=7;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            //  if (sitting){
            sitting=false;
            setImage(standingFile);
            System.out.println(""); // Print a blank line to create space between any student output.
            getName();
            sayName(soundFile);
            
            myHobby("I like books!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
            walkAround();
           
            sitDown();
         }
        
    }
    
    public void getName()
    {
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    public void myHobby(String s) 
    {
         System.out.println(s);
    }
    
    public void walkAround()
    {
        while (getY() > 0)
        {
            setLocation(getX(), getY()-1);
            Greenfoot.delay(10);
        }
        
        getImage().setTransparency(0);
        Greenfoot.delay(100);
        setLocation(0, 8);
        getImage().setTransparency(255);
        
        while (getX() < 9)
        {
            setLocation(getX()+1, getY());
            Greenfoot.delay(10);
        }
        
    }
}
