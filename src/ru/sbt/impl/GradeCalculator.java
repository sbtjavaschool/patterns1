package ru.sbt.impl;

import ru.sbt.Person;
import ru.sbt.SalaryCalculator;

public class GradeCalculator  implements SalaryCalculator{
    private final int coefficient;

    public GradeCalculator(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double calcSalary(Person person, int month) {
        return person.getGrade() * coefficient;
    }
}
