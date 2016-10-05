package ru.sbt;

public class Person {
    private final int grade;
    private final String name;

    public Person(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
