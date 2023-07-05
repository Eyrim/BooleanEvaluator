package me.eyrim.booleananalysis.brackets;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class BracketMatcher {
    private final String stream;

    public BracketMatcher(String stream) {
        this.stream = stream;
    }

    public ArrayList<AbstractMap.SimpleEntry<Character, Integer>> getMatches() {
        BracketConsumer consumer = new BracketConsumer(this.stream);
//        HashMap<Character, Integer> matched = new HashMap<>();
        ArrayList<AbstractMap.SimpleEntry<Character, Integer>> matched = new ArrayList<AbstractMap.SimpleEntry<Character, Integer>>();
        AbstractMap.SimpleEntry<Character, Integer> current;

        // While there is still more to evaluate
        while ((current = consumer.next()) != null) {
            matched.add(current);
        }

        return matched;
    }
}
