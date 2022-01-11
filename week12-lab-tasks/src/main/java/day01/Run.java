package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Run {

    public double makeRuning(Path path, int year, int month) {
        double sumRun = 0;
        List<String> read = readFile(path);
         for(int i = 1; i < read.size(); i++) {
            String[] lineSplit = read.get(i).split(";");
            String km = lineSplit[0].trim();
            String[] kmSplit = km.split(" ");
            String[] timeSplit = lineSplit[1].split("-");
            double kmNumber = Double.parseDouble(kmSplit[0]);
            if (year == Integer.parseInt(timeSplit[0]) && month == Integer.parseInt(timeSplit[1])) {
                sumRun += kmNumber;
            }
        }
         return sumRun;
    }

    private List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Can't read file!", ioe);
        }
    }
}
