package timetable.view;

import timetable.model.Group;
import timetable.model.Student;
import timetable.service.GraphicalInterface;
import timetable.service.GroupService;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Графический интерфейс
        GraphicalInterface graphicalInterface = new GraphicalInterface("Frame");
        graphicalInterface.setVisible(true);
        graphicalInterface.setSize(700,300);
        graphicalInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicalInterface.setResizable(false);
        graphicalInterface.setLocationRelativeTo(null);

    }
}
