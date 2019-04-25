import javax.swing.*;
import java.awt.*;

    public class Grafik  extends Canvas {

        public Grafik() {
            setSize(1000,2000);
            JFrame frame = new JFrame("Grafik");
            frame.add(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

        public void paint(Graphics g) {
            drawBox(0,0, g);
            drawBox(1000,2000,g);
            g.setColor(new Color(0x1B4407));

        }

        private void drawBox(int x, int y, Graphics g) {
            g.setColor(new Color(0x1B4407));
            g.drawRect(x,y,1000,2000);
        }

        public static void main(String[] args) {
            Grafik minGrafik = new Grafik();


        }
    }

