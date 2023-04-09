package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    // create a constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // create a method
    public int computeNumberOfYearsWorkedSinceHired() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }

    public String getEmployeeInfo() {
        return "name = " + name + "\n" + "hireDate = " + hireDate;
    }

    public String work() {
        return name + " worked.";
    }

    // generate getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
