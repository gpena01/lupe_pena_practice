package employee_app.com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Employee> employees = new ArrayList<>();

    // Create constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Create methods
    public void addEmployee(Employee employee) {

        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {

        int employeesWorked = 0;
        for (Employee employee : employees) {
            if (employee.work().contains("worked")) {
                    employeesWorked++;
            }
        }
        return employeesWorked;
    }
    public double computeDepartmentMonthlyTotalCompensation() {
        // Compute total monthly compensation of all
        // employees in that department
        double totalCompensation = 0.0;
        for (Employee employee : employees) {
            double monthlyCompensation = employee.computeMonthlyCompensation();
            totalCompensation += monthlyCompensation;
        }
        return totalCompensation;
    }

    //--generate Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
