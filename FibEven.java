//To define 2 classes;one for generating fibanocii numbers and other for displaying even numbers in a given range Implement using thread

class FibThread implements Runnable {
    public void run() {
        int a = 0, b = 1, c = 0;
        System.out.println("FibThread-" + a);
        System.out.println("FibThread-" + b);
        for (int h = 1; h <= 7; h++) {
            c = a + b;
            System.out.println("Fib Thread-" + c);
            a = b;
            b = c;
        }
    }
}

class EvenRangeThread implements Runnable {
    public void run() {

        int a = 2, b = 10;
        for (int k = a; k <= b; k += 2)
            System.out.println("EvenRangeThread-" + k);
    }
}

public class FibEven {
    public static void main(String args[]) {
        FibThread ft = new FibThread();
        EvenRangeThread er = new EvenRangeThread();
        Thread t1 = new Thread(ft);
        Thread t2 = new Thread(ft);
        t1.start();
        t2.start();

    }
}
