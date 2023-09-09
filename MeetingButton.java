import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Table7Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeetingButton extends Actor
{
    /**
     * By Table 7 : 25-28
     * Connor, Rocket, Alta, Harsha
     */
    
    private Student[] tableMembers;
    private StudentDeskGroup table7 = new StudentDeskGroup();
    
    public MeetingButton(Student[] s)
    {
        tableMembers = s;
        setImage("Table7Button.jpg");
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            table7.amogusEject(tableMembers);
        }
    }
}
