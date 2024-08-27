import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {
    JTextField tf;
    JButton b;
    App(){
        JFrame f= new JFrame();
        tf= new JTextField();
        tf.setBounds(50, 50, 150, 20);
        b= new JButton("Click Here");
        b.setBounds(50, 100, 100, 30);
        //2nd Step
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    //3rd step
    public void actionPerformed(ActionEvent e){
        tf.setText("Hello World");
    }
    public static void main(String[] args) throws Exception {
       new App();
    }
}
