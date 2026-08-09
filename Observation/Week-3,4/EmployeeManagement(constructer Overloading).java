package observation;
import java.util.Scanner;
class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employee() {
        name = "Not Assigned";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Available";
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 0.0;
        promotionStatus = "Not Available";
    }

    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Not Promoted";
    }

    Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name              : " + name);
        System.out.println("Employee ID       : " + id);
        System.out.println("Designation       : " + designation);
        System.out.println("Salary            : " + salary);
        System.out.println("Promotion Status  : " + promotionStatus);
        System.out.println();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        Employee employee2 = new Employee(
            "Rahul", 101
        );

        Employee employee3 = new Employee(
            "Priya", 102, "Manager", 65000
        );

        Employee employee4 = new Employee(
            "Arun", 103, "Senior Manager", 85000, "Promoted"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");

        employee1.display();
        employee2.display();
        employee3.display();
        employee4.display();
    }
}
