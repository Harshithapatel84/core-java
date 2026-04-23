import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String data = "Hello, this is a sample text written to a file.";

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(data);
            writer.close();

            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}