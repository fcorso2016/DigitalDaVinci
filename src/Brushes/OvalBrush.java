package Brushes;

import Program.Canvas;
import Brushes.Brush;
import Shapes.DrawingOval;
import Shapes.DrawingShape;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cryst
 */
public class OvalBrush extends Brush {

    DrawingOval o;

    public void drawItem(Canvas c, Graphics g, int x1, int x2, int y1, int y2) {
        if (x1 > x2) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2) {
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }
        o = new DrawingOval();
        o.x1 = x1;
        o.x2 = x2;
        o.y1 = y1;
        o.y2 = y2;
        o.color = color1;
        o.gradientDraw = gradient;
        o.textureDraw = texture;
        if (cyclic) {
            o.gradientFill = new GradientPaint(x1, y1, color1, x2 - (x1 / 2), y2 - (y1 / 2), color2);
        } else {
            o.gradientFill = new GradientPaint(x1, y1, color1, x2, y2, color2);
        }
        o.fill = fill;
        o.setStroke(stroke);
        o.drawSelf(g);
    }

    @Override
    public DrawingShape getShape() {
        return o;
    }
}
