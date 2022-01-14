package day05;

import java.util.ArrayList;
import java.util.List;

public class Spelling {

    private List<String> letters = new ArrayList<>();

    public void addLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            String[] textSplit = text.split("");
            letters.add(textSplit[i]);
        }
    }

    public String numberOfLetters() {

        StringBuilder sb = new StringBuilder();
        for (String st: letters) {
            if (sb.indexOf(st) == -1) {
                int count = counterLetters(st);
                sb.append(st).append("-").append(count).append(" ");
            }
        }
        return sb.toString();
    }

    private int counterLetters(String st) {
        int counter = 0;
        for (String st2: letters) {
            if (st.equals(st2)) {
                counter++;
            }
        }
        return counter;
    }

}
