package UI;

import db.Connector;
import db.models.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register_User extends JFrame{
    private JPanel mainPanel;
    private JTextField txtUser;
    private JTextField txtMail;
    private JPasswordField pwPass;
    private JButton registerButton;

    public Register_User() {
        add(mainPanel);

        setTitle("Database Connector - Register");
        setSize(400, 200);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUser.getText();
                int password = pwPass.hashCode();
                String email = txtMail.getText();

                User newUser = new User(username, password, email);

                Connector connector = new Connector();
                connector.registerUser(newUser);
            }
        });
    }
}
