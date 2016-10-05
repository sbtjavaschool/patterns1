package ru.sbt;

public interface EmployeeService {
    int getWorkedDay(Person person, int month);

    int getWorkedDay(int month);
}
