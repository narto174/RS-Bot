/*
*
* FILE: Bot.java
* DESCRIPTION: This file contains the Bot class
* @author Triston Madilyn Simons
* @author Matt Marrazzo
*
*/
package rsbot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;

public class Bot {
    
    int x1, x2, y1, y2;
    Robot robot = new Robot();
    
    public Bot() throws AWTException{
        x1 = 0;
        x2 = 29;
        y1 = 1917;
        y2 = 1030;
    }
    
    public Bot(int x1, int x2, int y1, int y2) throws AWTException{
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    /*
    * run this method once the bot has been constructed
    */
    public void execute(){
        robot.setAutoDelay(40);
       
         robot.delay(50);
         
        //running to the rock
        runToTheRock();
        
        //mining
        mine();
    }
    
    public void mine(){
        robot.mouseMove(887, 537);
        leftClick();
        robot.delay(300000);
        
        robot.mouseMove(951, 474);
        leftClick();
        robot.delay(300000);
    }
    
    public void runToTheRock(){
        robot.mouseMove(1316, 60);
        leftClick();
        robot.delay(6000);
        
        robot.mouseMove(1902, 248);
        leftClick();
        robot.delay(8000);
        
        robot.mouseMove(1868, 372);
        leftClick();
        robot.delay(8000);
        
        robot.mouseMove(1806, 407);
        leftClick();
        robot.delay(12000);
        
        robot.mouseMove(806, 819);
        leftClick();
        robot.delay(3000);
    }
    
     public void leftClick()
    {
     robot.mousePress(InputEvent.BUTTON1_MASK);
     robot.mouseRelease(InputEvent.BUTTON1_MASK);
     }
  
     private void type(int i)
     {
    robot.delay(40);
    robot.keyPress(i);
    robot.keyRelease(i);
     }

  private void type(String s)
  {
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      robot.delay(40);
      robot.keyPress(code);
      robot.keyRelease(code);
    }
  }
    
}
