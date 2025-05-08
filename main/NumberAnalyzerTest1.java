package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberAnalyzerTest {

    @Test
    public void testMorePositives() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {1, -1, 2};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("More positives", result);
    }

    @Test
    public void testMoreNegatives() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {-5, -2, 1};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("More negatives", result);
    }

    @Test
    public void testEqualPosNeg() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {2, -2};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("Equal positives and negatives", result);
    }
    @Test
    public void testAllPositive() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {1, 2, 3};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("More positives", result);
    }

    @Test
    public void testAllNegative() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {-1, -2, -3};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("More negatives", result);
    }

    @Test
    public void testEmptyArray() {
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] input = {};
        String result = analyzer.analyzeNumbers(input);
        assertEquals("Equal positives and negatives", result);
    }
}

