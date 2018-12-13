/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.awt.BasicStroke;
import java.io.Serializable;

/**
 *
 * @author cryst
 */
public class SuperStroke extends BasicStroke implements Serializable {

    public SuperStroke(float width, int cap, int join, float miterlimit, float[] dash, float dash_phase) {
        super(width, cap, join, miterlimit, dash, dash_phase);
    }

    public SuperStroke(float width) {
        super(width);
    }
    
}
