package Shapes;


import Shapes.DrawingShape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cryst
 */
public class DrawingRect extends DrawingShape {

    public void drawSelf(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (stroke != null) {
            g2d.setStroke(stroke);
        }
        if (textureDraw) {
            try {
                File f = new File("obi-wan.png");
                BufferedImage bi = ImageIO.read(f);
                Rectangle r = new Rectangle(bi.getWidth(), bi.getHeight());
                TexturePaint tp = new TexturePaint(bi, r);
                g2d.setPaint(tp);
            } catch (IOException ex) {
                Logger.getLogger(DrawingLine.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (gradientDraw) {
            g2d.setPaint(gradientFill);
        } else {
            g2d.setColor(color);
        }
        if (fill) {
            g2d.fillRect(x1, y1, x2 - x1, y2 - y1);
        } else {
            g2d.drawRect(x1, y1, x2 - x1, y2 - y1);
        }
    }
}
