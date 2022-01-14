package day05;

import java.util.HashMap;
import java.util.Map;

public class SpellingMap {

    private Map<String, Integer> spellings = new HashMap<>();

    public void numberOfLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            String[] textSplit = text.split("");
            int count = lettersCounter(i, textSplit);
            spellings.put(textSplit[i], count);
        }
    }

    private int lettersCounter(int i, String[] textSplit) {
        int counter = 0;
        for (String st: textSplit) {
            if (st.equals(textSplit[i])) {
                counter++;
            }
        }
        return counter;
    }

    public Map<String, Integer> getSpellings() {
        return spellings;
    }
}
