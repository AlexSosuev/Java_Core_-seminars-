package sem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String[] fileStr = br.readLine().split("0");
            int[] arr = Arrays.stream(fileStr).mapToInt(Integer::parseInt).toArray();
            for (int number : arr) {
                System.out.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}