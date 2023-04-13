package employee_app.com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private int currentIndex = 0;
    private Employee[] employees = new Employee[100];

    // Create constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Create methods
    public void addEmployee(Employee employee) {

        employees[currentIndex++] = employee;
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {

        int employeesWorked = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                String worked = employees[i].work();
                if (worked.contains("worked")) {
                    employeesWorked++;
                }
            }
        }
        return employeesWorked;
    }
    public double computeDepartmentMonthlyTotalCompensation() {
        // Compute total monthly compensation of all
        // employees in that department
        double totalCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            double monthlyCompensation = employees[i].computeMonthlyCompensation();
            totalCompensation += monthlyCompensation;
        }
        return totalCompensation;
    }

    //--generate Getters and Setters
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

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

    public int getCurrentIndex() {
        return currentIndex;
    }
}
