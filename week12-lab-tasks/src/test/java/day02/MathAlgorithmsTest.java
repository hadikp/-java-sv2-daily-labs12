package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void test() {
        MathAlgorithms ma = new MathAlgorithms();
        System.out.println(ma.getHighestCommonFactor(50, 75));

    }

}