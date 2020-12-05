package timetable.view;

import timetable.model.Student;
import timetable.service.GroupService;

import java.util.ArrayList;
import java.util.Scanner;

class Group {
    private ArrayList<Group> groups;
    Scanner scan = new Scanner(System.in);

    public Group(int course, int group) {
    }

    public void addGroup() { //добавление группы(спрашивая у пользователя)
        System.out.println("Введите номер курса");
        int course = scan.nextInt();
        System.out.println("Введите номер группы");
        int group = scan.nextInt();
        Group gr = new Group(course, group);
        groups.add(gr);
    }

    public void addStudentAsDesired() {  //добавление студентов (спрашивая у пользователя) view
        System.out.println("Введите имя, фамилию,группу и курс студента");
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        int group = scan.nextInt();
        int course = scan.nextInt();
        Student student = new Student(name, lastName, course, group);
        //addStudent(student, course, group);
    }
}
