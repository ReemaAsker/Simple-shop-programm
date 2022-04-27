
package theshopprogramm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import static theshopprogramm.GUIShop.P;

public class TheShopProgramm {

    public static void main(String[] args) {
        
        GUIShop f= new  GUIShop();
        JFrame f1 = new JFrame();
        f1.setTitle("AL momaiz");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f1.setBounds(300,60,690, 550);
        f1.setResizable(false);
        ImageIcon img = new ImageIcon("smarticon.jpg");
        f1.setIconImage(img.getImage());
        f1.add(f);


        f1.setVisible(true);
            
    }
}

    


