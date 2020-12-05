package timetable.service;

import timetable.model.Student;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalInterface extends JFrame {
    JButton b;
    JTextField t;

    public void frame() {
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
    public void speak(){
        System.out.println("Чтобы добавить студента, нажмите на кнопку '1'");//готовые методы из GroupService
        System.out.println("Чтобы удалить студента, нажмите на кнопку '2'");//готовые методы из GroupService
        System.out.println("Чтобы , нажмите на кнопку '3'");//получить пару(и номер аудитории, если получится) для определенного дня,номера пары и группы/курса

        System.out.println("Чтобы вывести расписание на день для группы, введите день и группу");//здесь нужно будет
        //создать диалоговое окно, через if(проверка на совпадение дня && проверка на совпадение курса/группы)
    }
}
