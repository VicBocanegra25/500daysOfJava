package UNIR.app.NumbersAsText;

import java.util.ArrayList;
import java.util.List;

public class NumbersAsText {

    public NumbersAsText() {
        // Empty constructor is not required if it doesn't do anything.
    }

    /**
     * Converts a number into its text representation.
     * For example, 123 will be converted to "ONE TWO THREE".
     *
     * @param n The number to convert.
     * @return  The text representation of the number.
     */
    public String numberAsText(int n) {
        StringBuilder digitAsText = new StringBuilder();

        // Reuse the extractDigits function to get the digits.
        List<Integer> digitList = extractDigits(n);

        for (int value : digitList) {
            String valueAsText = digitToText(value);
            digitAsText.append(valueAsText).append(" ");
        }

        // Remove the last trailing space if any
        if (digitAsText.length() > 0) {
            digitAsText.setLength(digitAsText.length() - 1);
        }

        return digitAsText.toString();
    }

    /**
     * Converts a single digit into its text representation.
     *
     * @param digit The digit to convert.
     * @return      The text representation of the digit.
     */
    private String digitToText(int digit) {
        switch (digit) {
            case 1: return "ONE";
            case 2: return "TWO";
            case 3: return "THREE";
            case 4: return "FOUR";
            case 5: return "FIVE";
            case 6: return "SIX";
            case 7: return "SEVEN";
            case 8: return "EIGHT";
            case 9: return "NINE";
            default: return "ZERO";
        }
    }

    /**
     * Extracts the digits from a given number and returns them as a list.
     *
     * @param number The number to extract digits from.
     * @return       A List containing the digits.
     */
    private List<Integer> extractDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(0, number % 10);
            number /= 10;
        }
        return digits;
    }
}
