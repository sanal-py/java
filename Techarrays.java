
//c0-3
/*create class employee(emp id,salary ,address) and create constructor to initialise the variables create another class teacher which inherits all the properties of class employee.Add data members(department,subject).Display all the details using array of N teachers*/
import java.util.*;

class employee {
    int empid;
    String name;
    float salary;
    String address;

    employee() {

    }

    employee(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends employee {
    String dept, sub;

    Teacher(int empid, String name, float salary, String address, String dept, String sub) {
        super(empid, name, salary, address);
        this.dept = dept;
        this.sub = sub;
    }

    public void display() {
        System.out.println("\n Teacher id\n" + empid);
        System.out.println("\n Teacher name\n" + name);
        System.out.println("\n Teacher salary\n" + salary);
        System.out.println("\n Teacher address\n" + address);
        System.out.println("\n Teacher department\n" + dept);
        System.out.println("\n Teacher subject\n" + sub);
    }
}

public class Techarrays {
    public static void main(String args[]) {
        System.out.println("enter the number of teachers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the teachers detail one by one");
        Teacher teacher[] = new Teacher[n];
        Scanner sc1 = new Scanner(System.in);
        int id;
        String na;
        float s;
        String a;
        String d, sa;

        for (int i = 0; i < n; i++) {
            System.out.println("enter the id of teachers");
            id = sc1.nextInt();
            System.out.println("enter the name of teachers");
            na = sc1.next();
            System.out.println("enter the name of salary");
            s = sc1.nextFloat();
            System.out.println("enter the name of address");
            a = sc1.next();
            System.out.println("enter the name of department");
            d = sc1.next();
            System.out.println("enter the name of subject");
            sa = sc1.next();
            teacher[i] = new Teacher(id, na, s, a, d, sa);

        }

        System.out.println("teacher detail");

        for (int i = 0; i < n; i++) {
            teacher[i].display();

        }
    }
}