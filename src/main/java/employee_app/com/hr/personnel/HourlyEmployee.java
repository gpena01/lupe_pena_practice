package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // create fields
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    // create constructor
    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        return "name: " + getName() + "\n"
                + "hire date: " + getHireDate() + "\n"
                + "hourlyRate: " + hourlyRate + "\n"
                + "hoursWorkedPerMonth: " + hoursWorkedPerMonth;
    }

    // create method
    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * hoursWorkedPerMonth;
    }

    // create getters and setters
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
