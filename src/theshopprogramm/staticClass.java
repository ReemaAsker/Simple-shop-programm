
package theshopprogramm;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class staticClass extends JFrame{
    staticClass(){
    setTitle("AL momaiz");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setBounds(300,60,1100,800);
    setResizable(false);
    ImageIcon img = new ImageIcon("smarticon.jpg");
    setIconImage(img.getImage());
    //setVisible(true);
    
}
    
}
