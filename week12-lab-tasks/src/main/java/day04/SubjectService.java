package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> blockList = new ArrayList<>();

    public void readFile(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                blockList.add(new SubjectBlock(line, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        }catch (IOException ioe) {
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

    public int teacherSubjects(String teacherName) {
        int sum = 0;
        for (SubjectBlock sb: blockList) {
            if (sb.getName().equals(teacherName)) {
                sum += sb.getLessonsNumber();
            }
        }
        return sum;
    }

    public List<SubjectBlock> getBlockList() {
        return blockList;
    }
}
