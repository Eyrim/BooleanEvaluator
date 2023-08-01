import me.eyrim.booleananalysis.brackets.BracketMatcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestBracketMatcher {
    @Test
    @DisplayName("Test With Normal Data")
    void matcherTestNormal() {
        // Simple example
        BracketMatcher matcher1 = new BracketMatcher("OR(1, 1)");
        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(2, 7);
        assertEquals(matcher1.getMatches(), map1);

        // Complex example
        BracketMatcher matcher2 = new BracketMatcher("OR(AND(OR(1,1),1),NOT(0))");
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(2, 24);
        map2.put(6, 16);
        map2.put(9, 13);
        map2.put(21, 23);
        assertEquals(matcher2.getMatches(), map2);
    }

    @Test
    @DisplayName("Test with varied bracket types")
    void matcherTestNormal_VariedTypes() {
        // Simple example
        BracketMatcher matcher1 = new BracketMatcher("OR{1, 1}");
        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(2, 7);
        assertEquals(matcher1.getMatches(), map1);

        // Complex example
        BracketMatcher matcher2 = new BracketMatcher("OR[AND(OR[1,1],1),NOT{0}]");
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(2, 24);
        map2.put(6, 16);
        map2.put(9, 13);
        map2.put(21, 23);
        assertEquals(matcher2.getMatches(), map2);
    }
}
