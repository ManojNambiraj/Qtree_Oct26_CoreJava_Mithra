package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) {
        File file = new File("data.txt");

        try(Scanner reader = new Scanner(file)) {
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }   
}
