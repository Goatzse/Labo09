import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input student details
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Input file name
            System.out.print("Enter the name of existing file: ");
            String fileName = sc.nextLine();

            // Writing data to file
            FileWriter fw = new FileWriter(fileName, true); // true for append
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + rollNo);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.write("---------------------------");
            bw.newLine();

            bw.close();
            System.out.println("\nStudent details written to file successfully.\n");

            // Reading and displaying file content
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Content of the file:");
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

