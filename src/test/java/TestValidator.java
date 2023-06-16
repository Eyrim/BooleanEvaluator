import me.eyrim.booleananalysis.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidator {
    @Test
    @DisplayName("Test Validator.validateParenthesis with normal data")
    void parenthesisTestNormal() {
        assertTrue(Validator.validateParenthesisMatch("OR(1, 0)"));
        assertTrue(Validator.validateParenthesisMatch("OR((1, 0))"));
        assertTrue(Validator.validateParenthesisMatch("NOT(OR(1, 0))"));

        assertFalse(Validator.validateParenthesisMatch("NOT(OR(1, 0)"));
        assertFalse(Validator.validateParenthesisMatch("OR(1, 0"));
        assertFalse(Validator.validateParenthesisMatch("OR((1, 0)"));
    }

    @Test
    @DisplayName("Test Validator.validateParenthesis with edge data")
    void parenthesisTestEdge() {
        assertTrue(Validator.validateParenthesisMatch("OR1, 0"));
        assertTrue(Validator.validateParenthesisMatch(""));
    }
}
