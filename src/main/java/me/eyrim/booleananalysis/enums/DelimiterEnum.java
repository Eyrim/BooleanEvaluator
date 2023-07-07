package me.eyrim.booleananalysis.enums;

public enum DelimiterEnum {
    VALID_OPENING('(','[', '{'),
    VALID_CLOSING( ')', ']', '}');

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
