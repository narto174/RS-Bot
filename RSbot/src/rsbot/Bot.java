/*
*
* FILE: Bot.java
* DESCRIPTION: This file contains the Bot class
* @author Triston Madilyn Simons
* @author Matt Marazzo
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
        robot.setAutoWaitForIdle(true);
    }
    
     private void leftClick()
    {
    robot.mousePress(InputEvent.BUTTON1_MASK);
    robot.delay(200);
    robot.mouseRelease(InputEvent.BUTTON1_MASK);
    robot.delay(200);
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
