package timetable.service;

import timetable.model.Group;
import timetable.model.Student;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.*;

public class GroupService {
    public static ArrayList<Group> groups = new ArrayList<>();
    public static HashSet<Student> students = new HashSet<>();

    public Group findGroup(int number, int course) {  //поиск группы
        for (Group group : groups) {
            if (group.getCourse() == course && group.getNumber() == number) {
                return group;
            }
        }
        return null;
    }

    public void addStudent(Student student, int number, int course) {
        Group group = findGroup(number, course);
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


    public void displayStudentInGroup(ArrayList<Group> groups, int number,int course) {  //вывод студентов в конкретной группе
        if(findGroup(number, course).equals(groups)){
        System.out.println("Группа " + number + course + ":");
        for (int i = 0; i <= groups.size(); i++) {
           System.out.println(groups.get(i).getStudents());
            }
        } else {
            System.out.println("Такой группы нет");
        }
    }
}
