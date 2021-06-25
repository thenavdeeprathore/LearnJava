package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static String path = "src/fileHandling/sample.txt";

    public static void main(String[] args) {
        createFile(path);
    }

    private static void createFile(String filePath) {
        File myFile = new File(filePath);
        try {
            boolean flag = myFile.createNewFile();
            if (flag) {
                System.out.println("File is created...");
            } else {
                System.out.println("File is already present...");
            }
        } catch (IOException e) {
            System.out.println("Unable to create a file");
            e.printStackTrace();
        }
    }
}
