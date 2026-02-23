import java.util.*;

public class matrixsymmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and column of  matrix");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int a[][] = new int[p][q];

        System.out.println("enter the element matrix");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println(" element of matrix");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");

            }
            System.out.println();
        }

        if (p != q) {
            System.out.println("The given matrix is not a square matrix");
        } else {
            boolean f = true;

            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    if (a[i][j] != a[j][i]) {
                        f = false;
                        break;

                    }
                }
            }
            if (f) {

                System.out.println("The given matrix is a symmetic matrix");
            } else {

                System.out.println("The given matrix is not symmetic matrix");
            }
        }
    }
}
