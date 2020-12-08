package timetable.model;


import java.util.LinkedHashSet;
import java.util.Set;

public class Group {
    private Set<Student> students;
    private int number;
    private int course;

    public Group(int number, int course) {
        this.students = new LinkedHashSet<>();
        this.number = number;
        this.course = course;
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public int getNumber() {
        return this.number;
    }

    public int getCourse() {
        return course;
    }

    public int getCourse(int course) {
        return course;
    }

    public String toString() {
        return " номер группы " + this.number + " курс " + this.course;
    }

    public boolean equals(Group group) {
        if (group == this) {
            return true;
        }
        if (group == null || group.getClass() != this.getClass()) {
            return false;
        }

        Group guest = (Group) group;
        return number == guest.number
                && course == guest.course;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
