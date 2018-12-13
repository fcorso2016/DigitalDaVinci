package Brushes;

import Program.Canvas;
import Brushes.Brush;
import Shapes.DrawingRoundRect;
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
public class RoundRectBrush extends Brush {

    DrawingRoundRect r;

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
        r = new DrawingRoundRect();
        r.x1 = x1;
        r.x2 = x2;
        r.y1 = y1;
        r.y2 = y2;
        r.color = color1;
        r.gradientDraw = gradient;
        r.textureDraw = texture;
        if (cyclic) {
            r.gradientFill = new GradientPaint(x1, y1, color1, x2 - (x1 / 2), y2 - (y1 / 2), color2);
        } else {
            r.gradientFill = new GradientPaint(x1, y1, color1, x2, y2, color2);
        }
        r.setStroke(stroke);
        r.fill = fill;
        r.drawSelf(g);
    }

    @Override
    public DrawingShape getShape() {
        return r;
    }
}
