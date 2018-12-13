package Elements;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class ColorButton extends JButton implements InfoIF {  
    
    private Color color;
    
    public ColorButton() {
        this.setContentAreaFilled(false); //don't fill entire button  
    }
    
    public void paintComponent(Graphics g){
        g.setColor(color);  
        g.fillRect(0,0,this.getWidth()-1,this.getHeight()-1); 
        super.paintComponent(g); //repaint on screen  
    }
    
    public void paintBorder(Graphics g) {    
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, this.getWidth()-1, this.getHeight()-1);   
    } 

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }
    
}