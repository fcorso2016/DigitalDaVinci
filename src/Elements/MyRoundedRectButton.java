package Elements;


import java.awt.Graphics;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cryst
 */
public class MyRoundedRectButton extends JButton {
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRoundRect(5, 5, this.getWidth() - 10, this.getHeight() - 10, 6, 6);
    }
    
}