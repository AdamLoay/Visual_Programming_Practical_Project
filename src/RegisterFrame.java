import javax.swing.*;
import java.awt.*;

public class RegisterFrame extends JFrame {
    JLabel username = new JLabel("Username:");
    JLabel password = new JLabel("Password:");
    JLabel gender = new JLabel("Gender:");
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup genderGroup = new ButtonGroup();
    JButton returnButton = new JButton("Return To Login");
    JButton registerButton = new JButton("Register");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    SpinnerNumberModel model = new SpinnerNumberModel(10, 10, 80, 1);
    JSpinner ageField = new JSpinner(model);
    public RegisterFrame(){
        setTitle("Visual Practical Exam | Registration Menu");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,600);

        genderGroup.add(male);
        genderGroup.add(female);



        setVisible(true);
    }
}
