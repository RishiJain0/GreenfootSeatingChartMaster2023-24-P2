import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * This is a container for methods that could be called from the Classroom.  Possible methods could include the following:
 * public void assignSeatsToDeskGroups();  // iterates through all seats and sets the deskGroup based on position of each seat
 * public void getCurrentStudents(int deskGroup)  // list all students in a current deskGroup  (prints to console)
 * Can you think of others?
 * 
 * methods should be public, so they can be called when the scenario is in pause mode.
 * 
 * @author (your name (add your groups names here, and tie to any method that you add) 
 * @version (a version number or a date. Update this for each revision)
 */
public class StudentDeskGroup extends Actor
{
    /**
     * Act - do whatever the StudentDeskGroup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void peopleNames(){
        // Change everyone's names to those in your table group. You can adjust it to 3 people if need be.
        EashanMahajan eashan = new EashanMahajan();
        FranklinLiu franklin = new FranklinLiu();
        GojoSatoru gojo = new GojoSatoru();
        JiminLim jimin = new JiminLim();
        
        // Find their locations and record that and its name on these variables
        String person1Name = eashan.firstName + eashan.lastName;
        String person1Location = ("Their Location " + eashan.mySeatX + " " + eashan.mySeatY);
        String person2Name = gojo.firstName + gojo.lastName;
        String person2Location = ("Their location " + gojo.mySeatX + " " + gojo.mySeatY);
        String person3Name = franklin.firstName + franklin.lastName;
        String person3Location = ("Their location " + franklin.mySeatX + " " + franklin.mySeatY);
        String person4Name = jimin.firstName + jimin.lastName;
        String person4Location = ("Their location " + jimin.mySeatX + " " + jimin.mySeatY);
        
        // Print them out and then call the method in a different class, preferrably someone in your table group
        System.out.println(person1Name + " " + person1Location);
        System.out.println(person2Name + " " + person2Location);
        System.out.println(person3Name + " " + person3Location);
        System.out.println(person4Name + " " + person4Location);
    }
    
    
    public void amogusEject(Student[] tableMembers) 
    {
        // Pull a random student from the array to be ejected
        int index = Greenfoot.getRandomNumber(tableMembers.length);
        Student ejected = tableMembers[index];
        
        // Determine who in the group is impostor
        int impostor = Greenfoot.getRandomNumber(tableMembers.length);
        String ejectMsg;
        
        // Change ejection message to display whether or not the impostor was ejected
        if (impostor == index) {
            ejectMsg = ejected.firstName + " was the The Impostor";
        } else {
            ejectMsg = ejected.firstName + " was not the The Impostor";
        }
        
        // Determine whether to send ejected student up or down
        int direction;
        if (ejected.getY() == 4 || ejected.getY() == 7 || ejected.getY() == 10) {
            direction = 1;
        } else {
            direction = -1;
        }
        
        // Play the button sound
        Greenfoot.playSound("sounds/meeting.wav");
        System.out.println("EMERGENCY MEETING");
        Greenfoot.delay(75);
        
        // Eject the student, moving up or down accordingly and slowly fading away
        int transparency = 170;
        for (int i = 0; i < 3; i++) {
            ejected.setLocation(ejected.getX(), ejected.getY()+direction);
            ejected.getImage().setTransparency(transparency);
            transparency -= 85;
            Greenfoot.delay(10);
        }
        ejected.getImage().setTransparency(0);
    
        // Display the ejection message
        Greenfoot.playSound("sounds/ejected.wav");
        for (int i = 0; i < ejectMsg.length(); i++) {
            System.out.print(ejectMsg.substring(i,i+1));
            Greenfoot.delay(3);
        }
        System.out.println(".\n");
        
        // Return to seat and fade back
        Greenfoot.delay(100);
        ejected.returnToSeat();
        for (int i = 0; i <= 255; i += 17) {
            ejected.getImage().setTransparency(i);
            Greenfoot.delay(2);
        }
    }
}
