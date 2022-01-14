package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void testSubjects() {
        Subject subject = new Subject();
        String fileName = "src/test/resources/beosztas.txt";
        int numAlbatrosz = subject.teacherSubjects("Albatrosz Aladin", Path.of(fileName));
        int numCsilla = subject.teacherSubjects("Csincsilla Csilla", Path.of(fileName));
        assertEquals(24, numAlbatrosz);
        assertEquals(22, numCsilla);

    }
}