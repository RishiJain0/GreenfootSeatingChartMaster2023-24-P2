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
        int impostor = Greenfoot.getRandomNumber(2);
        Student ejected = tableMembers[index];
        int direction;
        String ejectMsg;
        
        if (ejected.getY() == 7) {
            direction = 1;
        } else {
            direction = -1;
        }
        if (impostor == 1) {
            ejectMsg = ejected.firstName + " was the The Impostor";
        } else {
            ejectMsg = ejected.firstName + " was not the The Impostor";
        }
        
        Greenfoot.playSound(meetingSound);
        Greenfoot.delay(100);
        
        int transparency = 230;
        while(!ejected.isAtEdge()) {
            ejected.setLocation(ejected.getX(), ejected.getY()+direction);
            ejected.getImage().setTransparency(transparency);
            transparency -= 25;
            Greenfoot.delay(10);
        }
        
        Greenfoot.playSound(ejectSound);
        for (int i = 0; i < ejectMsg.length(); i++) {
            System.out.print(ejectMsg.substring(i,i+1));
            Greenfoot.delay(3);
        }
        System.out.println(".");
        
        ejected.getImage().setTransparency(0);
        Greenfoot.delay(100);
        ejected.returnToSeat();
        
        for (int i = 0; i <= 255; i+=5) {
            ejected.getImage().setTransparency(i);
            Greenfoot.delay(2);
        }
    }
}
