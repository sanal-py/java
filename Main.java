import java.util.Scanner;

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void displayBank() {
        System.out.println("Bank Name: " + name);
    }
}

class Employee extends Bank {
    int empId;
    String empName;
    float empSalary;

    Employee(String bankName, int empId, String empName, float empSalary) {
        super(bankName);
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        float empSalary = sc.nextFloat();

        Employee emp = new Employee(bankName, empId, empName, empSalary);

        System.out.println("\n Employee Details");
        emp.displayBank();
        emp.displayEmployee();

        sc.close();
    }
}