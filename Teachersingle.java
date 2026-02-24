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

public class Teachersingle {
    public static void main(String args[]) {

        System.out.println("enter the teachers detail");

        Scanner sc1 = new Scanner(System.in);
        int id;
        String na;
        float s;
        String a;
        String d, sa;

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
        Teacher t1 = new Teacher(id, na, s, a, d, sa);

        System.out.println("teacher detail");

        t1.display();

    }
}
