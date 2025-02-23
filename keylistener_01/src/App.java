import java.awt.*;
import java.awt.event.*;

public class App implements KeyListener {
    Label lbloutput;
    TextField txtOne;
    TextField txtTwo;

    App() {
        Frame f = new Frame();
        lbloutput = new Label();
        lbloutput.setBounds(20, 150, 200, 20);
        txtOne = new TextField();
        txtOne.setBounds(20, 80, 100, 20);
        txtTwo = new TextField();
        txtTwo.setBounds(20, 110, 100, 20);

        txtOne.addKeyListener(this);
        txtTwo.addKeyListener(this);

        f.add(lbloutput);
        f.add(txtOne);
        f.add(txtTwo);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        int a = Integer.parseInt(txtOne.getText());
        int b = Integer.parseInt(txtTwo.getText());
        int c = a + b;
        lbloutput.setText("Sum: " + c);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int a = Integer.parseInt(txtOne.getText());
        int b = Integer.parseInt(txtTwo.getText());
        int c = a - b;
        lbloutput.setText("Difference: " + c);
    }
}
