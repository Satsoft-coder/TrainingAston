package by.pleshki.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String name;
    private final String surName;
    private List<Course> courseList=new ArrayList<>();

    public Teacher(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Преподаватель: " + name + " " + surName;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public String getSurName() {
        return surName;
    }
}
