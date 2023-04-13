package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // create a monthlySalary field
    private double monthlySalary;

    // create a constructor
    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    // create a method

    @Override
    public String getEmployeeInfo() {
        return "name: " + getName() + "\n"
                + "hire date: " + getHireDate() + "\n"
                + "monthlySalary: " + monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }
}
