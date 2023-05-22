import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginForm extends JFrame implements ActionListener {

    
    Container container = getContentPane();
    JLabel titleLabel = new JLabel("Login here");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton signupButton = new JButton("Create an account");
    JCheckBox showPassword = new JCheckBox("Show Password");
 
 
    public LoginForm() {
        //title
        setTitle("");
        setVisible(true);
        setBounds(10, 10, 370, 600);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setVisible(true);
 
    }
    //LayoutManager
    public void setLayoutManager() {
        container.setLayout(null);
    }
    //
    public void setLocationAndSize() {
        //Title
        titleLabel.setBounds(50, 90, 200, 30);
        titleLabel.setFont(new Font("Consolas", Font.PLAIN, 25));
        titleLabel.setForeground(new Color(0, 0, 255));

        //Username
        userLabel.setBounds(50, 150, 100, 30);
        userLabel.setFont(new Font("Consolas", Font.BOLD, 17));
        userTextField.setBounds(130, 150, 180, 30);

        //Password 
        passwordLabel.setBounds(50, 220, 100, 30);
        passwordLabel.setFont(new Font("Consolas", Font.BOLD, 17));
        passwordField.setBounds(130, 220, 180, 30);

        //Show password
        showPassword.setBounds(100, 250, 150, 30);
        showPassword.setFont(new Font("Consolas", Font.BOLD, 13));
        
        //Login Button
        loginButton.setFont(new Font("Consolas", Font.PLAIN, 17));
        loginButton.setBounds(50, 300, 100, 30);
        loginButton.setBackground(new Color(240, 240, 240));

        //Signup Button
        signupButton.setBounds(200, 300, 125, 30);
        signupButton.setFont(new Font("Consolas", Font.BOLD, 9));
        signupButton.setForeground(new Color(100, 90, 50));
        signupButton.setBackground(new Color(240, 240, 240));
        
    }
    //components
    public void addComponentsToContainer() {
        container.add(titleLabel);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(signupButton);
    }
    //ActionListener
    public void addActionEvent() {
        loginButton.addActionListener(this);
        signupButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //LOGIN button
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();;
            String pwdText = new String(passwordField.getPassword());
            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("password")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Sign up  button
        else if (e.getSource().equals(signupButton)) {
            dispose();
            new Signup();
        }
       //show password
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
            
 
        }
    }

 
 }
    