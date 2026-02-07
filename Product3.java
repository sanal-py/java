class Product
{
    String name;
    float price;

    void input(String n1, float m1)
    {
        name = n1;
        price = m1;
    }

    void show()
    {
        System.out.println("Name of the product : " + name);
        System.out.println("Price of the product: " + price);
        System.out.println();
    }
}

class Product3
{
    public static void main(String args[])
    {
        Product p1 = new Product();
        p1.input("apple", 100);
        p1.show();

        Product p2 = new Product();
        p2.input("orange", 14);
        p2.show();

        Product p3 = new Product();
        p3.input("juva", 700);
        p3.show();

    if(p1.price>p2.price&&p1.price>p3.price)
    {
        System.out.println("P1 IS HIGHEST COST");

    }
      if(p2.price>p3.price&&p2.price>p1.price)
    {
        System.out.println("P2 IS HIGHEST COST");
        
    }
     if(p3.price>p2.price&&p3.price>p1.price)
    {
        System.out.println("P3 IS HIGHEST COST");
        
    }

    }
}
 