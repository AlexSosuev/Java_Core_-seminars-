package sem5;

    /*Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную
    папку ./backup*/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Home_1 {
    public static void main(String[] args) {
        String sourceFolder = ".";
        backupFiles(sourceFolder);
    }

    private static void backupFiles(String directory) {
        String backupDir = "./backup";
        File backupDirFile = new File(backupDir);
        if (!backupDirFile.exists()) {
            backupDirFile.mkdir();
        }
        File dir = new File(directory);
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    File destFile = new File(backupDir, file.getName());
                    try {
                        Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        System.out.println("Не удалось создать резервную копию для файла " + file.getName());
                    }
                }
            }
            System.out.printf("Резервные копии файлов успешно созданы в папке '%s'", backupDir);
        }
    }
}