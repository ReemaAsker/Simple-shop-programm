package theshopprogramm;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Login extends JPanel implements ActionListener {

    static staticClass frame = new staticClass();
    JPanel panel;
    JLabel loginPhoto, user, passwared, eyePhoto;
    JTextField userT;
    JPasswordField pass;
    JButton enter;
    Font font = new Font("Arial", Font.BOLD, 18);
    Color color = new Color(0, 0, 0);

    Login() {
        this.setLayout(null);
        panel = new JPanel(null);
        loginPhoto = new JLabel();
        loginPhoto.setIcon(new ImageIcon(new ImageIcon("login1.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        eyePhoto = new JLabel();
        eyePhoto.setIcon(new ImageIcon(new ImageIcon("eye.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        eyePhoto.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pass.setEchoChar((char) 0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                pass.setEchoChar('*');

            }

        });
        user = new JLabel("اسم المستخدم ");
        passwared = new JLabel("كلمة المرور");
        userT = new JTextField() {
            @Override
            public Insets getInsets() {
                return new Insets(5, 5, 5, 15);
            }
        };
        //userT = new JTextField ();
        pass = new JPasswordField() {
            @Override
            public Insets getInsets() {
                return new Insets(5, 5, 5, 15);
            }
        };
        enter = new JButton("دخول");

        panel.setBackground(new Color(124, 182, 228, 100));
        panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel.setBorder(new LineBorder(new Color(0, 0, 0, 70)));
        user.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        user.setFont(font);
        user.setForeground(color);
        passwared.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        passwared.setFont(font);
        passwared.setForeground(color);
        userT.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        userT.setFont(new Font("Arial", Font.BOLD, 13));
        userT.setForeground(color);
        pass.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        pass.setFont(new Font("Arial", Font.BOLD, 13));
        pass.setForeground(color);
        pass.setEchoChar('*');
        enter.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        enter.setFont(font);
        enter.setForeground(color);
        enter.setIcon(new ImageIcon(new ImageIcon("loginBu.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        enter.setHorizontalTextPosition(AbstractButton.RIGHT);
        enter.setVerticalTextPosition(AbstractButton.CENTER);
        enter.addActionListener(this);

        panel.setBounds(290, 200, 350, 350);
        loginPhoto.setBounds(110, 20, 150, 150);
        user.setBounds(200, 180, 120, 25);
        userT.setBounds(100, 180, 120, 25);
        passwared.setBounds(200, 230, 120, 25);
        pass.setBounds(100, 230, 120, 25);
        eyePhoto.setBounds(60, 230, 35, 25);
        enter.setBounds(120, 290, 150, 30);
        panel.add(loginPhoto);
        panel.add(user);
        panel.add(passwared);
        panel.add(userT);
        panel.add(pass);
        panel.add(eyePhoto);
        panel.add(enter);

        add(panel);
        setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Image img = new ImageIcon("loginBac.jpg").getImage();

        g.drawImage(img, 0, 0, 1100, 800, null);

    }

    ; 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(enter)) {
            String passwaredText = new String(pass.getPassword());
            if (userT.getText().equalsIgnoreCase("reema") && passwaredText.equals("123")) {
                this.setVisible(false);////refreash
                frame.remove(this);
                frame.add(new HomePage());
            } else {
                JOptionPane.showMessageDialog(null, "خطأ", "الادخال خاطىء", 0);
            }

        }
    }

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.add(new Login());
        frame.setVisible(true);
    }

}
