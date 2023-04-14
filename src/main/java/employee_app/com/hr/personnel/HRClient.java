package employee_app.com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class HRClient {
    public static void main(String[] args) {


        Employee employee3 = new SalariedEmployee("Lily",
                LocalDate.of(2007, 9, 24),
                10000);

        Employee employee4 = new SalariedEmployee("Jack",
                LocalDate.of(2021, 9, 12),
                8000);

        Employee employee5 = new HourlyEmployee("Sally",
                LocalDate.of(2019, 11, 12),
                160,
                100);
        System.out.println();

        Employee employee6 = new CommissionedEmployee("Java",
                LocalDate.of(2023, 04, 12),
                .23, new ArrayList<>(Arrays.asList(85.0, 100.0, 375.0)));

        System.out.println(employee3.getName() +
                " has been with us for " +
                employee3.computeNumberOfYearsWorkedSinceHired() + " years.");

        System.out.println(employee4.getName() +
                " has been with us for " +
                employee4.computeNumberOfYearsWorkedSinceHired() + " years.");

        System.out.println(employee5.getName() +
                " has been with us for " +
                employee5.computeNumberOfYearsWorkedSinceHired() + " years.");

        System.out.println(employee6.getName() +
                " has been with us for " +
                employee6.computeNumberOfYearsWorkedSinceHired() + " years.");
        System.out.println();

        System.out.println(employee3.getEmployeeInfo());
        System.out.println();
        System.out.println(employee4.getEmployeeInfo());
        System.out.println();
        System.out.println(employee5.getEmployeeInfo());
        System.out.println();
        System.out.println(employee6.getEmployeeInfo());
        System.out.println();

        Department department = new Department("R&D",
                "Remote");
        department.addEmployee(employee3);
        department.addEmployee(employee4);
        department.addEmployee(employee5);
        department.addEmployee(employee6);

        System.out.println("Total number of employees in " + department.getName()
                + ": " + department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
        double totalMonthlyCompensation = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("Total monthly compensation: $" + totalMonthlyCompensation);
    }
}
