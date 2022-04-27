
package theshopprogramm;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PersonalPage extends JPanel  {

    int id = -1;
    ArrayList<DebtorInfo> debtorsArrayLi = new ArrayList<>();
    LocalDate date = LocalDate.now();
    DefaultTableModel debts_detatils_model;
    JTable debts_detatils;
    DefaultTableCellRenderer rightRenderer;
    String col[] = {"المنتج", "السعر", "التاريخ"};
    String data[][] = {{"", "", date.toString()}};
    JScrollPane debts_detatils_Scroller, debtors_Scroller;
    DefaultListModel debtors_model;
    JList debtors;
    DefaultListCellRenderer ListRenderer;
    JLabel list_name, debt_sum, subTitle;
    JTextField debt_sumT;
    JButton Done, addDebt, add_debtor, keep, delete_debtor;
    JMenuItem deleteDebtor;
    Font font = new Font("Arial", Font.BOLD, 13);
    Color color = Color.BLACK;
    boolean add = true ;
   
    PersonalPage() {
       JLabel photo = new JLabel ();
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Image img = new ImageIcon("loginBac.jpg").getImage();

        g.drawImage(img, 0, 0, 690, 510, null);

    }

    ; 

  

    public static void main(String[] args) {
        PersonalPage f = new PersonalPage();
        JFrame f1 = new JFrame();
        f1.setTitle("AL momaiz");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBounds(300, 60, 690, 510);
        f1.setResizable(false);
        ImageIcon img = new ImageIcon("smarticon.jpg");
        f1.setIconImage(img.getImage());
        f1.add(f);

        f1.setVisible(true);
    }

    

}

