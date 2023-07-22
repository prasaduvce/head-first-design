package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    Frame frame;

    public static void main(String[] args) {
        System.out.println("Swing Observer example program");
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        frame = new JFrame("Hello World Java Swing");

        frame.setMinimumSize(new Dimension(800, 600));
        frame.setBackground(Color.BLUE);
        frame.setTitle("First JFrame");

        JButton button = new JButton("Should I Do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it, there is no problem!");
        }
    }
}
