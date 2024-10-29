package by.pleshki.model;

import java.util.List;

public class Student {
    private final String name;
    private final String surName;

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Студент " + name + " " + surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

}
