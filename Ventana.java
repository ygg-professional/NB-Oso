package javaapplication7;

import java.awt.Component;
import javax.swing.JFrame;

public class Ventana {
   public static void main(String[] args) {
      JFrame ventana = new JFrame("Graficas Primitivas - Poligonos");
      Panel cod = new Panel();
      ventana.add(cod);
      ventana.setDefaultCloseOperation(3);
      ventana.setSize(300, 350);
      ventana.setLocationRelativeTo((Component)null);
      ventana.setVisible(true);
   }
}
