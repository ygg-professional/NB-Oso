package javaapplication7;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Panel extends JPanel {
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      g2.setStroke(new BasicStroke(4.0F));
      int[] PuntosX1 = new int[]{17, 41, 76, 41, 17};
      int[] PuntosY1 = new int[]{85, 44, 67, 138, 85};
      Polygon orI = new Polygon(PuntosX1, PuntosY1, 5);
      g2.drawPolygon(orI);
      g2.fillPolygon(orI);
      int[] PuntosX2 = new int[]{26, 76, 110, 48, 26};
      int[] PuntosY2 = new int[]{168, 67, 117, 221, 168};
      Polygon pI = new Polygon(PuntosX2, PuntosY2, 5);
      g2.drawPolygon(pI);
      int[] PuntosX3 = new int[]{65, 109, 101, 87, 69};
      int[] PuntosY3 = new int[]{192, 122, 182, 206, 192};
      Polygon oI = new Polygon(PuntosX3, PuntosY3, 5);
      g2.drawPolygon(oI);
      g2.fillPolygon(oI);
      int[] PuntosX4 = new int[]{48, 65, 87, 95, 48};
      int[] PuntosY4 = new int[]{221, 192, 206, 243, 221};
      Polygon cI = new Polygon(PuntosX4, PuntosY4, 5);
      g2.drawPolygon(cI);
      int[] PuntosX5 = new int[]{76, 130, 183, 152, 159, 174, 165, 154, 131, 109, 95, 87, 101, 110, 76};
      int[] PuntosY5 = new int[]{67, 54, 67, 117, 182, 206, 243, 249, 240, 249, 243, 206, 182, 117, 67};
      Polygon f = new Polygon(PuntosX5, PuntosY5, 15);
      g2.drawPolygon(f);
      int[] PuntosX6 = new int[]{131, 144, 131, 118};
      int[] PuntosY6 = new int[]{240, 245, 250, 245};
      Polygon b = new Polygon(PuntosX6, PuntosY6, 4);
      g2.drawPolygon(b);
      g2.fillPolygon(b);
      int[] PuntosX7 = new int[]{165, 174, 195, 214, 165};
      int[] PuntosY7 = new int[]{243, 206, 192, 221, 243};
      Polygon cD = new Polygon(PuntosX7, PuntosY7, 5);
      g2.drawPolygon(cD);
      int[] PuntosX8 = new int[]{174, 159, 153, 195, 174};
      int[] PuntosY8 = new int[]{206, 182, 124, 192, 206};
      Polygon oD = new Polygon(PuntosX8, PuntosY8, 5);
      g2.fillPolygon(oD);
      g2.drawPolygon(oD);
      int[] PuntosX9 = new int[]{152, 183, 238, 214, 152};
      int[] PuntosY9 = new int[]{117, 67, 168, 220, 117};
      Polygon pD = new Polygon(PuntosX9, PuntosY9, 5);
      g2.draw(pD);
      int[] PuntosX10 = new int[]{183, 220, 246, 221, 183};
      int[] PuntosY10 = new int[]{67, 44, 85, 138, 67};
      Polygon orD = new Polygon(PuntosX10, PuntosY10, 5);
      g2.fillPolygon(orD);
      g2.drawPolygon(orD);
      int[] PuntosX11 = new int[]{131, 131, 112, 105, 114, 131, 145, 155, 150, 131, 131};
      int[] PuntosY11 = new int[]{240, 234, 230, 223, 223, 225, 223, 223, 230, 234, 240};
      Polygon n = new Polygon(PuntosX11, PuntosY11, 11);
      g2.fillPolygon(n);
      g2.drawPolygon(n);
      int[] PuntosX12 = new int[]{95, 109, 131, 154, 165};
      int[] PuntosY12 = new int[]{243, 260, 267, 260, 243};
      g2.drawPolyline(PuntosX12, PuntosY12, 5);
   }
}
