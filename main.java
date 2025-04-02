import java.io.*;

public class main {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("sample.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch); // Print each character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 }
// import java.io.*;

// public class main {
//     public static void main(String[] args) throws IOException {  // Declare exception in method signature
//         FileReader reader = new FileReader("sample.txt");  // No try-with-resources
//         int ch;
//         while ((ch = reader.read()) != -1) {
//             System.out.print((char) ch);
//         }
//         reader.close(); // Manually close the file
//     }
// }

/*import java.io.*;

public class main {


    private String readJsonString(Reader reader) {

    }

    public static void main(String[] args) {
        String fileName = "sample.txt"; // Ensure this file exists

        // Measure execution time for try-with-resources
        long start1 = System.nanoTime();
        tryWithResources(fileName);
        long end1 = System.nanoTime();
        System.out.println("\nTry-with-resources Execution Time: " + (end1 - start1) + " nanoseconds");

        // Measure execution time for manual close
        long start2 = System.nanoTime();
        withoutTryCatch(fileName);
        long end2 = System.nanoTime();
        System.out.println("Without try-catch Execution Time: " + (end2 - start2) + " nanoseconds");
    }

    // Approach 1: Try-with-Resources
    private static void tryWithResources(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Approach 2: Without Try-Catch (Manual Resource Management)
    private static void withoutTryCatch(String fileName) {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // Manual closing
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/
