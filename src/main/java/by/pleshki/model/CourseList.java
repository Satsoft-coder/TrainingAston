package by.pleshki.model;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private static List<Course> courseList=new ArrayList<>();

    public static void addCurseList(Course course) {
        CourseList.courseList.add(course);
    }

    public static List<Course> getCourseList() {
        return courseList;
    }
}
