package head_first.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 30.10.2020
 */
public class SimpleGui2 implements ActionListener {
    JButton button;

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }

    public static void main(String[] args) {
        SimpleGui2 simpleGui2 = new SimpleGui2();
        simpleGui2.go();
    }
}
