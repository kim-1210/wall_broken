import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen {
    class circle extends JPanel implements Runnable{
        Ball b;
        public circle(Ball b){
            this.b = b;
            new Thread(this).start();
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillOval(b.getX(), b.getY(), b.getRadius() * 2, b.getRadius() * 2);
        }
        @Override
        public void run() {
            boolean change_x = false;
            boolean change_y = false;
            while (true) {
                try{
                    Thread.sleep(100);
                    if(!change_x){
                        b.setX(b.getX() + 10);
                    }
                    else{
                        b.setX(b.getX() - 10);
                    }
                    if(!change_y){
                        b.setY(b.getY() + 10);
                    }
                    else{
                        b.setY(b.getY() - 10);
                    }
                    if(b.getX() + b.getRadius() >= 450 || b.getX() - b.getRadius() <= 0){
                        change_x = !change_x;
                    }
                    if(b.getY() + b.getRadius() >= 450 || b.getY() - b.getRadius() <= 0){
                        change_y = !change_y;
                    }
                    repaint(); //화면 갱신
                }catch(Exception e){
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    public Screen(){
        JFrame f = new JFrame();   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Wall_Broken");
        f.setBackground(Color.WHITE);
        f.setBounds(100, 100, 900, 900);
        f.setVisible(true); 
        f.setResizable(false);
        circle test = new circle(new Ball(10, 50, 50));
        f.add(test);
    }
    public static void main(String[] args) {
        new Screen();
    }
}
