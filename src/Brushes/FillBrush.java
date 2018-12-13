/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Brushes;

import Program.Canvas;
import Shapes.DrawingShape;
import java.awt.Graphics;

/**
 *
 * @author cryst
 */
public class FillBrush extends Brush {
    
    

    @Override
    public void drawItem(Canvas c, Graphics g, int x1, int x2, int y1, int y2) {
        // Doesn't do anything as this is is handled differently
    }

    @Override
    public DrawingShape getShape() {
        return null;
    }
    
    @Override
    public boolean isFill() {
        return true;
    }
    
}
