package timetable.view;

import timetable.model.Student;
import timetable.service.GroupService;
import java.util.ArrayList;
import java.util.Scanner;


class Group {
    private ArrayList<Group> groups;
    private Scanner scan = new Scanner(System.in);
    private GroupService groupService = new GroupService();

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
        GroupService groupService = new GroupService();
        groupService.addStudent(student, course, group);
    }

    public void enterGroups(ArrayList<timetable.model.Group> groups) { //  вывод списка групп
        for (timetable.model.Group group : groups) {
            System.out.println(group);
        }
    }

    public void displayStudentInGroup(ArrayList<timetable.model.Group> groups, int number, int course) {  //вывод студентов в конкретной группе
        if (groupService.findGroupReturnBool(number, course)) {
            ArrayList<Student> studentArrayList = new ArrayList<>(groups.get(number).getStudents());
            for (Student student : groupService.students) {
                System.out.println("Имя студента: " + student.getFirstName() + ", фамилия студента: " + student.getLastName()
                        + ", курс: " + course + ", группа " + number); // да за что???
                //+ student.getCourse() + ... student.getGroup() <- нужно, чтобы работало так
            }
        } else
            System.out.println("Нет такой группы");
    }
}
