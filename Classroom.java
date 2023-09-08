import java.util.*;
import greenfoot.*;
//import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
//import java.util.List;
//import java.util.Arrays;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 * 
 * @author Mr. Kaehms
 * @version 2.0 Note: updated for new desk layout. Goal is to make setting seats
 *          easy
 */
public class Classroom extends World {
  private ArrayList<Object> listo = new ArrayList<Object>();

  /**
   * Constructor for objects of class Classroom.
   * 
   */
  public Classroom() {
    // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
    super(14, 14, 60);

    prepare();
  }

  /**
   * Prepare the classroom desk layout. This method should not be chanaged!.
   * Refactored from prepare method.
   */

    private void createDeskLayout(){
        StudentDesk studentdesk = new StudentDesk();
        addObject(studentdesk,2,3);
        StudentDesk studentdesk2 = new StudentDesk();
        addObject(studentdesk2,3,3);
        StudentDesk studentdesk3 = new StudentDesk();
        addObject(studentdesk3,2,4);
        StudentDesk studentdesk4 = new StudentDesk();
        addObject(studentdesk4,3,4);
        StudentDesk studentdesk5 = new StudentDesk();
        addObject(studentdesk5,2,6);
        StudentDesk studentdesk6 = new StudentDesk();
        addObject(studentdesk6,3,6);
        StudentDesk studentdesk7 = new StudentDesk();
        addObject(studentdesk7,2,7);
        StudentDesk studentdesk8 = new StudentDesk();
        addObject(studentdesk8,3,7);
        StudentDesk studentdesk9 = new StudentDesk();
        addObject(studentdesk9,5,3);
        StudentDesk studentdesk10 = new StudentDesk();
        addObject(studentdesk10,6,3);
        StudentDesk studentdesk11 = new StudentDesk();
        addObject(studentdesk11,5,4);
        StudentDesk studentdesk12 = new StudentDesk();
        addObject(studentdesk12,6,4);
        StudentDesk studentdesk13 = new StudentDesk();
        addObject(studentdesk13,5,6);
        StudentDesk studentdesk14 = new StudentDesk();
        addObject(studentdesk14,6,6);
        StudentDesk studentdesk15 = new StudentDesk();
        addObject(studentdesk15,5,7);
        StudentDesk studentdesk16 = new StudentDesk();
        addObject(studentdesk16,6,7);
        StudentDesk studentdesk17 = new StudentDesk();
        addObject(studentdesk17,8,3);
        StudentDesk studentdesk18 = new StudentDesk();
        addObject(studentdesk18,9,3);
        StudentDesk studentdesk19 = new StudentDesk();
        addObject(studentdesk19,8,4);
        StudentDesk studentdesk20 = new StudentDesk();
        addObject(studentdesk20,9,4);
        StudentDesk studentdesk21 = new StudentDesk();
        addObject(studentdesk21,8,6);
        StudentDesk studentdesk22 = new StudentDesk();
        addObject(studentdesk22,9,6);
        StudentDesk studentdesk23 = new StudentDesk();
        addObject(studentdesk23,8,7);
        StudentDesk studentdesk24 = new StudentDesk();
        addObject(studentdesk24,9,7);
        StudentDesk studentdesk25 = new StudentDesk();
        addObject(studentdesk25,8,9);
        StudentDesk studentdesk26 = new StudentDesk();
        addObject(studentdesk26,9,9);
        StudentDesk studentdesk27 = new StudentDesk();
        addObject(studentdesk27,8,10);
        StudentDesk studentdesk28 = new StudentDesk();
        addObject(studentdesk28,9,10);
        StudentDesk studentdesk29 = new StudentDesk();
        addObject(studentdesk29,5,9);
        StudentDesk studentdesk30 = new StudentDesk();
        addObject(studentdesk30,6,9);
        StudentDesk studentdesk31 = new StudentDesk();
        addObject(studentdesk31,5,10);
        StudentDesk studentdesk32 = new StudentDesk();
        addObject(studentdesk32,6,10);
        TeacherDesk teacherdesk = new TeacherDesk();
        addObject(teacherdesk,2,9);
        studentdesk31.setDeskGroup(1);
        studentdesk29.setDeskGroup(1);
        studentdesk30.setDeskGroup(1);
        studentdesk32.setDeskGroup(1);
        studentdesk25.setDeskGroup(2);
        studentdesk27.setDeskGroup(2);
        studentdesk26.setDeskGroup(2);
        studentdesk28.setDeskGroup(2);
        studentdesk21.setDeskGroup(3);
        studentdesk23.setDeskGroup(3);
        studentdesk22.setDeskGroup(3);
        studentdesk13.setDeskGroup(4);
        studentdesk15.setDeskGroup(4);
        studentdesk14.setDeskGroup(4);
        studentdesk16.setDeskGroup(4);
        studentdesk6.setDeskGroup(5);
        studentdesk8.setDeskGroup(5);
        studentdesk5.setDeskGroup(5);
        studentdesk7.setDeskGroup(5);
        studentdesk.setDeskGroup(6);
        studentdesk3.setDeskGroup(6);
        studentdesk4.setDeskGroup(6);
        studentdesk2.setDeskGroup(6);
        studentdesk9.setDeskGroup(7);
        studentdesk11.setDeskGroup(7);
        studentdesk10.setDeskGroup(7);
        studentdesk12.setDeskGroup(7);
        studentdesk17.setDeskGroup(8);
        studentdesk19.setDeskGroup(8);
        studentdesk18.setDeskGroup(8);
        studentdesk20.setDeskGroup(8);
    }
   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
      createDeskLayout();
 // Each student needs to create their specific instance following the KilgoreTrout example.
 // Your current seatX and seatY can be found by right clicking on the corresponding seat in the Classrom.
 // and then clicking on the inspect text
      KilgoreTrout kilgoretrout = new KilgoreTrout();
      addObject(kilgoretrout,2,3);
      kilgoretrout.assignSeat();
    
      AyushiGhosh ayushighosh = new AyushiGhosh();
      addObject(ayushighosh, 3,3);
      ayushighosh.assignSeat();
      
      AltaWan altawan = new AltaWan();
      addObject(altawan,8,6);
      altawan.assignSeat();

      GojoSatoru gojo = new GojoSatoru();
      addObject(gojo, 6, 7);
      gojo.assignSeat();

      RocketUzarraga rocketuzarraga = new RocketUzarraga();
      addObject(rocketuzarraga, 9, 7);
      rocketuzarraga.assignSeat();

      FranklinLiu franklinLiu = new FranklinLiu();
      addObject(franklinLiu, 5, 6);
      franklinLiu.assignSeat();

      AryanJain aryanjain = new AryanJain();
      addObject(aryanjain, 6, 3);
      aryanjain.assignSeat();

      JaydeLaderas jaydeladeras = new JaydeLaderas();
      addObject(jaydeladeras, 6, 4);
      jaydeladeras.assignSeat();

      JiminLim jiminlim = new JiminLim();
      addObject(jiminlim, 6, 6);
      jiminlim.assignSeat();

      RomirHiremath romirhiremath = new RomirHiremath();
      addObject(romirhiremath, 2, 3);
      romirhiremath.assignSeat();

      GargAyush gargAyush = new GargAyush();
      addObject(gargAyush, 3, 4);
      gargAyush.assignSeat();

      JiaAggarwal jia = new JiaAggarwal();
      addObject(jia, 2, 7);
      jia.assignSeat();

      AnjaliZalani anjalizalani = new AnjaliZalani();
      addObject(anjalizalani, 8, 4);
      anjalizalani.assignSeat();

      ToniEn tonien = new ToniEn();
      addObject(tonien, 2, 4);
      tonien.assignSeat();

      VineelBhattiprolu vineel = new VineelBhattiprolu();
      addObject(vineel, 3, 6);
      vineel.assignSeat();

      TanayKotian tanaykotian = new TanayKotian();
      addObject(tanaykotian, 5, 4);
      tanaykotian.assignSeat();

      ConnorTK connorTK = new ConnorTK();
      addObject(connorTK, 8, 7);
      connorTK.assignSeat();
  }
}
