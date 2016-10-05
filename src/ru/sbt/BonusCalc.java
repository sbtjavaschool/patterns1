package ru.sbt;

import ru.sbt.impl.GradeCalculator;

public class BonusCalc extends GradeCalculator {
    public BonusCalc(int coefficient) {
        super(coefficient);
    }

    @Override
    public double calcSalary(Person person, int month) {
        double base = super.calcSalary(person, month);
        return base * 1.2;
    }
}
