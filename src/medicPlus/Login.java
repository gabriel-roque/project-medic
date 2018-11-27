package medicPlus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public void montarLogin(JFrame f){

    Font fontD = new Font("SansSerif", Font.BOLD, 15);

     // LOGO

    JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon(getClass().getResource("/public/medicPlus-login.png")));
        logo.setBounds(120,20,200,50);
        f.add(logo);


    JLabel user, pass;
    JTextField txUser;
    JPasswordField txPass;

    // User

    user = new JLabel("User:");
        user.setBounds(180, 90, 100, 20);
        user.setFont(fontD);
        f.add(user);

    txUser = new JTextField();
        txUser.setBounds(148, 120, 100, 20);
        f.add(txUser);

    // Pass

    pass = new JLabel("Password:");
        pass.setBounds(157, 150, 100, 20);
        pass.setFont(fontD);
        f.add(pass);

    txPass = new JPasswordField();
        txPass.setBounds(148, 180, 100, 20);
        f.add(txPass);


    // LOGIN

    JButton logar = new JButton("Login");
        logar.setBounds(152,230, 90,20);
        logar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller cot = new Controller();
                cot.dashboard();
                f.setVisible(false);
            }
        });
        f.add(logar);

    }
}
