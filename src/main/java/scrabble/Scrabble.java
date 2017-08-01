package scrabble;
import java.util.Map;
import java.util.HashMap;

public class Scrabble {

    public Integer score = 0;

    public Integer calculateScore(String inputtedWord) {
        String lower = inputtedWord.toLowerCase();
        String special = lower.replaceAll("\\P{L}", " ");
        char[] list = special.toCharArray();
        for (int let = 0; let < list.length ; let++) {

        Map<Character, Integer> wordCount = new HashMap<Character, Integer>();
        wordCount.put('a', 1);
        wordCount.put('b', 3);
        wordCount.put('c', 3);
        wordCount.put('d', 2);
        wordCount.put('e', 1);
        wordCount.put('f', 4);
        wordCount.put('g', 2);
        wordCount.put('h', 4);
        wordCount.put('i', 1);
        wordCount.put('j', 8);
        wordCount.put('k', 5);
        wordCount.put('l', 1);
        wordCount.put('m', 3);
        wordCount.put('n', 1);
        wordCount.put('o', 1);
        wordCount.put('p', 3);
        wordCount.put('q', 10);
        wordCount.put('r', 1);
        wordCount.put('s', 1);
        wordCount.put('t', 1);
        wordCount.put('u', 1);
        wordCount.put('v', 4);
        wordCount.put('w', 4);
        wordCount.put('x', 8);
        wordCount.put('y', 4);
        wordCount.put('z', 10);
        wordCount.put(' ', 0);

            score += wordCount.get(list[let]);
        }
        return score;
    }

}
