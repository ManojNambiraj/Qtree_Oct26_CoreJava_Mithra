package files;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");

            file.write("Good evening...!");

            file.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
