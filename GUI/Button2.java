package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Button2 implements ActionListener{
    public Button2(){
        JFrame frame = new JFrame("Example");
        JButton btn = new JButton("Click me");

        btn.addActionListener(this);
        frame.add(btn);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Button2();
    }

    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "I was clicked!");
    }
}
