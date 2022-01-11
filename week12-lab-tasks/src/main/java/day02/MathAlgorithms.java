package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MathAlgorithms {

    public int getHighestCommonFactor(int num1, int num2) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= (num1 / 2); i++) {
            if (num1 % i == 0) {
                if (num2 % i == 0) {
                    divisors.add(i);
                }
            }
        }
        return divisors.get(divisors.size()-1);
    }


}
