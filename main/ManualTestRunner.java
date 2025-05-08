package main;

public class ManualTestRunner {

    public static void main(String[] args) {
        // Tạo đối tượng NumberAnalyzer để thực hiện kiểm thử
        NumberAnalyzer analyzer = new NumberAnalyzer();

        // Kiểm tra các trường hợp
        test("Test More Positives", 
             analyzer.analyzeNumbers(new int[]{1, -1, 2}), 
             "More positives");

        test("Test More Negatives", 
             analyzer.analyzeNumbers(new int[]{-5, -2, 1}), 
             "More negatives");

        test("Test Equal Pos & Neg", 
             analyzer.analyzeNumbers(new int[]{2, -2}), 
             "Equal positives and negatives");

        test("Test All Positives", 
             analyzer.analyzeNumbers(new int[]{1, 2, 3}), 
             "More positives");

        test("Test All Negatives", 
             analyzer.analyzeNumbers(new int[]{-1, -2, -3}), 
             "More negatives");

        test("Test Empty Array", 
             analyzer.analyzeNumbers(new int[]{}), 
             "Equal positives and negatives");
    }

    // Phương thức để kiểm tra và in kết quả
    private static void test(String testName, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("[PASS] " + testName);
        } else {
            System.out.println("[FAIL] " + testName +
                               " - Expected: '" + expected + "', but got: '" + actual + "'");
        }
    }
}
