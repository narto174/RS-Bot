
/*
*
* FILE: RSbot.java
* DESCRIPTION: This file contains the RSbot class
* @author Triston Madilyn Simons
* @author Matt Marrazzo
*
*/
package rsbot;

import java.awt.AWTException;


public class RSbot {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        RSFrame frame = new RSFrame();
        Bot bot = new Bot();
        frame.setBot(bot);
        frame.setVisible(true);

    }
    
}
