package sem5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise_1 {
    public static void main(String[] args) {
        int[] digitsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try (PrintWriter dos = new PrintWriter("output.txt")) {
            for (int digit : digitsArray) {
                dos.print(digit);
                dos.print(0);
            }
            System.out.println("Числа успешно записаны в файл.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}