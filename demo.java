class Student {
    int id;
    String name;
    float mark;

    void input(int id1, String n1, float m1) {
        id = id1;
        name = n1;
        mark = m1;
    }

    void show() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        System.out.println("My mark is " + mark);
    }
}

class demo {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.input(101, "Alice", 89.5f); // passing values
        s1.show();
    }
}