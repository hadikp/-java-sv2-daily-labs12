package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellingTest {

    @Test
    void testNumOfSpelling() {
        Spelling spelling = new Spelling();
        spelling.addLetters("almafatermés");
        System.out.println(spelling.numberOfLetters());
    }

}