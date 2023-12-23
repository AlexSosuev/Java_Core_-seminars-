package ru.gb.sosuev;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static final String NOTES_FILE_PATH = "notes.txt";

    public static void main(String[] args) {
        System.out.println("Введите заметку: ");
        Scanner sc = new Scanner(System.in);
        String noteText = sc.nextLine();

        String currentDateTime = DateTimeUtil.getCurrentDateTime();
        Note note = new Note(noteText, currentDateTime);

        try (FileWriter writer = new FileWriter(NOTES_FILE_PATH, true)) {
            String notesText = note.getText();
            String dateTime = note.getDateTime();
            writer.write(dateTime + " -> " + notesText + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи заметки в файл");
            e.printStackTrace();
        }
        System.out.println("Заметка сохранена в файл " + NOTES_FILE_PATH);
    }
}