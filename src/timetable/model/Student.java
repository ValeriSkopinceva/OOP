package timetable.model;

import java.util.Objects;

public class Student extends Person {
    private Group group;
    private int course;

    public Student(String firstName, String lastName, int course, int i) {
        super(firstName, lastName);
        this.course = this.course;
    }

    public Student(String firstName, String lastName, int course, Group group) {
        super(firstName, lastName);
        this.course = course;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}
