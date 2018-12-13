package Brushes;


import Program.Canvas;
import Shapes.DrawingShape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Stroke;
import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cryst
 */
public abstract class Brush {
    public Color color1, color2;
    public Stroke stroke;
    public boolean fill, gradient, cyclic, texture;
    public int textSize = 12;
    public abstract void drawItem(Canvas c, Graphics g, int x1, int x2, int y1, int y2);

    public abstract DrawingShape getShape();
    
    public boolean isFreeHand() {
        return false;
    }
    
    public boolean isFill() {
        return false;
    }
    
    public boolean isText() {
        return false;
    }
}
