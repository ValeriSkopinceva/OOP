package timetable.view;

import timetable.model.Assembly;
import timetable.service.GraphicalInterface;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Assembly assembly = new Assembly();
        assembly.scheduleForTheDay("Monday",1,1);
        //Графический интерфейс
        GraphicalInterface graphicalInterface = new GraphicalInterface("Frame");
        graphicalInterface.setVisible(true);
        graphicalInterface.setSize(650,300);
        graphicalInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicalInterface.setResizable(false);
        graphicalInterface.setLocationRelativeTo(null);

    }
}
