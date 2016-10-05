package ru.sbt.impl;

import ru.sbt.Person;
import ru.sbt.SalaryCalculator;

public class FixedBonusCalculator implements SalaryCalculator {
    private final double fixedBonus;
    private final SalaryCalculator salaryCalculator;

    public FixedBonusCalculator(double fixedBonus, SalaryCalculator salaryCalculator) {
        this.fixedBonus = fixedBonus;
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public double calcSalary(Person person, int month) {
        return salaryCalculator.calcSalary(person, month) + fixedBonus;
    }
}
