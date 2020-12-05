package timetable.service;

import timetable.model.Student;

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
            JButton newB = new JButton("ну наконец-то, хоть кнопку научилась делать");  //кто бы научился ее выводить
            newB.setBounds(350, 320, 150, 20);
            frame.add(newB);
        });
        frame.setSize(700, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
