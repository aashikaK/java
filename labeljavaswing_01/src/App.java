import javax.swing.*;
public class App extends JFrame{
    public static void main(String[] args) throws Exception {
       JFrame a= new JFrame();
       JLabel lbl= new JLabel("Welcome");
       lbl.setBounds(40, 40,90, 20);
       a.add(lbl);
       a.setSize(200,200);
       a.setLayout(null);
       a.setVisible(true);
    }
}
