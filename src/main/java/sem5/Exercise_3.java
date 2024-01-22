package sem5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_3 {
    public static void main(String[] args) {
        char symbolToReplace = '0';
        char replacementSymbol = ' ';
        int i;
        try (FileInputStream br = new FileInputStream("output.txt");
             FileOutputStream bw = new FileOutputStream("input.txt")) {
            while ((i = br.read()) != -1) {
                if (i == symbolToReplace) {
                    bw.write(replacementSymbol);
                } else {
                    bw.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}