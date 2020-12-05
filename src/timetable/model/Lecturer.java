package timetable.model;

public class Lecturer extends Person {
    private static boolean practitioner;
    private static boolean lecturer;

    public Lecturer(String firstName, String lastName, boolean practitioner, boolean lecturer) {
        super(firstName, lastName);
        this.practitioner = practitioner;
        this.lecturer = lecturer;
    }

    public static boolean isPractitioner() {
        return practitioner;
    }

    public static void setPractitioner(boolean practitioner) {
        Lecturer.practitioner = practitioner;
    }

    public static boolean isLecturer() {
        return lecturer;
    }

    public static void setLecturer(boolean lecturer) {
        Lecturer.lecturer = lecturer;
    }
}
