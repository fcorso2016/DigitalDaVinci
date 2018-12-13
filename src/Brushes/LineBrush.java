package Brushes;


import Program.Canvas;
import Brushes.Brush;
import Shapes.DrawingLine;
import Shapes.DrawingShape;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cryst
 */
public class LineBrush extends Brush {
    DrawingLine l;
    public void drawItem(Canvas c, Graphics g, int x1, int x2, int y1, int y2) {
        l = new DrawingLine();
        l.x1 = x1;
        l.x2 = x2;
        l.y1 = y1;
        l.y2 = y2;
        l.gradientDraw = gradient;
        l.textureDraw = texture;
        if (cyclic) {
            l.gradientFill = new GradientPaint(x1, y1, color1, x2 - (x1 / 2), y2 - (y1 / 2), color2);
        } else {
            l.gradientFill = new GradientPaint(x1, y1, color1, x2, y2, color2);
        }
        l.color = color1;
        l.fill = fill;
        l.setStroke(stroke);
        l.drawSelf(g);
    }

    @Override
    public DrawingShape getShape() {
        return l;
    }
}
