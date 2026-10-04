package files;

import java.io.File;

public class Deleting {
    public static void main(String[] args) {
        File file = new File("data.txt");

        if(file.delete()){
            System.out.println("File Deleted: " + file.getName());
        }else{
            System.out.println("Failed to delete");
        }
    }
}
