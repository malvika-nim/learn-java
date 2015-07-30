/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akshaya
 */
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainDraw extends JPanel {

   public static void main(String[] a) {
      JFrame f = new JFrame();
      f.setSize(400, 400);
      f.add(new MainDraw());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }

   public void paint(Graphics g) {
      g.fillRect (5, 15, 50, 75);
      g.drawOval(80, 80, 50, 100);
   }
}
