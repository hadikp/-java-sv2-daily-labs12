package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    @Test
    void test() {
        Path path = Path.of("src/test/resources/running.csv");
        Run run = new Run();
        assertEquals(25.9, run.makeRuning(path, 2022, 1), 0.005);
        assertEquals(41.2, run.makeRuning(path, 2021, 12), 0.005);

    }

}