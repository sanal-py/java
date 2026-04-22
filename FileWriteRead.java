import java.io.*;
import java.util.Scanner;

public class FileWriteRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("sample.txt");

            System.out.println("Enter text (type END to stop):");

            // Multiple line input
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) {
                    break;
                }
                writer.write(line + "\n");
            }

            writer.close();

            // Reading from file
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;
            System.out.println("\nFile Contents:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}