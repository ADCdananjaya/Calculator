import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.ComponentOrientation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main extends JFrame{

    double num1, num2, result;
    char operator;

    public Main(){
        setTitle("Calculator");
        setSize(378, 490);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(10, 10, 340, 80);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(1, 1, 338, 78);
        textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        textArea.setEditable(false);
        textArea.setFont(new Font(null, Font.BOLD, 35));
        textArea.setForeground(Color.BLACK);

        panel1.add(textArea);
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(10, 100, 340, 336);
        panel2.setBackground(Color.white);
        panel2.setLayout(null);

        //---------buttons -----------

        JButton button0 = new JButton("0");
        button0.setBounds(2, 1, 75, 75);
        button0.setFocusable(false);
        button0.setFont(new Font("Consolas", Font.BOLD, 35));
        button0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("0"));
            }
        });
        panel2.add(button0);

        JButton button1 = new JButton("1");
        button1.setBounds(88, 1, 75, 75);
        button1.setFocusable(false);
        button1.setFont(new Font("Consolas", Font.BOLD, 35));
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("1"));
            }
        });
        panel2.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(175, 1, 75, 75);
        button2.setFocusable(false);
        button2.setFont(new Font("Consolas", Font.BOLD, 35));
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("2"));
            }
        });
        panel2.add(button2);
        
        JButton button3 = new JButton("3");
        button3.setBounds(262, 1, 75, 75);
        button3.setFocusable(false);
        button3.setFont(new Font("Consolas", Font.BOLD, 35));
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("3"));
            }
        });
        panel2.add(button3);

        JButton button4 = new JButton("4");
        button4.setBounds(2, 87, 75, 75);
        button4.setFocusable(false);
        button4.setFont(new Font("Consolas", Font.BOLD, 35));
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("4"));
            }
        });
        panel2.add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(88, 87, 75, 75);
        button5.setFocusable(false);
        button5.setFont(new Font("Consolas", Font.BOLD, 35));
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("5"));
            }
        });
        panel2.add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(175, 87, 75, 75);
        button6.setFocusable(false);
        button6.setFont(new Font("Consolas", Font.BOLD, 35));
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("6"));
            }
        });
        panel2.add(button6);

        JButton button7 = new JButton("7");
        button7.setBounds(262, 87, 75, 75);
        button7.setFocusable(false);
        button7.setFont(new Font("Consolas", Font.BOLD, 35));
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("7"));
            }
        });
        panel2.add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(2, 173, 75, 75);
        button8.setFocusable(false);
        button8.setFont(new Font("Consolas", Font.BOLD, 35));
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("8"));
            }
        });
        panel2.add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(88, 173, 75, 75);
        button9.setFocusable(false);
        button9.setFont(new Font("Consolas", Font.BOLD, 35));
        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText(textArea.getText().concat("9"));
            }
        });
        panel2.add(button9);


        JButton button10 = new JButton("+");
        button10.setBounds(175, 173, 75, 75);
        button10.setFocusable(false);
        button10.setFont(new Font("Consolas", Font.BOLD, 35));
        button10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num1 = Double.parseDouble(textArea.getText());
                operator = '+';
                textArea.setText("");
            }
        });
        panel2.add(button10);

        JButton button11 = new JButton("-");
        button11.setBounds(262, 173, 75, 75);
        button11.setFocusable(false);
        button11.setFont(new Font("Consolas", Font.BOLD, 35));
        button11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num1 = Double.parseDouble(textArea.getText());
                operator = '-';
                textArea.setText("");
            }
        });
        panel2.add(button11);

        JButton button12 = new JButton("*");
        button12.setBounds(2, 259, 75, 75);
        button12.setFocusable(false);
        button12.setFont(new Font("Consolas", Font.BOLD, 35));
        button12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num1 = Double.parseDouble(textArea.getText());
                operator = '*';
                textArea.setText("");
            }
        });
        panel2.add(button12);

        JButton button13 = new JButton("/");
        button13.setBounds(88, 259, 75, 75);
        button13.setFocusable(false);
        button13.setFont(new Font("Consolas", Font.BOLD, 35));
        button13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num1 = Double.parseDouble(textArea.getText());
                operator = '/';
                textArea.setText("");
            }
        });
        panel2.add(button13);

        // JButton button14 = new JButton("%");
        // JButton button16 = new JButton(".");

        JButton button15 = new JButton("=");
        button15.setBounds(175, 259, 75, 75);
        button15.setFocusable(false);
        button15.setFont(new Font("Consolas", Font.BOLD, 35));
        button15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                num2 = Double.parseDouble(textArea.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        result = 0;
                        break;
                }
                textArea.setText(String.valueOf(result));
            }
        });
        panel2.add(button15);
        
        JButton button17 = new JButton("CLS");
        button17.setBounds(262, 259, 75, 75);
        button17.setFocusable(false);
        button17.setFont(new Font("Consolas", Font.BOLD, 20));
        button17.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                textArea.setText("");
            }
        });
        panel2.add(button17);
        
        // -------/buttons -----------

        add(panel2);

        setVisible(true);
    
    }
    public static void main(String[] args) throws Exception {
            new Main();
    }
}
