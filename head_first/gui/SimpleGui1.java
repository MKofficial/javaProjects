package head_first.gui;

import javax.swing.*;

/**
 * @author Matthew Kriz
 * @version 1.0.0
 * @since 30.10.2020
 */
public class SimpleGui1 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click me");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jFrame.getContentPane().add(jButton);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }

}
