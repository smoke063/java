package oop_6.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return this.getId();
    }

    public void setTeacherId(Long teacherId) {
        this.setId(teacherId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + this.getId() + '\'' +
                // Можно просто вызвать метод родителя принцип DRY
                super.toString() +
                '}';
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
