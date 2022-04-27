
package theshopprogramm;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


 public class Panelp2 extends JPanel  {
    Panelp2(LayoutManager l) {
        super.setLayout(l);
        
    }
     @Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
         Image img = new ImageIcon ("lib1.jpg").getImage();

          g.drawImage(img,0,0,690,565, null);

   }; 
//    protected void paintComponent(Graphics g){
//        super.paintComponents(g);
//         Image img = new ImageIcon ("shopBackground.jpg").getImage();
//
//          g.drawImage(img,0,0,800,550, null);
//
//    
//}
 }