package oop_4.view;

import oop_4.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher> {

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
            logger.info(user.toString());
        }
    }
}
