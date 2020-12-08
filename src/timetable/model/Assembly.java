package timetable.model;

import timetable.service.GroupService;
import java.util.ArrayList;


public class Assembly {
    private ArrayList<Lesson> lessons = new ArrayList<>();

// введите день, группу -> получить расписание для этой группы
// введите день, группу, номер пары -> получить название пары по номеру,
    GroupService groupService = new GroupService();


    public ArrayList<Lesson> scheduleForTheDay(String day, int number, int course) { //  расписание на день, пока получает расписание на день сразу для нескольких групп
        System.out.println(LessonService.lessonForDay.get(Weekday.search(day)));// не работает
        return LessonService.lessonForDay.get(Weekday.search(day));
    }

    public Lesson getLesson(String day, int number, int course, int numberOfLesson) {
        return scheduleForTheDay(day, number, course).get(numberOfLesson);
    }

   }
