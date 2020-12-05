package timetable.service;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalInterface extends JFrame {
    public static void frame() {
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Введите ");
        b.setBounds(250, 220, 150, 20);
        frame.add(b);
        GraphicalInterface actionListener = new GraphicalInterface();
        b.addActionListener((listener) -> {
            //обработчик события
        });//
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
