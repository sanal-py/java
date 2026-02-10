class employee
{
    int id ;
    String name;
    float salary;
public void get(){
Scanner s1=new Scanner(system.in);
System.out.print("enter ID:");
ID=sc.nextint();
System.out.print("enter name:");
name=sc.nextLine();
System.out.print("enter salary:");
salary=sc.nextfloat();
}
public void display()
{
    System.out.println("My id is:",+id);
    System.out.println("MY name is:",+name);
    System.out.println("My salary is:",+salary);
}
}