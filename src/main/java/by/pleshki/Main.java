package by.pleshki;

import by.pleshki.model.*;
import by.pleshki.service.StudentService;
import by.pleshki.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Dmitry", "Ryabov");
        Teacher teacher2 = new Teacher("Ivan", "Urgant");

        Student student1 = new Student("Evgen", "Onegin");
        Student student2 = new Student("Ostap", "Bender");
        Student student3 = new Student("Kot", "Matroskin");

        //преподаватели создают курсы
//        Course course1 = addCourse(teacher1, "Alchemy");
//        Course course2 = addCourse(teacher1, "Esoteric");

        TeacherService.addCourse(teacher1, "Alchemy");
        TeacherService.addCourse(teacher1, "Esoteric");
        TeacherService.addCourse(teacher1, "Flat Earth");
        TeacherService.addCourse(teacher2, "Biology");

        //получаем список курсов
        List<Course> courseList=CourseList.getCourseList();

        //студенты записываются на курсы
        StudentService.signUpForCourses(courseList.get(0),student1);
        StudentService.signUpForCourses(courseList.get(0),student2);
        StudentService.signUpForCourses(courseList.get(0),student3);
        StudentService.signUpForCourses(courseList.get(1),student1);
        StudentService.signUpForCourses(courseList.get(1),student2);
        StudentService.signUpForCourses(courseList.get(2),student3);
        StudentService.signUpForCourses(courseList.get(3),student1);
        StudentService.signUpForCourses(courseList.get(3),student2);

        //получаем список курсов у преподавателя
        List<Course>teacherCourseList=TeacherService.getCourses(teacher1);
        System.out.println(teacherCourseList);

        //получаем список студентов на конкретном курсе
        List<Student>studentList=TeacherService.getStudentOnCorse(teacherCourseList.get(0));
        System.out.println(studentList);

        //выставляем оценку и архивим
        TeacherService.setRatingOnStudent(teacher1,teacherCourseList.get(0),studentList.get(0),5);
        TeacherService.setRatingOnStudent(teacher1,teacherCourseList.get(0),studentList.get(1),3);
        TeacherService.setRatingOnStudent(teacher1,teacherCourseList.get(0),studentList.get(2),4);


        System.out.println(Arhive.getTestResults());

    }
}