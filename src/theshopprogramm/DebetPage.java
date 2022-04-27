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

public class DebetPage extends JPanel implements ActionListener, MouseListener {

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
   
    DebetPage() {
        super.setLayout(null);
        super.setBounds(0, 0, 850, 850);
        this.setOpaque(false);
        debts_detatils_model = new DefaultTableModel(data, col);
        debts_detatils = new JTable() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (debts_detatils.getValueAt(row, column).toString().trim().length() != 0) {
                    return true;
                }

                return column != 2;
            }
        };
        debts_detatils_Scroller = new JScrollPane(debts_detatils);
        rightRenderer = new DefaultTableCellRenderer();
        debtors_model = new DefaultListModel();
        debtors = new JList(debtors_model);
        debtors_Scroller = new JScrollPane(debtors);
        ListRenderer = new DefaultListCellRenderer();
        list_name = new JLabel("قائمة الاشخاص");
        Done = new JButton("تم التسديد");
        addDebt = new JButton("دين جديد");
        debt_sum = new JLabel("مجموع الدين :");
        subTitle = new JLabel("صفحة الديون  ");
        debt_sumT = new JTextField();
        add_debtor = new JButton("صفحة جديدة");
        delete_debtor = new JButton("حذف الصفحة");
        keep = new JButton("حفظ");
        deleteDebtor = new JMenuItem("حذف الصفحة");

       
        debtors.setFixedCellHeight(25);
        debts_detatils_Scroller.setOpaque(false);
        debts_detatils_Scroller.getViewport().setBackground(new Color(255, 255, 255, 60));
        debts_detatils.setModel(debts_detatils_model);
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        debts_detatils.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        debts_detatils.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        debts_detatils.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

        ListRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        debtors.setCellRenderer(ListRenderer);
        debts_detatils.setFont(font);
        debts_detatils.setForeground(color);
        debtors.setFont(font);
        debtors.setForeground(color);
        list_name.setFont(font);
        list_name.setForeground(color);
        Done.setFont(font);
        Done.setForeground(color);
        addDebt.setFont(font);
        addDebt.setForeground(color);
        debt_sum.setFont(font);
        debt_sum.setForeground(color);
        debt_sumT.setFont(font);
        debt_sumT.setForeground(color);
        add_debtor.setFont(font);
        add_debtor.setForeground(color);
        delete_debtor.setFont(font);
        delete_debtor.setForeground(color);
        keep.setFont(font);
        keep.setForeground(color);

        debtors.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        list_name.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        debts_detatils.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        debt_sum.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        debt_sumT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        Done.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        addDebt.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        add_debtor.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        delete_debtor.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        keep.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        debtors_Scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        //debts_detatils.setFillsViewportHeight(true);
        debts_detatils.setRowHeight(18);
        subTitle.setFont(new Font("Arial", Font.BOLD, 20));
        subTitle.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        subTitle.setOpaque(true);
        subTitle.setForeground(color);
        subTitle.setBackground(new Color(255, 255, 0));
        subTitle.setHorizontalAlignment(CENTER);

        Done.addActionListener(this);
        addDebt.addActionListener(this);
        add_debtor.addActionListener(this);
        delete_debtor.addActionListener(this);
        keep.addActionListener(this);
        debtors.addMouseListener(this);

        list_name.setHorizontalAlignment(CENTER);
        list_name.setOpaque(true);
        list_name.setBackground(Color.lightGray);
        debt_sum.setHorizontalAlignment(CENTER);
        debt_sum.setOpaque(true);
        debt_sumT.setHorizontalAlignment(CENTER);
        debt_sumT.setEditable(false);
        Done.setHorizontalAlignment(CENTER);
        addDebt.setHorizontalAlignment(CENTER);

        add_debtor.setIcon(new ImageIcon(new ImageIcon("addpage.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        add_debtor.setHorizontalTextPosition(AbstractButton.LEFT);
        add_debtor.setVerticalTextPosition(AbstractButton.CENTER);
        Done.setIcon(new ImageIcon(new ImageIcon("done.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        Done.setHorizontalTextPosition(AbstractButton.RIGHT);
        Done.setVerticalTextPosition(AbstractButton.CENTER);
        addDebt.setIcon(new ImageIcon(new ImageIcon("newDet.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        addDebt.setHorizontalTextPosition(AbstractButton.RIGHT);
        addDebt.setVerticalTextPosition(AbstractButton.CENTER);
        subTitle.setIcon(new ImageIcon(new ImageIcon("debt.jpg").getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH)));
        subTitle.setHorizontalTextPosition(AbstractButton.RIGHT);
        subTitle.setVerticalTextPosition(AbstractButton.CENTER);

        subTitle.setBounds(250, 15, 250, 40);
        add_debtor.setBounds(550, 50, 120, 30);
        delete_debtor.setBounds(580, 550, 100, 30);
        list_name.setBounds(525, 100, 190, 25);
        debtors_Scroller.setBounds(520, 125, 200, 400);
        debts_detatils_Scroller.setBounds(80, 125, 420, 350);
        debts_detatils_Scroller.setVisible(false);
        keep.setBounds(10, 250, 60, 30);
        debt_sum.setBounds(260, 500, 100, 25);
        debt_sumT.setBounds(190, 500, 50, 25);
        Done.setBounds(80, 550, 115, 25);
        addDebt.setBounds(340, 550, 120, 25);

        add(subTitle);
        add(add_debtor);
        add(debtors_Scroller);
        add(debts_detatils_Scroller);
        add(delete_debtor);
        add(keep);
        add(list_name);
        add(Done);
        add(addDebt);
        add(debt_sum);
        add(debt_sumT);
        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Image img = new ImageIcon("loginBac.jpg").getImage();
        g.drawImage(img, 0, 0, 810, 720, null);
    }; 
    @Override
    public void actionPerformed(ActionEvent e) {
        debts_detatils.setRowHeight(20);
        if (e.getSource().equals(addDebt)) {
            for (int i = 0; i < debts_detatils.getRowCount(); i++) {
                for (int j = 0; j < debts_detatils.getColumnCount(); j++) {
                    String value = debts_detatils.getValueAt(i, j).toString();
                    if (value.trim().length() == 0) {
                        JOptionPane.showMessageDialog(null, "الادخال غير مكتمل", "خطأ", 0);
                        add = false;
                        break;
                    }
                }
            }
            if (add) {
                debts_detatils_model.addRow(new String[]{"", "", date.toString()});
            }
            keep.setEnabled(true);
            add = true;
        } else if (e.getSource().equals(add_debtor)) {
            String debtor_Name = JOptionPane.showInputDialog(null, "ادخل الاسم :", "اضافة صفحة دين جديدة", 1);
            if ((debtor_Name == null) || (debtor_Name.trim().equals(""))) {
                JOptionPane.showMessageDialog(null, "لقيمة المدخلة غير صحيحة!!", "خطأ", 0);
            } else {
                debtors_model.addElement(new DebtorInfo(debtor_Name));
            }
        } else if (e.getSource().equals(keep)) {
            try {
                DebtorInfo debtorInstance = (DebtorInfo) debtors.getSelectedValue();
                if (debts_detatils.getRowCount() > debtorInstance.debtDetails.size()) {
                    int i = debts_detatils.getRowCount() - debtorInstance.debtDetails.size(), j;
                    for (j = debts_detatils.getRowCount() - i; j < debts_detatils.getRowCount(); j++) {
                        debtorInstance.debtDetails.add(new Debt_details(debts_detatils.getValueAt(j, 0).toString(), Double.parseDouble(debts_detatils.getValueAt(j, 1).toString()), debts_detatils.getValueAt(j, 2).toString()));
                    }
                }
                debt_sumT.setText("" + debtorInstance.sum_the_debts());
                keep.setEnabled(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "لقيمة المدخلة غير صحيحة!!", "خطأ", 0);
            }
        }
        if (e.getSource().equals(Done)) {
            int selectedRow = debts_detatils.getSelectedRow();
            if (selectedRow != -1) {
                DebtorInfo selectedDebtor = (DebtorInfo) debtors.getSelectedValue();
                int size = selectedDebtor.debtDetails.size();
                if (selectedRow <= size - 1) {
                    double mins = selectedDebtor.debtDetails.get(selectedRow).getValue();
                    int confirm = JOptionPane.showConfirmDialog(null, "هل أنت متأكد؟", "تأكيد", 2);
                    if (confirm == 0) {
                        debt_sumT.setText(selectedDebtor.sum_the_remaining(mins) + "");
                        selectedDebtor.debtDetails.remove(selectedRow);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "هذا المنتج غير محفوظ مسبقا", "", 2);
            }
        } else if (e.getSource().equals(delete_debtor)) {
            int index = debtors.getSelectedIndex();
            if (index > -1) {
                debtors_model.remove(index);
            } else {
                JOptionPane.showMessageDialog(null, "اختر الصفحة اولا", "eror", 2);
            }
        }
    }

    public static void main(String[] args) {
        DebetPage f = new DebetPage();
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

    @Override
    public void mouseClicked(MouseEvent e) {
        debts_detatils_Scroller.setVisible(true);
        DebtorInfo selectedDebtor = (DebtorInfo) debtors.getSelectedValue();
        int size = selectedDebtor.debtDetails.size();
        debts_detatils_model.setNumRows(size);
        for (int i = 0; i < size; ++i) {
            debts_detatils.setValueAt(selectedDebtor.debtDetails.get(i).getProduct(), i, 0);//product
            debts_detatils.setValueAt(selectedDebtor.debtDetails.get(i).getValue(), i, 1);//price
            debts_detatils.setValueAt(selectedDebtor.debtDetails.get(i).getDate(), i, 2);//date
        }
        debt_sumT.setText(selectedDebtor.getDebts_sum() + "");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
