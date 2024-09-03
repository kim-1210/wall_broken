import java.awt.*;

import javax.swing.JPanel;

public class draw_paint extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public static <T> void draw(Graphics g, T shape){
        g.setColor(Color.BLUE);
        if(shape instanceof Ball){
            Ball data = (Ball)shape;
            g.fillOval(data.getX(), data.getY(), data.getRadius(), data.getRadius());
        }
        else if(shape instanceof Rectangle){
            Rectangle data = (Rectangle)shape;
        }
        else if(shape instanceof Line){
            Line data = (Line)shape;
        }
    }
}
