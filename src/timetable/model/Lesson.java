package timetable.model;

import static timetable.model.Weekday.Tuesday;

public class Lesson {
    private String subject;
    private int hourPerWeek;
    private int number;
    private enum Weekday {Monday,
            Tuesday,
            Wednesday,
            Thursday,
            Friday,
            Saturday,
            Sunday;
    }


    public Lesson(String subject, int hourPerWeek, int number) {
        this.subject = subject;
        this.hourPerWeek = hourPerWeek;
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getHourPerWeek() {
        return hourPerWeek;
    }

    public void setHourPerWeek(int hourPerWeek) {
        this.hourPerWeek = hourPerWeek;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Weekday toStringForDays() {
        if (Weekday.Monday.equals(this)) {
            System.out.println("Monday");
            return Weekday.Monday;
        } else if (Tuesday.equals(this)) {
            System.out.println(Tuesday);
            return Weekday.Tuesday;
        } else if (Weekday.Wednesday.equals(this)) {
            System.out.println("Wednesday");
            return Weekday.Wednesday;
        } else if (Weekday.Thursday.equals(this)) {
            System.out.println("Thursday");
            return Weekday.Thursday;
        } else if (Weekday.Friday.equals(this)) {
            System.out.println("Friday");
            return Weekday.Friday;
        } else if (Weekday.Saturday.equals(this)) {
            System.out.println("Saturday");
            return Weekday.Saturday;
        } else if (Weekday.Sunday.equals(this)) {
            System.out.println("Sunday");
            return Weekday.Sunday;
        }

        return null;
    }
}
