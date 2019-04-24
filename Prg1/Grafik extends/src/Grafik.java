import javax.swing.*;
import java.awt.*;

public class Grafik extends Canvas {

    public Grafik() {
        setSize(800,600);
        JFrame frame = new JFrame("Grafik");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        drawBox(100,100, g);
        drawBox(300,200,g);
        g.setColor(new Color(0x1B4407));
        g.fillOval(200,200,300,150);
        drawHouse(g);
    }

    private void drawHouse(Graphics g) {
        g.setColor(new Color(i:0xAA1111));

    }

    private void drawBox(int x, int y, Graphics g) {
        g.setColor(new Color(0x55FF00FF));
        g.drawRect(x,y,300,200);

        repaint();
    }

    public static void main(String[] args) {
        Grafik minGrafik = new Grafik();
    }
}