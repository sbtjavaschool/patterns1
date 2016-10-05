package ru.sbt;

import ru.sbt.impl.GradeCalculator;
import ru.sbt.impl.MonthBonusCalculator;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = null;
        SalaryCalculator calculator = new SalaryCalculatorImpl(1.2, 200, employeeService);

        Person person = new Person(12, "Alex");
        calculator.calcSalary(person, 2);


        SalaryCalculator salaryCalculator = new MonthBonusCalculator(1.2, new GradeCalculator(1000));
        double v = salaryCalculator.calcSalary(person, 2);
    }
}
