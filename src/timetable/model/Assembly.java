package timetable.model;

import timetable.service.GroupService;

import java.util.ArrayList;

public class Assembly {
    private ArrayList <Lesson> lessons = new ArrayList<>();

// введите день, группу -> получить расписание для этой группы
// введите день, группу, номер пары -> получить название пару по номеру, (аудиторию и преподавателя)
    Group group = new Group(1,1);
    GroupService groupService = new GroupService();

    public ArrayList<Lesson> scheduleForTheDay(Weekday day, int number, int course){
       // if(groupService.findGroupReturnGroup(number,course) && day = );
        // у каждой группы будет список Lesson
        return null;
    }

    public Lesson
}
