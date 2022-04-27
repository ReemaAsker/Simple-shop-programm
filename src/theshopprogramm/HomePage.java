
package theshopprogramm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import static theshopprogramm.Login.frame;

public class HomePage extends JPanel implements ActionListener{
    JPanel rightPanel , MainPanel ;
    JLabel title ,titleOfPanel;
    JButton aljardGU ,calcMonyGU,debtGU;
    JFrame frameCalc =null;
    HomePage(){
        setLayout(null);
        rightPanel = new JPanel(null);
        MainPanel =  new JPanel(null);
        aljardGU = new JButton("الجرد اليومي");
        calcMonyGU = new JButton("حاسبة المال");
        debtGU = new JButton("صفحة الديون");
        title = new JLabel ("شركة الاتصالات لتكنولوجيا المعلومات");
        titleOfPanel = new JLabel ("الصفحات");
        
        
        rightPanel.setBackground(new Color (108,133,172,40));
        rightPanel.setBorder(new LineBorder(Color.BLUE));
        titleOfPanel.setFont( new Font("Arial",Font.BOLD,20));
        titleOfPanel.setBorder(new LineBorder(Color.BLUE));
        titleOfPanel.setForeground(Color.BLUE);
        titleOfPanel.setHorizontalAlignment(SwingConstants.CENTER);
        aljardGU.setFont( new Font("Arial",Font.BOLD,20));
        aljardGU.setForeground(Color.BLACK);
        aljardGU.addActionListener(this);
        calcMonyGU.setFont( new Font("Arial",Font.BOLD,20));
        calcMonyGU.setForeground(Color.BLACK);
        calcMonyGU.addActionListener(this);
        debtGU.setFont( new Font("Arial",Font.BOLD,20));
        debtGU.setForeground(Color.BLACK);
        debtGU.addActionListener(this);
        title.setFont( new Font("Arial",Font.BOLD,25));
        title.setOpaque(true);
        title.setBorder(new LineBorder(Color.BLUE));
        title.setBackground(new Color (108,133,172,40));
        title.setForeground(Color.BLUE);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        MainPanel.setBackground(new Color (177,192,206,30));
        
        rightPanel.setBounds(798, 0, 295, 800);
        titleOfPanel.setBounds(0, 0, 295, 50);
        aljardGU.setBounds(0,50,300,40);
        calcMonyGU.setBounds(0,100,300,40);
        debtGU.setBounds(0,150,300,40);
        title.setBounds(0, 0, 800, 50);
        rightPanel.add(titleOfPanel);
        rightPanel.add(aljardGU);
        rightPanel.add(calcMonyGU);
        rightPanel.add(debtGU);
        MainPanel.setBounds(5, 55, 790, 780);
        
       add(title);
       add(rightPanel);
       add(MainPanel);

       this.setVisible(true);
      
    }@Override
    protected void paintComponent(Graphics g){
        super.paintComponents(g);
         Image img = new ImageIcon ("loginBac.jpg").getImage();

          g.drawImage(img,0,0,1100,800, null);

   }; 
 public static void main (String [] args){
   frame.add(new HomePage());
   frame.setVisible(true);
}   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(aljardGU)){
            MainPanel.removeAll();
            this.setVisible(false);
            MainPanel.add(new GUIShop());
            this.setVisible(true);
        }
        if(e.getSource().equals(calcMonyGU)){
            this.setVisible(false);
            if(frameCalc == null)
                frameCalc = calcuator();
            frameCalc.setVisible(true);  
            this.setVisible(true);
        }
        if(e.getSource().equals(debtGU)){
            MainPanel.removeAll();
            this.setVisible(false);
            MainPanel.add(new DebetPage());
            this.setVisible(true);
        }
    }
    public JFrame calcuator(){
            frameCalc = new JFrame("حاسبة المال");
            frameCalc.setBounds(580,80,300,600);
            frameCalc.setResizable(false);
            ImageIcon img = new ImageIcon("calculator mony icon.jpg");
            frameCalc.setIconImage(img.getImage());
            frameCalc.add(new MonyCalculatorGUI());
            
        return   frameCalc;  
    }
}
