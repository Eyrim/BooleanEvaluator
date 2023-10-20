package me.eyrim.booleananalysis.enums;

import java.util.function.Function;

public enum BooleanEnum {
    OR(inputs -> {
        // If ONE of inputs is true (1)
        for (String input : inputs) {
            if (input.equals("1")) {
                return true;
            }
        }

        return false;
    }),

    NOR(inputs -> {
        // Invert OR
        return !OR.EvaluationFunction.apply(inputs);
    }),

    NOT(inputs -> {
        if (inputs.length > 1) {
            throw new IllegalArgumentException("Input to NOT gate cannot be longer than 1, " +
                    inputs.length +
                    " arguments provided");
        }

        // Invert inputs[0]
        return !inputs[0].equals("1");
    }),

    AND(inputs -> {
        // If ANY of inputs is false (0)
        for (String input : inputs) {
            if (input.equals("0")) {
                return false;
            }
        }

        return true;
    }),

    NAND(inputs -> {
        // Invert AND
        return !AND.EvaluationFunction.apply(inputs);
    }),

    XOR(inputs -> {
        // If ONLY ONE of inputs is true
        boolean hadTrue = false;
        for (String input : inputs) {
            if (input.equals("1")) {
                if (hadTrue) { return false; }

                hadTrue = true;
            }
        }

        return hadTrue;
    }),

    XNOR(inputs -> {
        // Invert XOR
        return !XOR.EvaluationFunction.apply(inputs);
    });

    public final Function<String[], Boolean> EvaluationFunction;

    private BooleanEnum(Function<String[], Boolean> evaluationFunction) {
        this.EvaluationFunction = evaluationFunction;
    }
}
