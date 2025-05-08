package main;

public class NumberAnalyzer {

    public String analyzeNumbers(int[] numbers) {
        int countPositive = 0;
        int countNegative = 0;

        for (int num : numbers) {
            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;
            }
        }

        if (countPositive > countNegative) {
            return "More positives";
        } else if (countNegative > countPositive) {
            return "More negatives";
        } else {
            return "Equal positives and negatives";
        }
    }
}