package me.eyrim.booleananalysis.brackets;

import java.io.File;
import java.util.AbstractMap;

public class BracketConsumer {
    private final String stream;
    private int currentPos = 0;
    private AbstractMap.SimpleEntry<Character, Integer> last;

    public BracketConsumer(String stream) {
        // Strings cannot be larger than the int cap
        if (stream.length() == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Stream length was longer than the INTEGER.MAX_VALUE");
        }

        this.stream = stream;
    }

    /**
     * Returns the next instance of <code>(</code> or <code>)</code><br/>
     * Attached to the index in the current string it appears
     * @return AbstractMap.SimpleEntry&lt;Character, Integer&gt; containing the character found, and the index
     */
    public AbstractMap.SimpleEntry<Character, Integer> next() {
        // The current char being evaluated
        char currentChar;

        // Until the end of the stream
        while (this.currentPos < stream.length()) {
            // Get current char
            currentChar = this.stream.charAt(this.currentPos);

            //TODO: Change to be parameterised
            if (currentChar == '(' ||
                currentChar == ')') {
                this.last = new AbstractMap.SimpleEntry<>(currentChar, this.currentPos);
                this.currentPos++;

                return this.last;
            }

            // Increment position in stream
            this.currentPos++;
        }

        return null;
    }

    /**
     * Checks if the end of the stream has been reached
     * @return Whether there is more stream to consume
     */
    public boolean end() {
        return this.currentPos >= this.stream.length();
    }

    /**
     * Returns the last matched character and it's index
     * @return AbstractMap.SimpleEntry&lt;Character, Integer&gt; containing the last character found, and its index
     */
    public AbstractMap.SimpleEntry<Character, Integer> getLast() {
        return this.last;
    }
}
