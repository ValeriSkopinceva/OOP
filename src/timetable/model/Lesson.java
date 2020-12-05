package timetable.model;

public class Lesson {
    private static String subject;
    private static int hourPerWeek;
    private static int number;

    public Lesson(String subject, int hourPerWeek, int number) {
        this.subject = subject;
        this.hourPerWeek = hourPerWeek;
        this.number = number;
    }

    public static String getSubject() {
        return subject;
    }

    public static void setSubject(String subject) {
        Lesson.subject = subject;
    }

    public static int getHourPerWeek() {
        return hourPerWeek;
    }

    public static void setHourPerWeek(int hourPerWeek) {
        Lesson.hourPerWeek = hourPerWeek;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Lesson.number = number;
    }
}
