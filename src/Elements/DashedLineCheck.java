package Elements;


import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cryst
 */
public class DashedLineCheck extends JCheckBox {
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        float[] fa = {10, 10, 10};
        BasicStroke s = new BasicStroke(1, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 10, fa, 10);
        g2d.setStroke(s);
        g2d.drawLine(0, this.getHeight() - 10, this.getWidth(), this.getHeight() - 10);
    }
    
}
