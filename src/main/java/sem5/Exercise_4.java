package sem5;

import java.io.File;

public class Exercise_4 {
    public static void main(String[] args) {
        File dirToRead = new File(".");
        File[] files = dirToRead.listFiles();
        for (File file: files) {
            System.out.println(file.getName());
        }
    }
}
