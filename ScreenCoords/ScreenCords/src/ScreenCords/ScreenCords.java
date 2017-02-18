/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScreenCords;

import java.awt.*;
import java.awt.Event.*;

/**
 *
 * @author madilynsimons
 */
public class ScreenCords {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SCframe frame = new SCframe();
        frame.setVisible(true);
        while(true){
            frame.set_label(frame.get_mouse());
        }
    }
    
}
