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

    public boolean isValid(char toTest) {
        for (char c : this.values) {
            if (c == toTest) {
                return true;
            }
        }

        return false;
    }
}
