package timetable.model;

import timetable.service.GroupService;

import java.util.ArrayList;

import static timetable.model.Weekday.search;


public class Assembly {
    private ArrayList<Lesson> lessons = new ArrayList<>();

// введите день, группу -> получить расписание для этой группы
// введите день, группу, номер пары -> получить название пары по номеру, (аудиторию и преподавателя)
    Group group = new Group(1, 1);
    GroupService groupService = new GroupService();


    public ArrayList<Lesson> scheduleForTheDay(String day, int number, int course) {
        if (groupService.findGroupReturnBool(number, course));
        search(day).hashCode();

        return null;
    }

    public Lesson getLesson(String day, int number, int course, int numberOfLesson) {
        return scheduleForTheDay(day, number, course).get(numberOfLesson);
    }
}
