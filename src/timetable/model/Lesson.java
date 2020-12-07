package timetable.model;

import java.util.*;

import static timetable.model.Weekday.*;

public class Lesson {
    private String nameSubj;
    private int number;
    private ArrayList <Lesson> subjects = new ArrayList<>();
    Map<Weekday, ArrayList<Lesson>> lessonForDay = new HashMap<>();


    public Lesson(String nameSubj, int number) {
        this.nameSubj = nameSubj;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    private void weeklySchedule(){  // заполнение списка предметов и расписания для групп
        //  МОЖНО ЛИ ЭТО ДЕЛАТЬ НЕ ОТ РУКИ?
        String[] subjects = {"History","OOP","Math","English","Web-programming","Matlab","C++","Philosophy",
                "Algebra and analytical geometry","Discrete mathematics"};
        Lesson _1for_1_1 = new Lesson(subjects[0], 1);
        Lesson _3for_1_1 = new Lesson(subjects[5],3);
        Lesson _5for_1_1 = new Lesson(subjects[4],5);
        Lesson _1for_2_1  = new Lesson(subjects[2],1);
        Lesson _2for_2_1 = new Lesson(subjects[3],2);
        Lesson _3for_2_1  = new Lesson(subjects[9],3);
        Lesson _1for_3_1 = new Lesson(subjects[6],4);
        Lesson _4for_3_1 = new Lesson(subjects[8],4);
        Lesson _2for_4_1 = new Lesson(subjects[1],2);
        Lesson  _3for_4_1 = new Lesson(subjects[7],3);
        Lesson _2for_5_1 = new Lesson(subjects[5],2);
        Lesson  _3for_5_1 = new Lesson(subjects[0],3);
        ArrayList<Lesson> lessonForGroup1_1 = new ArrayList<>();
        lessonForGroup1_1.add(_1for_1_1);
        lessonForGroup1_1.add(_3for_1_1);
        lessonForGroup1_1.add(_5for_1_1);
        ArrayList<Lesson> lessonForGroup2_1 = new ArrayList<>();
        lessonForGroup2_1.add(_1for_2_1);
        lessonForGroup2_1.add(_2for_2_1);
        lessonForGroup2_1.add(_3for_2_1);
        ArrayList<Lesson> lessonForGroup3_1 = new ArrayList<>();
        lessonForGroup3_1.add(_1for_3_1);
        lessonForGroup3_1.add(_4for_3_1);
        ArrayList<Lesson> lessonForGroup4_1 = new ArrayList<>();
        lessonForGroup4_1.add(_2for_4_1);
        lessonForGroup4_1.add(_3for_4_1);
        ArrayList<Lesson> lessonForGroup5_1 = new ArrayList<>();
        lessonForGroup5_1.add(_2for_5_1);
        lessonForGroup5_1.add(_3for_5_1);

        lessonForDay.put(MONDAY, lessonForGroup1_1);
        lessonForDay.put(MONDAY,lessonForGroup2_1);
        lessonForDay.put(MONDAY,lessonForGroup3_1);
        lessonForDay.put(MONDAY,lessonForGroup4_1);
        lessonForDay.put(MONDAY,lessonForGroup5_1);

        lessonForDay.put(TUESDAY, lessonForGroup1_1);
        lessonForDay.put(TUESDAY,lessonForGroup2_1);
        lessonForDay.put(TUESDAY,lessonForGroup3_1);
        lessonForDay.put(TUESDAY,lessonForGroup4_1);
        lessonForDay.put(TUESDAY,lessonForGroup5_1);

        lessonForDay.put(WEDNESDAY, lessonForGroup1_1);
        lessonForDay.put(WEDNESDAY,lessonForGroup2_1);
        lessonForDay.put(WEDNESDAY,lessonForGroup3_1);
        lessonForDay.put(WEDNESDAY,lessonForGroup4_1);
        lessonForDay.put(WEDNESDAY,lessonForGroup5_1);

        lessonForDay.put(THURSDAY, lessonForGroup1_1);
        lessonForDay.put(THURSDAY,lessonForGroup2_1);
        lessonForDay.put(THURSDAY,lessonForGroup3_1);
        lessonForDay.put(THURSDAY,lessonForGroup4_1);
        lessonForDay.put(THURSDAY,lessonForGroup5_1);

        lessonForDay.put(FRIDAY, lessonForGroup1_1);
        lessonForDay.put(FRIDAY,lessonForGroup2_1);
        lessonForDay.put(FRIDAY,lessonForGroup3_1);
        lessonForDay.put(FRIDAY,lessonForGroup4_1);
        lessonForDay.put(FRIDAY,lessonForGroup5_1);
    }


}
