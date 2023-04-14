package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private List<Double> monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, ArrayList<Double> monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
    }

    @Override
    public String getEmployeeInfo() {
        return "name: " + getName() + "\n"
                + "hire date: " + getHireDate() + "\n"
                + "commissionRate: " + commissionRate + "\n"
                + "monthlySales: " + computeMonthlyCompensation();
    }

    @Override
    public double computeMonthlyCompensation() {
        double totalCompensation = 0.0;
        for (double eachSale : monthlySales) {
            totalCompensation += (commissionRate * eachSale);
        }
        return totalCompensation;
    }

}
