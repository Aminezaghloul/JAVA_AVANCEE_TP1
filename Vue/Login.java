package Vue;

import DAO.EmployeeDAOImpl;
import Model.EmployeeModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel p1;
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;
    public JPasswordField getPassword() {
        return password;
    }

    public void setPassword(JPasswordField password) {
        this.password = password;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }



    public Login() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1));

        JPanel us = new JPanel(new FlowLayout());
        us.add(new JLabel("USERNAME:"));
        username = new JTextField(20);
        us.add(username);
        p1.add(us);

        JPanel pass = new JPanel(new FlowLayout());
        pass.add(new JLabel("PASSWORD:"));
        password = new JPasswordField(20);
        pass.add(password);
        p1.add(pass);

        JPanel buttons = new JPanel(new FlowLayout());
        loginButton = new JButton("Login");

        buttons.add(loginButton);
        p1.add(buttons);

        // Add ActionListener to switch frames
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close current JFrame
                EmployeeDAOImpl dao = new EmployeeDAOImpl();
                EmployeeModel model = new EmployeeModel(dao);
                Vue view = new Vue();
                // Instantiate the Login class
            }
        });

        add(p1);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login login = new Login();

    }
}
