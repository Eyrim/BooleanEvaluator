package me.eyrim.booleananalysis.enums;

public enum DelimiterEnum {
    OPEN('(','[', '{'),
    CLOSE( ')', ']', '}');

    private DelimiterEnum(char... values) {
        this.values = values;
    }

    private final char[] values;

    public char[] getValues() {
        return this.values;
    }

    /**
     * Determines if an input character is a valid parenthesis
     * @param toTest The character to test
     * @return True if valid
     *
     * todo: This should be static, potentially split into two methods for open and close/written as constants somewhere else
     */
    public boolean isValid(char toTest) {
        for (char c : this.values) {
            if (c == toTest) {
                return true;
            }
        }

        return false;
    }
}
