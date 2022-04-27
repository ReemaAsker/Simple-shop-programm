package theshopprogramm;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.time.LocalDate;
import static javax.swing.SwingConstants.CENTER;

public class GUIShop extends JPanel implements ActionListener {

    public final static int h = 30;
    public final static int w = 60;
    String[] productName = {"المسمى", "المبلغ"};

    JLabel secTitle, Inside, jawwal, tsalate, hdara, padalFaqed, phones, accessories, buying, remaing, electrcety, tayer, currentSum, previousSum;
    JTextField jawwalT, tsalateT, hdaraT, padalFaqedT, phonesT, accessoriesT, electrcetyBuyT, tayerBuyT, electrcetyRemainT, tayerRemainT, currentSumT, previousSumT;
    JPanel panel_for_inside, panel_to_complete, results;
    JButton input, buttonExit;
    Font font;
    Color color;
    GUIShop() {
        super.setLayout(null);
        super.setBounds(0, 0, 690, 510);
        super.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        font = new Font("Arial", Font.BOLD, 16);
        color = Color.BLACK;
        secTitle = new JLabel("الجرد اليومي  ");
        jawwal = new JLabel("جوال");
        tayer = new JLabel("طاير");
        tsalate = new JLabel("اتصالات");
        hdara = new JLabel("حضارة");
        electrcety = new JLabel("كهرباء");
        padalFaqed = new JLabel("بدل فاقد");
        Inside = new JLabel("تحصيلات");
        phones = new JLabel("الجوالات");
        accessories = new JLabel("اكسسوارات");
        currentSum = new JLabel("الرصيد الحالي:");
        previousSum = new JLabel("الرصيد السابق:");
        buying = new JLabel("المبيع");
        remaing = new JLabel("المتبقي");
        jawwalT = new JTextField();
        tayerBuyT = new JTextField();
        tayerRemainT = new JTextField();
        tsalateT = new JTextField();
        hdaraT = new JTextField();
        padalFaqedT = new JTextField();
        phonesT = new JTextField();
        accessoriesT = new JTextField();
        electrcetyBuyT = new JTextField();
        electrcetyRemainT = new JTextField();
        jawwalT = new JTextField();
        currentSumT = new JTextField();
        previousSumT = new JTextField();
        panel_for_inside = new JPanel(null);
        panel_to_complete = new JPanel(null);
        results = new JPanel(null);
        input = new JButton("حفظ");/////////////////////////////
        /////Font
        secTitle.setFont(new Font("Arial", Font.BOLD, 20));
        jawwal.setFont(font);
        tayer.setFont(font);
        tsalate.setFont(font);
        hdara.setFont(font);
        electrcety.setFont(font);
        padalFaqed.setFont(font);
        Inside.setFont(font);
        results.setFont(font);
        phones.setFont(font);
        accessories.setFont(font);
        currentSum.setFont(font);
        previousSum.setFont(font);
        buying.setFont(font);
        remaing.setFont(font);
        input.setFont(font);
        /////
        secTitle.setForeground(Color.BLUE);
        secTitle.setForeground(color);
        jawwal.setForeground(color);
        tayer.setForeground(color);
        tsalate.setForeground(color);
        electrcety.setForeground(color);
        padalFaqed.setForeground(color);
        hdara.setForeground(color);
        Inside.setForeground(color);
        results.setForeground(color);
        phones.setForeground(color);
        accessories.setForeground(color);
        currentSum.setForeground(color);
        previousSum.setForeground(color);
        buying.setForeground(color);
        remaing.setForeground(color);
        input.setForeground(color);
        secTitle.setBackground(new Color(255, 255, 0));
        Inside.setBackground(new Color(238, 238, 238));
        results.setBackground(new Color(238, 238, 238));
        panel_for_inside.setBackground(new Color(0, 128, 255, 100));
        panel_to_complete.setBackground(new Color(0, 128, 255, 100));
        //////
        secTitle.setIcon(new ImageIcon(new ImageIcon("note.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        secTitle.setHorizontalTextPosition(AbstractButton.RIGHT);
        secTitle.setHorizontalAlignment(CENTER);
        Inside.setHorizontalAlignment(CENTER);
        ///////setOpaque 
        Inside.setOpaque(true);
        setOpaque(false);
        ///////////ComponentOrientation
        secTitle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jawwal.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tayer.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tsalate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        hdara.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        electrcety.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        padalFaqed.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        Inside.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        results.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        phones.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        accessories.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        currentSum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        previousSum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        buying.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        remaing.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        input.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel_for_inside.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel_to_complete.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jawwalT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tayerBuyT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        electrcetyBuyT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tayerRemainT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        electrcetyRemainT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tsalateT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        hdaraT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        padalFaqedT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        phonesT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        accessoriesT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        currentSumT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        previousSumT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ////////////
        input.addActionListener(this);
        ////////////
        Inside.setBounds(70, 80, 600, 35);
        panel_for_inside.setBounds(435, 120, 230, 300);
        jawwal.setBounds(150, 20, w, h);
        jawwalT.setBounds(15, 20, w, h);
        tsalate.setBounds(150, 60, w, h);
        hdara.setBounds(150, 100, w, h);
        padalFaqed.setBounds(150, 140, w, h);
        tsalateT.setBounds(15, 60, w, h);
        hdaraT.setBounds(15, 100, w, h);
        padalFaqedT.setBounds(15, 140, w, h);
        phones.setBounds(150, 180, w, h);
        phonesT.setBounds(15, 180, w, h);
        accessories.setBounds(140, 220, w + 10, h);
        accessoriesT.setBounds(15, 220, w, h);
        secTitle.setBounds(280, 15, 160, 35);
        panel_to_complete.setBounds(70, 120, 330, 160);
        results.setBounds(125, 300, 220, 130);
        remaing.setBounds(20, 10, w, h);
        buying.setBounds(125, 10, w, h);
        tayer.setBounds(230, 90, w, h);
        tayerBuyT.setBounds(150, 90, 50, h);
        electrcety.setBounds(230, 50, w, h);
        electrcetyBuyT.setBounds(150, 50, 50, h);
        tayerRemainT.setBounds(35, 90, 50, h);
        electrcetyRemainT.setBounds(35, 50, 50, h);
        currentSum.setBounds(95, 65, 100, h);
        previousSum.setBounds(95, 25, 100, h);
        previousSumT.setBounds(25, 25, 50, h);
        currentSumT.setBounds(25, 65, 50, h);
        input.setBounds(180, 440, 120, 35);
        //Add
        panel_for_inside.add(jawwal);
        panel_for_inside.add(jawwalT);
        panel_for_inside.add(tayer);
        panel_for_inside.add(tsalate);
        panel_for_inside.add(hdara);
        panel_for_inside.add(padalFaqed);
        panel_for_inside.add(tsalateT);
        panel_for_inside.add(hdaraT);
        panel_for_inside.add(padalFaqedT);
        panel_to_complete.add(buying);
        panel_to_complete.add(remaing);
        panel_to_complete.add(electrcety);
        panel_to_complete.add(electrcetyBuyT);
        panel_to_complete.add(tayer);
        panel_to_complete.add(tayerBuyT);
        panel_to_complete.add(tayerRemainT);
        panel_to_complete.add(electrcetyRemainT);
        results.add(previousSumT);
        results.add(previousSum);
        results.add(currentSumT);
        results.add(currentSum);
        panel_for_inside.add(phones);
        panel_for_inside.add(phonesT);
        panel_for_inside.add(accessories);
        panel_for_inside.add(accessoriesT);
        add(Inside);
        add(secTitle);
        add(panel_for_inside);
        add(panel_to_complete);
        add(results);
        add(input);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(input)) {
            if (jawwalT.getText().equals("") || tayerBuyT.getText().equals("") || phonesT.getText().equals("") || accessoriesT.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "خطأ", "ادخل الحقل الفارغ", 0);
            }
            String[] productArray = {"جوال" + "\t\t" + jawwalT.getText(), "اتصالات" + "\t\t" + tsalateT.getText(), "حضارة" + "\t\t" + hdaraT.getText(), "بدل فاقد" + "\t\t" + padalFaqedT.getText(), "الجوالات" + "\t\t" + phonesT.getText(), "الاكسسوارات" + "\t" + accessoriesT.getText()+"\r\n\r\n\t"+"المبيع"+"\t"+"المتبقي"+"\r\n"+"كهرباء"+"\t"+electrcetyBuyT.getText()+"\t"+electrcetyRemainT.getText()+"\r\n"+"طاير"+"\t"+tayerBuyT.getText()+"\t"+tayerRemainT.getText()};
            saveData(productArray);
        }
    }
//+"\r\n\r\nالرصيد السابق :"+previousSumT.getText()+"\r\nالرصيد الحالي"+currentSumT.getText() 
    public void saveData(String[] productArray) {
        LocalDate date = LocalDate.now();
        String[] productArrayUse = productArray;
        try {
            File file = new File("" + date + ".txt");
            try (DataOutputStream saveToFile = new DataOutputStream(new FileOutputStream(file))) {
                saveToFile.writeUTF(date + "\r\n\r\n");
                saveToFile.writeUTF(productName[0] + "\t\t" + productName[1] + "\r\n");

                for (int i = 0; i < productArrayUse.length; ++i) {
                    saveToFile.writeUTF(productArrayUse[i]);
                    saveToFile.writeUTF("\r\n");

                }
            saveToFile.flush();
            saveToFile.close();
            
            JOptionPane.showMessageDialog(null, "Data is Saved!");

            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }

}
