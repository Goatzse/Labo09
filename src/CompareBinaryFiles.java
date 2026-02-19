import java.io.FileInputStream;
import java.io.IOException;

public class CompareBinaryFiles {
    public static void main(String[] args) {

        // Specify two binary files (assume they exist in the system)
        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try {
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int byte1, byte2;
            int position = 0;
            boolean areEqual = true;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                // If both reach end of file
                if (byte1 == -1 && byte2 == -1) {
                    break;
                }

                position++;

                // If bytes are different
                if (byte1 != byte2) {
                    areEqual = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }
            }

            // If files are equal
            if (areEqual) {
                System.out.println("Two files are equal");
            }

            fis1.close();
            fis2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

