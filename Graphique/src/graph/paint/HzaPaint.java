/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hza.paint;

import java.awt.Frame;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class HzaPaint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewJFrame jf = new NewJFrame();
        
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setTitle("H-Paint");
        
        
    }
    
}
