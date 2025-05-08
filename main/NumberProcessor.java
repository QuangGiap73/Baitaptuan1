package main;

public class NumberProcessor {
    public String processNumber(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" is even\n");
            } else {
                result.append(i).append(" is odd\n");
            }
        }

        return result.toString();
    }
}

