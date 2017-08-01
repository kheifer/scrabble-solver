package scrabble;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleScorerTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("e"));
    }
    @Test
    public void calculateScore_returnsScoreForTwolLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("ae"));
    }
    @Test
    public void calculateScore_returnsScoreForThreelLetter_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("aei"));
    }
    @Test
    public void calculateScore_returnsScoreForNoLetter_4() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 0;
        assertEquals(expected, testScrabble.calculateScore(" "));
    }
    @Test
    public void calculateScore_returnsScoreForUpperCaseLetter_5() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 12;
        assertEquals(expected, testScrabble.calculateScore("Zoo"));
    }
    @Test
    public void calculateScore_returnsScoreForLetters_6() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 12;
        assertEquals(expected, testScrabble.calculateScore("Zoo34"));
    }

}