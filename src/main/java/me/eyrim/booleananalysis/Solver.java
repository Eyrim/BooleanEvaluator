package me.eyrim.booleananalysis;

import me.eyrim.booleananalysis.enums.BooleanEnum;

public class Solver {
    public static boolean evaluateSimpleStatement(String statement) {
        boolean result = false;
        BooleanEnum gate;
        String[] inputs;
        String[] splitStatement = statement.split("[(]");

        // Find which logic gate
        gate = BooleanEnum.valueOf(splitStatement[0]);
        // Find the inputs
        inputs = splitStatement[1].split(",");
        // Clean up inputs (last input will have closing bracket)
        inputs[inputs.length - 1] = inputs[inputs.length - 1].replace(')', ' ').strip();
        // Evaluate
        System.out.println(gate.EvaluationFunction.apply(inputs));

        return result;
    }
}
