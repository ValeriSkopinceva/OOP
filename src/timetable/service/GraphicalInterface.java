package timetable.service;

import timetable.model.Student;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalInterface extends JFrame {
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3;
    String name, surname;
    int course, group;
    eHandler handler = new eHandler();

    public GraphicalInterface(String title){
        super(title);
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Чтобы добавить студента, нажмите на кнопку '1' (Введите имя, фамилию, курс и номер группы");

        b1 = new JButton("1");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(5);
        t4 = new JTextField(5);
        JLabel l2 = new JLabel("Чтобы удалить студента, нажмите на кнопку '2'       ");
        b2 = new JButton("2");
        JLabel l3 = new JLabel("Чтобы ..., нажмите на кнопку '3'        ");
        b3 = new JButton("3");
        add(l1);
        add(b1);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(l2);
        add(b2);
        add(l3);
        add(b3);
        b1.addActionListener(handler);
    }

    public void frame(){
        GraphicalInterface graphicalInterface = new GraphicalInterface("Frame");
        graphicalInterface.setVisible(true);
        graphicalInterface.setSize(200,100);
        graphicalInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicalInterface.setResizable(false);
        graphicalInterface.setLocationRelativeTo(null);
    }

    public class eHandler implements ActionListener{
        GroupService groupService = new GroupService();

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == b1){
                name = t1.getText();
                surname = t2.getText();
                course = Integer.parseInt(t3.getText());
                group = Integer.parseInt(t4.getText());
                Student s = new Student(name,surname,course,group);
                groupService.addStudent(s,group,course);

            }

//            if(event.getSource() == b2){
//
//                groupService.removeStudent();
//            }
        }

    }
}
