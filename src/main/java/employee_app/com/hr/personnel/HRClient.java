package employee_app.com.hr.personnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack",
                LocalDate.of(2021, 11, 11));

        Employee employee2 = new Employee("Lily",
                LocalDate.of(2008, 01, 01));

        System.out.println(employee1.getName() +
                " has been with us for " +
                employee1.computeNumberOfYearsWorkedSinceHired() + " years.");
        System.out.println(employee2.getName() +
                " has been with us for " +
                employee2.computeNumberOfYearsWorkedSinceHired() + " years.");
        System.out.println();

        System.out.println(employee1.getEmployeeInfo());
        System.out.println();
        System.out.println(employee2.getEmployeeInfo());

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

        Department department = new Department("R&D",
                "Remote");
        department.addEmployee(employee3);
        department.addEmployee(employee4);
        department.addEmployee(employee5);

        System.out.println("Total number of employees in " + department.getName()
        + ": " + department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }
}
