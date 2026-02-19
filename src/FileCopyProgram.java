import java.io.*;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input file names
            System.out.print("Enter the source file name: ");
            String sourceFile = sc.nextLine();

            System.out.print("Enter the destination file name: ");
            String destFile = sc.nextLine();

            // --------- Character Stream Copy (FileReader & FileWriter) ---------
            FileReader fr = new FileReader(sourceFile);
            FileWriter fw = new FileWriter(destFile);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied using Character Stream successfully.");

            // --------- Byte Stream Copy (FileInputStream & FileOutputStream) ---------
            System.out.print("\nEnter destination file for byte stream copy: ");
            String byteDestFile = sc.nextLine();

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(byteDestFile);

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied using Byte Stream successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

