import java.io.*;
import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Write input to file
            FileWriter inputWriter = new FileWriter("data.txt");

            System.out.print("Enter how many numbers: ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                inputWriter.write(num + " ");
            }
            inputWriter.close();

            // Step 2: Read from file
            System.out.println("\nContents of data.txt:");
            Scanner inputReader = new Scanner(new File("data.txt"));
            while (inputReader.hasNextInt()) {
                System.out.print(inputReader.nextInt() + " ");
            }
            inputReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
