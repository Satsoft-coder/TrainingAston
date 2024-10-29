package by.pleshki.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String name;
    private Teacher creator;
    private List<Student> students=new ArrayList<>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.creator=teacher;
    }

    public Course(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }


    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Факультатив: \'" + name+"\'";
//        return "Факультатив: \'" + name + '\''+ creator +
//                ", студенты: " + students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
