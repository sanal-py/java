import java.util.*;
class Employee
{
    int id ;
    String name;
    float salary;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.print("enter ID:");
id=sc.nextInt();
System.out.print("enter name:");
name=sc.next();
System.out.print("enter salary:");
salary=sc.nextFloat();
}
public void display()
{
    System.out.println("My id is:"+id);
    System.out.println("MY name is:"+name);
    System.out.println("My salary is:"+salary);
}
public static void main (String argS[])

{
 Employee e =new Employee();
 e.get();
 e.display();
}
}