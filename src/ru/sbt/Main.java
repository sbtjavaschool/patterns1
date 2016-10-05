package ru.sbt;

import ru.sbt.impl.FixedBonusCalculator;
import ru.sbt.impl.GradeCalculator;
import ru.sbt.impl.MonthBonusCalculator;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = null;
        SalaryCalculator calculator = new SalaryCalculatorImpl(1.2, 200, employeeService);

        Person person = new Person(12, "Alex");
        calculator.calcSalary(person, 2);

        GradeCalculator gradeCalculator = new GradeCalculator(100);
        SalaryCalculator c1 = new MonthBonusCalculator(1.2, gradeCalculator);
        SalaryCalculator c2 = new FixedBonusCalculator(100, gradeCalculator);

        SalaryCalculator c3 = new FixedBonusCalculator(1000, new MonthBonusCalculator(1.3, gradeCalculator));
        SalaryCalculator c4 = new MonthBonusCalculator(1.2, new FixedBonusCalculator(1.3, gradeCalculator));

        double v = c1.calcSalary(person, 2);
    }
}