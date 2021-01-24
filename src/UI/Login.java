package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel mainPanel;
    private JTextField txtUser;
    private JButton loginButton;
    private JButton registerButton;
    private JPasswordField pwPass;

    public Login() {
        add(mainPanel);

        setTitle("Database Connector - Login");
        setSize(400, 300);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO open register window
                Register_User register_user = new Register_User();
                register_user.setVisible(true);
            }
        });
    }
}
