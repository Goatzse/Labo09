import java.io.*;
import java.util.Scanner;

public class FileCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;                     // Count lines
                charCount += line.length();     // Count characters

                // Count words
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("No. of characters - " + charCount);
            System.out.println("No. of lines - " + lineCount);
            System.out.println("No. of words - " + wordCount);

        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }

        sc.close();
    }
}

