
/*write a program to read two matrix from the console and perform addition*/
import java.util.*;

public class matrixaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and column of first matrix");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("enter the rows and column of second matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[p][q];
        int b[][] = new int[m][n];
        int c[][] = new int[p][q];

        if (p == m && q == n)
            System.out.println("enter the element first matrix");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("enter the element second matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }

        }

        System.out.println("enter first matrix :");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.println(a[i][j]);
            }

        }

        System.out.println("enter second matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(b[i][j]);

            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("final matrix :");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(c[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
