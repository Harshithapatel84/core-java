import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

        String line = reader.readLine();  
        System.out.println(line);

        reader.close();
    }
}