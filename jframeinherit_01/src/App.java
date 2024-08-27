import javax.swing.*;
public class App extends JFrame {
    JFrame f;
    App(){
    JButton b= new JButton("click");
    b.setBounds(130,100, 100, 40);
    add(b);
    setSize(400,500);
    setVisible(true);
    }
    public static void main(String[] args) throws Exception {
    App app= new App();
    }
}
