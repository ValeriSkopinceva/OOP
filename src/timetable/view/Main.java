package timetable.view;

import timetable.model.Group;
import timetable.model.Student;
import timetable.service.GraphicalInterface;
import timetable.service.GroupService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        GroupService groupService = new GroupService();
        Student student = new Student("Victor", "Petrovich", 4, 8);
        Group group_4_8 = new Group(4, 8);
        GroupService.groups.add(group_4_8);
        GroupService.students.add(student);


        groupService.addStudent(student, 4, 8);
        groupService.enterGroups(GroupService.groups);
        groupService.displayStudentInGroup(GroupService.groups,4,8);


        //Графический интерфейс
         GraphicalInterface.frame();

    }
}
