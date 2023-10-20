import me.eyrim.booleananalysis.Solver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBooleanEnumEvaluation {
    @Test
    void booleanEnumEvaluation() {
        assertTrue(Solver.evaluateSimpleStatement("OR(1, 0)"));
        assertFalse(Solver.evaluateSimpleStatement("OR(0, 0)"));
        assertTrue(Solver.evaluateSimpleStatement("OR(1, 1)"));
        assertTrue(Solver.evaluateSimpleStatement("OR(0, 0, 1)"));

        assertTrue(Solver.evaluateSimpleStatement("AND(1, 1)"));
        assertTrue(Solver.evaluateSimpleStatement("AND(1, 1, 1, 1, 1, 1)"));
        assertFalse(Solver.evaluateSimpleStatement("AND(1, 0)"));
        assertFalse(Solver.evaluateSimpleStatement("AND(1, 1, 1, 1, 1, 1, 1, 0)"));
        assertFalse(Solver.evaluateSimpleStatement("AND(0, 0)"));
        assertFalse(Solver.evaluateSimpleStatement("AND(0, 0, 1, 1)"));
    }
}
