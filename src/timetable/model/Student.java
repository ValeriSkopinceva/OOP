package timetable.model;

public class Student extends Person {
    private Group group;
    private int kurs;

    public Student(String firstName, String lastName, int kurs) {
        super(firstName, lastName);
        this.kurs = kurs;
    }

    public Student(String firstName, String lastName, int kurs, Group group) {
        super(firstName, lastName);
        this.kurs = kurs;
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

}
