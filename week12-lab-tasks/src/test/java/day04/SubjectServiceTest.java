package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectServiceTest {

    SubjectService subjectService;

    @BeforeEach
    void init() {
        subjectService = new SubjectService();
        String fileName = "src/test/resources/beosztas.txt";
        subjectService.readFile(fileName);
    }

    @Test
    void testTeacherSubject() {
        int numAlbatrosz = subjectService.teacherSubjects("Albatrosz Aladin");
        int numCsilla = subjectService.teacherSubjects("Csincsilla Csilla");
        assertEquals(24, numAlbatrosz);
        assertEquals(22, numCsilla);
    }

}