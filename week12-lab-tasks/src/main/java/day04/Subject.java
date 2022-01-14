package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Subject {

    public int teacherSubjects(String teacherName, Path path) {
        int hours = 0;
        List<String> teachersData = readFile(path);
        for (int i = 0; i < teachersData.size(); i++) {
            if (i % 4 == 0) {
               if (teachersData.get(i).equals(teacherName)) {
                   hours += Integer.parseInt(teachersData.get(i+3).trim());
               }
            }
        }
        return hours;
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

    private void readFileBuffer(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file", ioe);
        }
    }
}
