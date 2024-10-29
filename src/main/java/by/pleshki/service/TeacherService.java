package by.pleshki.service;

import by.pleshki.model.*;

import java.util.List;

public class TeacherService {
    public static void addCourse(Teacher teacher, String name) {
        Course course = new Course(name,teacher);
        teacher.addCourse(course);
        CourseList.addCurseList(course);
    }

    public static List<Course> getCourses (Teacher teacher){
        return teacher.getCourseList();
    }

    public static List<Student> getStudentOnCorse(Course course) {
        return course.getStudents();
    }

    public static void setRatingOnStudent(Teacher teacher,Course course, Student student, int i) {
        TestResult testResult=new TestResult(student,course,teacher,i);
        Arhive.addArhive(testResult);
    }

    public void giveARating(Student student){

    }
}
