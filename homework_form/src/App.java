import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame f= new JFrame();
       JComboBox<String> titleComboBox;
       JTextField fnameField;
       JTextField lnameField;
       JTextField usernameField;
       JPasswordField passwordField;
       JTextField emailField;
       JRadioButton maleButton;
       JRadioButton femaleButton;
       JCheckBox courseJava;
       JCheckBox courseC;
       JCheckBox coursePython;
       JButton savebutton;
       f.setTitle("Form");
       //title
       JLabel titleLabel= new JLabel("Title");
       titleLabel.setBounds(30,40,100,25);
       String[] titles={"Mr.","Mrs.","Miss."};
       titleComboBox= new JComboBox<>(titles);
       titleComboBox.setBounds(100, 40, 150, 25);
       f.add(titleLabel);
       f.add(titleComboBox);
       //firstname
       JLabel fnameLabel= new JLabel("First Name");
       fnameLabel.setBounds(30, 80, 100, 25);
       fnameField= new JTextField();
       fnameField.setBounds(100, 80, 150, 25);
       f.add(fnameLabel);
       f.add(fnameField);
       //lastname
       JLabel lnameLabel= new JLabel("Last Name");
       lnameLabel.setBounds(30, 120, 100, 25);
       lnameField= new JTextField();
       lnameField.setBounds(100, 120, 150, 25);
       f.add(lnameLabel);
       f.add(lnameField);
       //username
       JLabel usernameLabel= new JLabel("Userame");
       usernameLabel.setBounds(30, 160, 100, 25);
       usernameField= new JTextField();
       usernameField.setBounds(100, 160, 150, 25);
       f.add(usernameLabel);
       f.add(usernameField);
       //password
       JLabel passwordLabel= new JLabel("Password");
       passwordLabel.setBounds(30, 200, 100, 25);
       passwordField= new JPasswordField();
       passwordField.setBounds(100, 200, 150, 25);
       f.add(passwordLabel);
       f.add(passwordField);
       //email
       JLabel emailLabel= new JLabel("Email");
       emailLabel.setBounds(30, 240, 100, 25);
       emailField= new JTextField();
       emailField.setBounds(100, 240, 150, 25);
       f.add(emailLabel);
       f.add(emailField);
       //Gender
       JLabel genderLabel= new JLabel("Gender");
       genderLabel.setBounds(30, 280, 90, 25);
       maleButton = new JRadioButton("Male");
       maleButton.setBounds(100, 280, 100, 25);
       femaleButton = new JRadioButton("Female");
       femaleButton.setBounds(200, 280, 90, 25);
       
       f.add(genderLabel);
       f.add(maleButton);
       f.add(femaleButton);
       
       //course
       JLabel coursesLabel= new JLabel("Course");
       coursesLabel.setBounds(30, 320, 100, 25);
       courseJava= new JCheckBox("Java");
       courseJava.setBounds(140,320,150,25);
       courseC= new JCheckBox("C");
       courseC.setBounds(140,340,150,25);
       coursePython= new JCheckBox("Python");
       coursePython.setBounds(140, 360, 150, 25);
       f.add(coursesLabel);
       f.add(courseJava);
       f.add(courseC);
       f.add(coursePython);
       //submit
       savebutton = new JButton("Save");
       savebutton.setBounds(140, 420, 150, 25);
       f.add(savebutton);


       f.setSize(400, 550);
       f.setLayout(null);
       f.setVisible(true);
    }
}
 