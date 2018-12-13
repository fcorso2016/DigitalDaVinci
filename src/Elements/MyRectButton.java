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
public class MyRectButton extends JButton {
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(5, 5, this.getWidth() - 10, this.getHeight() - 10);
    }
    
}