package me.eyrim.booleananalysis.brackets;

import me.eyrim.booleananalysis.enums.DelimiterEnum;

import java.util.*;

public class BracketMatcher {
    private final String stream;

    public BracketMatcher(String stream) {
        this.stream = stream;
    }

    public HashMap<Integer, Integer> getMatches() {
        HashMap<Integer, Integer> matched = new HashMap<>();
        BracketConsumer consumer = new BracketConsumer(this.stream);
        AbstractMap.SimpleEntry<Character, Integer> current;
        // Stores the indexes in the stream that open brackets appear
        Stack<Integer> history = new Stack<>();

        // While there is still more to evaluate
        while ((current = consumer.next()) != null) {
            if (DelimiterEnum.OPEN.isValid(current.getKey())) {
                // Add to stack
                history.add(current.getValue());
            } else { // consumer will only return ( and )
                try {
                    // Pop stack and add values to hashtable
                    matched.put(history.pop(), current.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return matched;
    }
}
