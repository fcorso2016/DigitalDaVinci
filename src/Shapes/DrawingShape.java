package Shapes;


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Stroke;
import java.awt.TexturePaint;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cryst
 */
public abstract class DrawingShape implements Serializable {
    public int x1 = 0;
    public int x2 = 0;
    public int y1 = 0;
    public int y2 = 0;
    public Color color;
    Stroke stroke;
    public boolean fill, gradientDraw, textureDraw;
    public GradientPaint gradientFill;
    public void setStroke(Stroke s) {
        stroke = s;
    };
    public abstract void drawSelf(Graphics g);
}
