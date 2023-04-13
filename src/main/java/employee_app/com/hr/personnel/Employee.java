package employee_app.com.hr.personnel;

import java.time.LocalDate;
// convert Employee class into an abstract class
public abstract class Employee {
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

    public abstract String getEmployeeInfo();

    public String work() {
        return name + " worked.";
    }
    // convert computeMonthlyCompensation() to abstract method
    public abstract double computeMonthlyCompensation();

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
