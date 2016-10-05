package ru.sbt.impl;

import ru.sbt.EmployeeService;
import ru.sbt.Person;
import ru.sbt.SalaryCalculator;

public class WorkedDayCalculator implements SalaryCalculator {
    private final EmployeeService employeeService;
    private final SalaryCalculator salaryCalculator;

    public WorkedDayCalculator(EmployeeService employeeService, SalaryCalculator salaryCalculator) {
        this.employeeService = employeeService;
        this.salaryCalculator = salaryCalculator;
    }

    @Override
    public double calcSalary(Person person, int month) {
        double base = salaryCalculator.calcSalary(person, month);

        int workedDay = employeeService.getWorkedDay(person, month);
        int allDay = employeeService.getWorkedDay(month);
        double percent = 1.0 * workedDay / allDay;

        return base * percent;

    }
}
