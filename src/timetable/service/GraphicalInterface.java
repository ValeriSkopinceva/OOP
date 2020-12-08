package timetable.service;

import org.w3c.dom.ls.LSOutput;
import timetable.model.Assembly;
import timetable.model.Student;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalInterface extends JFrame {
    private JButton b1, b2, b3, b4;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
    private JLabel l1, l2, l3, l4, l5;
    private String arr[];
    private String name, surname, a;
    private int course, group;
    private eHandler handler = new eHandler();

    public GraphicalInterface(String title) {
        super(title);
        setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Чтобы добавить студента, нажмите на кнопку '1' (Введите имя, фамилию, курс и номер группы");
        b1 = new JButton("1");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(5);
        t4 = new JTextField(5);
        JLabel l2 = new JLabel("Чтобы удалить студента, нажмите на кнопку '2' (Введите имя, фамилию и группу)  ");
        t5 = new JTextField(20);
        t6 = new JTextField(20);
        t13 = new JTextField(5);
        b2 = new JButton("2");
        JLabel l3 = new JLabel("Чтобы получить расписание на день, нажмите на кнопку '3' (Введите день, группу и курс)                ");
        t7 = new JTextField(5);
        t8 = new JTextField(5);
        t9 = new JTextField(5);
        b3 = new JButton("3");
        JLabel l7 = new JLabel("Чтобы получить пару, нажмите '4' (введите ее номер, день недели, курс и номер группы)              ");
        b4 = new JButton("4");
        t10 = new JTextField(5);
        t11 = new JTextField(5);
        t12 = new JTextField(5);
        add(l1);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b1);
        add(l2);
        add(t5);
        add(t6);
        add(t13);
        add(b2);
        add(l3);
        add(t7);
        add(t8);
        add(t9);
        add(b3);
        add(l7);
        add(t10);
        add(t11);
        add(t12);
        add(b4);

        b1.addActionListener(handler);
        b2.addActionListener(handler);
    }

    public void frame() {
        GraphicalInterface graphicalInterface = new GraphicalInterface("Frame");
        graphicalInterface.setVisible(true);
        graphicalInterface.setSize(200, 100);
        graphicalInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicalInterface.setResizable(false);
        graphicalInterface.setLocationRelativeTo(null);
    }

    public class eHandler implements ActionListener {
        GroupService groupService = new GroupService();

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == b1) {
                name = t1.getText();
                surname = t2.getText();
                course = Integer.parseInt(t3.getText());
                group = Integer.parseInt(t4.getText());
                Student s = new Student(name, surname, course, group);
                groupService.addStudent(s, group, course);
                for (Student student : GroupService.students
                ) {
                    a = student.getFirstName();
                    l5.setText(a);
                }
            }

            if (event.getSource() == b2) {
                name = t5.getText();
                surname = t6.getText();
                group = Integer.parseInt(t13.getText());


                for (Student student : GroupService.students) {
                    if (student.getFirstName().equals(name) && student.getLastName().equals(surname)) {
                        groupService.removeStudent(GroupService.students, student);
                    }
                }

                for (Student student : GroupService.students) {
                    System.out.println(student);
                }
            }

            if (event.getSource() == b3) {
                Assembly assembly = new Assembly();
                JLabel j1 = new JLabel(assembly.scheduleForTheDay().get(String.valueOf(arr)));  // доделать метод в Assembly
                String day = t7.getText();
                group = Integer.parseInt(t8.getText());
                course = Integer.parseInt(t9.getText());
                assembly.scheduleForTheDay(day,group,course);

            }

            if (event.getSource() == b4){
                Assembly assembly = new Assembly();
                JLabel j1 = new JLabel(assembly.scheduleForTheDay().get(String.valueOf(arr)));
                String day = t7.getText();
                group = Integer.parseInt(t10.getText());
                course = Integer.parseInt(t11.getText());
                int number = Integer.parseInt(t12.getText());
                assembly.getLesson(day,group,course,);
            }
        }
    }
}
