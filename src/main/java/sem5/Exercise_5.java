package sem5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise_5 {
    public static void main(String[] args) throws IOException{
        String[] filePath = {"notes.txt", "new_notes.txt"};
        String pref = "deprecated_";
        filePrefix(filePath, pref);
    }

    private static void filePrefix(String[] paths, String prefix) throws IOException {
        for (String fn : paths) {
            Path file = Path.of(fn);
            if (Files.exists(file)) {
                Files.move(file, Paths.get(prefix + file));
            } else {
                System.out.println("No such file");
            }
        }
    }
}