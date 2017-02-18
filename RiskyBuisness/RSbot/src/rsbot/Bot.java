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

        Scanner scanner = null;
        try{
            scanner = new Scanner(new File("input.txt"));
        }catch(FileNotFoundException e){
            System.err.println("File input.txt not found");
        }
        
        robot.delay(50);
        
        while(scanner.hasNextInt()){
            mechanic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        
    }
    
    public void mechanic(int mouseX, int mouseY, int delay){
        robot.mouseMove(mouseX, mouseY);
        leftClick();
        robot.delay(delay);
    }
    
    public void runBackToBank(){
        mechanic(1837, 84, 13000);
        mechanic(1755, 104, 11000);
        mechanic(1711, 245, 9000);
        mechanic(1768, 276, 5000);
        mechanic(968, 688, 1000);
    }
    
    public void mine(){
        for(int x = 0; x < 14; x++){
            mechanic(887, 537, 8000);
            mechanic(951, 474, 8000);
        }
    }
    
    public void runToTheRock(){
        mechanic(1316, 60, 6000);
        mechanic(1902, 248, 8000);
        mechanic(1868, 372, 8000);
        mechanic(1806, 407, 12000);
        mechanic(806, 819, 3000);
        mechanic(782, 835, 3000);
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
