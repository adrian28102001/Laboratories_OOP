package lab9;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField textField1;
    private JTextField textField2;

    private JButton computeButton;
    private JButton clearButton;

    private JLabel firstInput;
    private JLabel secondInput;
    private JLabel output;
    private JLabel space;

    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame("Lab9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close the program
        frame.setSize(420, 550);                  //Set size to the frame
        frame.setLayout(null);

        textField1 = new JTextField();                  //Field1
        firstInput = new JLabel("First input");     //Label1

        textField2 = new JTextField();                   //Field2
        secondInput = new JLabel("Second input");    //Label2

        output = new JLabel("Output");               //Label output
        output.setPreferredSize(new Dimension(550,10));
        space = new JLabel(" ");                     //Label space so buttons go down

        textField1.setBounds(50, 25, 300, 35);
        textField2.setBounds(50, 60, 300, 35);


        //Buttons
        computeButton = new JButton("=");
        clearButton = new JButton("C");

        //Buttons properties
        computeButton.setFocusable(false);
        clearButton.setFocusable(false);

        //Panel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        //Adding to panel
        panel.add(firstInput);
        panel.add(textField1);
        panel.add(secondInput);
        panel.add(textField2);
        panel.add(output);
        panel.add(space);
        panel.add(computeButton);
        panel.add(clearButton);

        //adding to frame
        frame.add(panel);

        //set frame visible
        frame.setVisible(true);

        //actions
        computeButton.addActionListener(e -> {
            String stringInput1 = textField1.getText();
            String stringInput2 = textField2.getText();

            try {
                char first = stringInput1.charAt(0);
                char second = stringInput2.charAt(0);

                double input1 = Double.parseDouble(stringInput1);
                double input2 = Double.parseDouble(stringInput2);

                double doubleResult;
                int intResult;

                if (input2 == 0) {
                    intResult = (int) input1 / 0;
                    output.setText(input1 + " / " + input2 + " = " + intResult);
                } else if (input2 == 13) {
                    throw new UnluckyException();
                } else {
                    doubleResult = input1 / input2;
                    output.setText(input1 + " / " + input2 + " = " + doubleResult);
                }

            } catch (StringIndexOutOfBoundsException a) {
                output.setText("Warning: Missing Values!");
            } catch (ArithmeticException b) {
                output.setText("Warning: Division by 0 is impossible!");
            } catch (NumberFormatException c) {
                output.setText("Warning: Working with numbers only!");
            } catch (UnluckyException d) {
                output.setText("Ups, you got an unlucky number for the divider!");
            }
            textField1.setText("");
            textField2.setText("");
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                output.setText("Output: ");
            }
        });
    }

}

