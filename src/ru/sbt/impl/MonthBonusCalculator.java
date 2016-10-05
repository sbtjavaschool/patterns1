package ru.sbt.impl;

import ru.sbt.Person;
import ru.sbt.SalaryCalculator;

public class MonthBonusCalculator implements SalaryCalculator {
    private final double bonusCoefficient;
    private final SalaryCalculator salaryCalculator;

    public MonthBonusCalculator(double bonusCoefficient, SalaryCalculator salaryCalculator) {
        this.bonusCoefficient = bonusCoefficient;
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public double calcSalary(Person person, int month) {
        double result = salaryCalculator.calcSalary(person, month);

        if (month % 3 == 0) {
            result *= bonusCoefficient;
        }
        return result;
    }
}
