package timetable.model;

public enum Weekday {//и что с этим делать?
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

//    public Weekday toStringForDays() { непонятно зачем нужно
//        return null;
//    }

    public static Weekday search(String day){
        switch (day){
            case "Monday":
                return MONDAY;
            case "Tuesday":
                return TUESDAY;
            case "Wednesday":
                return WEDNESDAY;
            case "Thursday":
                return THURSDAY;
            case "Friday":
                return FRIDAY;
            case "Saturday":
                return SATURDAY;
            case "Sunday":
                return SUNDAY;
        }
        return null;
    }
    public Weekday toDisplayLessonsForDays() {
        if (MONDAY.equals(this)) {
            System.out.println("Monday");
            return MONDAY;
        } else if (TUESDAY.equals(this)) {
            System.out.println(TUESDAY);
            return TUESDAY;
        } else if (WEDNESDAY.equals(this)) {
            System.out.println("Wednesday");
            return WEDNESDAY;
        } else if (THURSDAY.equals(this)) {
            System.out.println("Thursday");
            return THURSDAY;
        } else if (FRIDAY.equals(this)) {
            System.out.println("Friday");
            return FRIDAY;
        } else if (SATURDAY.equals(this)) {
            System.out.println("Saturday");
            return SATURDAY;
        } else if (SUNDAY.equals(this)) {
            System.out.println("Sunday");
            return SUNDAY;
        }

        return null;
    }

}
