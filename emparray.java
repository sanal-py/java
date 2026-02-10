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
public static void main(String []args)
{
    int i ,n=3;
    int No;
    Employee emp[]=new Employee[n];
    for (i=0;i<n;i++)
    {
        emp[i]=new Employee();
        emp[i].get();

    }
    
    System.out.println("Search");
    while (true)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter Id:");
    No=Integer.parseInt(sc.nextLine());
    for(i=0;i<n;i++){
        if(emp[i].id == No)
            {
                emp[i].display();
                break;

        }
    }
    }
}
}

