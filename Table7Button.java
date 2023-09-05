import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Table7Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Table7Button extends Actor
{
    /**
     * Act - do whatever the Table7Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Student[] tableMembers;
    private String ejectSound = "sounds/ejected.wav";
    private String meetingSound = "sounds/meeting.wav";
    
    public Table7Button(Student[] s)
    {
        setLocation(10, 7);
        tableMembers = s;
        setImage("Table7Button.jpg");
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            eject();
        }
    }
    
    private void eject() {
        int index = Greenfoot.getRandomNumber(tableMembers.length);
        Student ejected = tableMembers[index];
        int direction;
        
        if (ejected.getY() == 7) {
            direction = 1;
        } else {
            direction = -1;
        }
        
        Greenfoot.playSound(meetingSound);
        Greenfoot.delay(100);
        Greenfoot.playSound(ejectSound);
        
        while(!ejected.isAtEdge()) {
            ejected.setLocation(ejected.getX(), ejected.getY()+direction);
            Greenfoot.delay(20);
        }
        
        ejected.getImage().setTransparency(0);
        Greenfoot.delay(100);
        ejected.returnToSeat();
        
        for (int i = 0; i <= 255; i+=5) {
            ejected.getImage().setTransparency(i);
            Greenfoot.delay(2);
        }
    }
}
