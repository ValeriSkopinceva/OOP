package timetable.service;

import timetable.model.Group;
import timetable.model.Student;

import java.util.Set;

import java.util.*;

public class GroupService {
    public static ArrayList<Group> groups = new ArrayList<>();
    public static HashSet<Student> students = new HashSet<>();

    public Group findGroupReturnGroup(int number, int course) {  //поиск группы
        for (Group group : groups) {
            if (group.getCourse() == course && group.getNumber() == number) {
                return group;
            }
        }
        return null;
    }

    public boolean findGroupReturnBool(int number, int course) {  //поиск группы
        for (Group group : groups) {
            if (group.getCourse() == course && group.getNumber() == number) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student, int number, int course) {
        Group group = findGroupReturnGroup(number, course);
        if (group != null) {
            group.getStudents().add(student);
        }
    }


    public void removeStudent(Set<Student> students, Student studentToRemove) {
        students.remove(studentToRemove);
    }

    public void enterGroups(ArrayList<Group> groups) { //  вывод списка групп
        for (Group group : groups) {
            System.out.println(group);
        }
    }

    public void displayStudentInGroup(ArrayList<Group> groups, int number, int course) {  //вывод студентов в конкретной группе УРАААААААААААААА
        if (findGroupReturnBool(number, course)) {  //проверить существование групп с таким номером и курсом (findGroup)
            // черт бы побрал этот вывод объектов
            ArrayList<Student> studentArrayList = new ArrayList<>(groups.get(number).getStudents());
            for (Student student : students) {
                System.out.println("Имя студента: " + student.getFirstName() + ", фамилия студента: " + student.getLastName()
                        +", курс: " +  course + ", группа " + number); // да за что???
            //+ student.getCourse() + ... student.getGroup() <- нужно, чтобы работало так
            }
        } else
            System.out.println("Нет такой группы");
    }

    private void zapol(){
        GroupService groupService = new GroupService();
        Student student = new Student("Victor", "Petrovich", 4, 8);
        Student student1 = new Student("gfgff", "ggghgh", 1, 1);
        students.add(student);
        students.add(student1);

        Group group_1_1 = new Group(1, 1);
        Group group_2_1 = new Group(2, 1);
        Group group_3_1 = new Group(3, 1);
        Group group_4_1 = new Group(4, 1);
        Group group_5_1 = new Group(5, 1);
        groups.add(group_1_1);
        groups.add(group_2_1);
        groups.add(group_3_1);
        groups.add(group_4_1);
        groups.add(group_5_1);




        groupService.addStudent(student, 4, 8);
        groupService.enterGroups(GroupService.groups);
        groupService.displayStudentInGroup(GroupService.groups, 1, 1);


    }
}
