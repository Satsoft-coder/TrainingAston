package by.pleshki.service;

import by.pleshki.model.Course;
import by.pleshki.model.Student;

public class StudentService {

    public static void signUpForCourses(Course course, Student student) {
        course.addStudent(student);
    }

}
