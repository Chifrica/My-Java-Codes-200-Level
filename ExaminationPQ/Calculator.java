import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField box;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnAdd;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSubtract;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMultiply;
    private JButton btnDivision;
    private JButton btnZero;
    private JButton btnEqual;

    public Calculator(){
        super("Calculator");
        setSize(250, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        box = new JTextField(13);

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnAdd = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnSubtract = new JButton("-");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnMultiply = new JButton("*");
        btnDivision = new JButton("/");
        btnZero = new JButton("0");
        btnEqual = new JButton("=");

        add(box);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnAdd);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnSubtract);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btnMultiply);
        add(btnDivision);
        add(btnZero);
        add(btnEqual);

        // box.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         if(btn1 == true){
        //             btn1.getText();
        //         } else if (btn2 == true){
        //             btn1.getText();
        //         } else if (btn3 == true){
        //             btn1.getText();
        //         } else if (btn4 == true){
        //             btn1.getText();
        //         } else if (btn5 == true){
        //             btn1.getText();
        //         } else if (btn6 == true){
        //             btn1.getText();
        //         } else if (btn7 == true){
        //             btn1.getText();
        //         } else if (btn8 == true){
        //             btn1.getText();
        //         } else if (btn9 == true){
        //             btn1.getText();
        //         } else if (btnZero == true){
        //             btn1.getText();
        //         } else if (btnAdd == true){
        //             btn1.getText();
        //         } else if (btnSubtract == true){
        //             btn1.getText();
        //         } else if (btnMultiply == true){
        //             btn1.getText();
        //         } else if (btnEqual == true){
        //             btn1.getText();
        //         } else {
        //             return false;
        //         }
        //     }
        // });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}