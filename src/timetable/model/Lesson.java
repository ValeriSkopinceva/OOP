package timetable.model;

public class Lesson {
    private String nameSubj;
    private int number;


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

    public String getNameSubj() {
        return nameSubj;
    }

    public void setNameSubj(String nameSubj) {
        this.nameSubj = nameSubj;
    }
}
