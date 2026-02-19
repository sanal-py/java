import java.util.*;
class shape
{
    void calculatearea(float side)
    {
     System.out.println("area of square :"+side*side);
    }
     void calculatearea(int breadth ,int length)
     {
      System.out.println("area of rectangle :"+length*breadth);
     }
     void calculatearea(double radius)
     {
        double area=(3.14*radius);
      System.out.println("area of circle :"+area);   
     }
 public static void main (String argS[])
 {
 shape s=new shape();
 Scanner sc=new Scanner(System.in);
 
 System.out.println("enter the side");
 float side=sc.nextFloat();
s.calculatearea(side);

System.out.println("enter the breadth and length");
int length=sc.nextInt();
int breadth=sc.nextInt();
s.calculatearea(breadth,length);

System.out.println("enter the radius");
double radius=sc.nextDouble();
s.calculatearea(radius);
 }
}