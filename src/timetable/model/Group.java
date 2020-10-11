package timetable.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private ArrayList<Student> list;
    private int number;

    public Group(int number) {
        this.list = new ArrayList<>();
        this.number = number;
    }

    public void addStudent(Student student) {
        if (!list.contains(student)) { // проверка существует ли этот студент в группе
            list.add(student);
        }
    }

    public void removeStudent(Student student) {
        list.remove(student);
    }

    public ArrayList<Student> getList() {
        return this.list;
    }

    public int getNumber() {
        return this.number;
    }
}
