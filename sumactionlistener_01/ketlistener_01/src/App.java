import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class App implements KeyListener {
    JLabel l;
    JTextArea area;
    App(){
        JFrame f= new JFrame();
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);
        area = new JTextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        f.add(l);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
