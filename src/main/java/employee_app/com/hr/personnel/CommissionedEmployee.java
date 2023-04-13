package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double[] monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate, double[] monthlySales) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = monthlySales;
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
