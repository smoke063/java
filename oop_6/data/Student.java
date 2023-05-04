package oop_6.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        // можно переиспользовать конструкторы текущего класса.
        this(firstName, secondName, patronymic, dateOfBirth);
        this.setId(studentId);
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentId='" + this.getId() + '\'' +
                // Можно просто вызвать метод родителя принцип DRY
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getId().compareTo(o.getId());
    }
}
