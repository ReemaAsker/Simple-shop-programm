
package theshopprogramm;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import static javax.swing.SwingConstants.CENTER;

public class MonyCalculatorGUI extends JPanel implements ActionListener {

   JLabel subTitle ,twoHun , hundrad ,fivety, twenty , ten , five ,Shakal , sum;
   JSpinner hundradT,twoHunT ,fivetyT, twentyT , tenT , fiveT ,ShakalT;
   JTextField  sumT;
   JButton calcSum ,deleteAll;
   Font font;
   Color color;
//    SpinnerModel value =  
//             new SpinnerNumberModel(0, //initial value  
//                0, //minimum value  
//                1000000000, //maximum value  
//                1); //step  
public MonyCalculatorGUI(){
    
    super.setLayout(null);
    super.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    subTitle= new JLabel("شركة الاتصالات ");
    twoHun = new JLabel("فئة 200 شيكل");
    hundrad = new JLabel("فئة ال 100 شيكل");
    fivety = new JLabel("فئة ال 50 شيكل");
    twenty = new JLabel("فئة ال20 شيكل");
    ten = new JLabel("فئة ال 10 شيكل");
    five = new JLabel("فئة ال 5 شيكل");
    Shakal = new JLabel("فئة الشيكل");
    sum = new JLabel("المجموع");   
    twoHunT = new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    hundradT = new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    fivetyT= new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    twentyT = new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));    
    tenT= new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    fiveT = new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    ShakalT = new JSpinner(new SpinnerNumberModel(0,0,1000000000, 1));   
    sumT = new JTextField (); 
    calcSum = new JButton("احسب");
    deleteAll = new JButton("تفريغ الحقول");
    
    font= new Font("Arial",Font.BOLD,16);
    color = Color.BLACK;   

    subTitle.setFont( new Font("Arial",Font.BOLD,20));
    subTitle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    subTitle.setOpaque(true);
    subTitle.setForeground(Color.red);
    subTitle.setBackground( new Color(255,255,0));
    subTitle.setHorizontalAlignment(CENTER);
    twoHun.setFont(font);
    twoHun.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    twoHun.setForeground(color);  
    hundrad.setFont(font);
    hundrad.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    hundrad.setForeground(color);
    fivety.setFont(font);
    fivety.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    fivety.setForeground(color);
    twenty.setFont(font);
    twenty.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    twenty.setForeground(color);
    ten.setFont(font);
    ten.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    ten.setForeground(color);
    five.setFont(font);
    five.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    five.setForeground(color);
    Shakal.setFont(font);
    Shakal.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    Shakal.setForeground(color);
    sum.setFont(font);
    sum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    sum.setForeground(color);
    calcSum.setFont(font);
    calcSum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    calcSum.addActionListener(this);
    calcSum.setForeground(color);
    deleteAll.setFont(font);
    deleteAll.setForeground(color);
    deleteAll.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    deleteAll.addActionListener(this);
    twoHunT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    twoHunT.setFont(font);
    twoHunT.setForeground(color);
    hundradT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); 
    hundradT.setFont(font);
    hundradT.setForeground(color);
    fivetyT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    fivetyT.setFont(font);
    fivetyT.setForeground(color);
    twentyT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    twentyT.setFont(font);
    twentyT.setForeground(color);
    tenT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    tenT.setFont(font);
    tenT.setForeground(color);
    fiveT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    fiveT.setFont(font);
    fiveT.setForeground(color);
    ShakalT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    ShakalT.setFont(font);
    ShakalT.setForeground(color);
    sumT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
    sumT.setFont(font);
    sumT.setForeground(color);
    sumT.setEditable(false);
    
    subTitle.setBounds(10,10,270,30);
    twoHun.setBounds(150,60,100,30);
    twoHunT.setBounds(55,60,50,30);
    hundrad.setBounds(150,110,100,30);
    hundradT.setBounds(55,110,50,30);
    fivety.setBounds(150,170,100,30);
    fivetyT.setBounds(55,170,50,30);
    twenty.setBounds(150,225,100,30);
    twentyT.setBounds(55,225,50,30);
    ten.setBounds(150,285,100,30);
    tenT.setBounds(55,285,50,30);
    five.setBounds(150,335,100,30);
    fiveT.setBounds(55,335,50,30);
    Shakal.setBounds(150,385,100,30);
    ShakalT.setBounds(55,385,50,30);
    calcSum.setBounds(175,435,80,30);
    sumT.setBounds(55,435,50,30);
    deleteAll.setBounds(85,485,120,30);

    

    add(subTitle);
    add(twoHun);
    add(twoHunT);
    add(hundrad);
    add(hundradT);
    add(fivety);
    add(fivetyT);
    add(twenty);
    add(twentyT);
    add(ten);
    add(tenT);
    add(five);
    add(fiveT);
    add(Shakal);
    add(ShakalT);
    add(sumT);
    add(calcSum);
    add(deleteAll);
    
    this.setVisible(true);

} @Override
 protected void paintComponent(Graphics g){
        super.paintComponents(g);
         Image img = new ImageIcon ("13.jpg").getImage();

          g.drawImage(img,0,0,300,600, null);
       
}  @Override
   public void actionPerformed(ActionEvent e){
      
    try {
        if(e.getSource().equals(calcSum) ){
            int twoHun,hundrad,fivety,twenty,ten,five,Shakal;
          
        if((((twoHunT.getValue()+"") ).trim()).equals(""))
            twoHun =0;
        else
        twoHun = Integer.parseInt( ((twoHunT.getValue()+"") ).trim());

         if((((hundradT.getValue()+"") ).trim()).equals(""))
            hundrad =0;
        else
        hundrad =Integer.parseInt((hundradT.getValue()+"") .trim());

         if((((fivetyT.getValue()+"") ).trim()).equals(""))
            fivety =0;
        else
        fivety =Integer.parseInt((fivetyT.getValue()+"") .trim());

        if((((twentyT.getValue()+"") ).trim()).equals(""))
            twenty =0;
        else
        twenty =Integer.parseInt((twentyT.getValue()+"") .trim());

        if((((tenT.getValue()+"") ).trim()).equals(""))
            ten =0;
        else
        ten =Integer.parseInt((tenT.getValue()+"") .trim());

        if((((fiveT.getValue()+"") ).trim()).equals(""))
            five =0;
        else
        five =Integer.parseInt((fiveT.getValue()+"") .trim());

      if((((ShakalT.getValue()+"") ).trim()).equals(""))
            Shakal =0;
        else
        Shakal =Integer.parseInt((ShakalT.getValue()+"") .trim());

        sumT.setText(sum(twoHun, hundrad, fivety, twenty, ten, five, Shakal)+"");
        
        }
    }catch(Exception ex)   {
        JOptionPane.showMessageDialog(null, "قيمة غير مسموح بها , اعد الادخال مرة اخرى","خطأ",0);
    }
//    
   if(e.getSource().equals(deleteAll)){
       twoHunT.setValue(0);
       hundradT.setValue(0);
       fivetyT.setValue(0);
       twentyT.setValue(0);
       tenT.setValue(0);
       fiveT.setValue(0);
       ShakalT.setValue(0);
        sumT.setText("");
    }
   
}
    public int sum ( int twoHun, int hundrad, int fivety, int twenty, int ten, int five, int Shakal){
        return (twoHun*200)+ (hundrad*100) + (fivety*50) + (twenty*20) + (ten*10) + (five*5) + (Shakal*1) ;
    }
    
}

