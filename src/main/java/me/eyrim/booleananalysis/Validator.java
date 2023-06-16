package me.eyrim.booleananalysis;

public abstract class Validator {
    public static boolean fullValidation(String input) {
        if (!validateParenthesisMatch(input)) {
            return false;
        } else if (!validateFormat(input)) {
            return false;
        }

        return true;
    }

    public static boolean validateParenthesisMatch(String input) {
        int opening = 0;
        int closing = 0;

        // Count number of opening
        // Count number of closing
        for (char c : input.toCharArray()) {
            if (c == '(') {
                opening += 1;
            } else if (c == ')') {
                closing += 1;
            }
        }

        return opening == closing;
    }

    public static boolean validateFormat(String input) {
        // After every token an opening parenthesis should follow


        // After every value (true, false, 1, or 0) a comma should follow
            // Except for the final value in each expression

        return true;
    }
}
