package timetable.model;

public class Lecturer extends Person {
    private  boolean practitioner;
    private  boolean lecturer;

    public Lecturer(String firstName, String lastName, boolean practitioner, boolean lecturer) {
        super(firstName, lastName);
        this.practitioner = practitioner;
        this.lecturer = lecturer;
    }

    public boolean isPractitioner() {
        return practitioner;
    }

    public void setPractitioner(boolean practitioner) {
        this.practitioner = practitioner;
    }

    public boolean isLecturer() {
        return lecturer;
    }

    public void setLecturer(boolean lecturer) {
        this.lecturer = lecturer;
    }
}
