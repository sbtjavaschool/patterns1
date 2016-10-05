package ru.sbt;

public class SalaryCalculatorImpl implements SalaryCalculator {
    private final double bonusCoefficient;
    private final double fixedBonus;
    private final EmployeeService employeeService;

    public SalaryCalculatorImpl(double bonusCoefficient, double fixedBonus, EmployeeService employeeService) {
        this.bonusCoefficient = bonusCoefficient;
        this.fixedBonus = fixedBonus;
        this.employeeService = employeeService;
    }

    @Override
    public double calcSalary(Person person, int month) {
        double based = person.getGrade() * 1000;
        if (month % 3 == 0) {
            based *= bonusCoefficient;
        }
        based += fixedBonus;

        int workedDay = employeeService.getWorkedDay(person, month);
        int allDay = employeeService.getWorkedDay(month);
        double percent = 1.0 * workedDay / allDay;

        return based * percent;
    }
}