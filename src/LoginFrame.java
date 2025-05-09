import javax.swing.*;

public class LoginFrame extends JFrame {
    JLabel username = new JLabel("Username:");
    JLabel password = new JLabel("Password:");
    JLabel totalUsers = new JLabel("Total Users: " + User.totalUsers);
    JButton loginButton = new JButton("Login");
    JButton registerButton = new JButton("Register");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    public LoginFrame(){
        setTitle("Visual Practical Exam | Login Menu");
        setSize(400, 200);
        setResizable(false);
        setLayout(null); //Absolute Layout
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginButton.addActionListener(e -> {
            User user = User.getUser(usernameField.getText());
            if(user == null) {
                JOptionPane.showMessageDialog(null, "User Not Found! \nPlease Register First.");
                return;
            }
            if(user.getUsername().equals(usernameField.getText())
                    && user.getPassword().equals(passwordField.getText())){
                    UserInfoForm userInfoForm = new UserInfoForm(user);
                    dispose();
            }
                else
                JOptionPane.showMessageDialog(null, "Incorrect Info! \nPlease Try Again.");

        });

        registerButton.addActionListener(e -> {
            RegisterFrame registerFrame = new RegisterFrame();
            dispose();
        });


        username.setBounds(100, 10, 100, 20);
        add(username);
        usernameField.setBounds(180, 10, 100, 20);
        add(usernameField);

        password.setBounds(100, 40, 100, 20);
        add(password);
        passwordField.setBounds(180, 40, 100, 20);
        add(passwordField);

        totalUsers.setBounds(0, 140, 100, 20);
        add(totalUsers);

        loginButton.setBounds(80, 80, 90, 30);
        add(loginButton);
        registerButton.setBounds(200, 80, 90, 30);
        add(registerButton);
        setVisible(true);
    }
}
