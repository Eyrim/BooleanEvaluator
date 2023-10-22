package me.eyrim.booleananalysis;

public class Main {
    public static void main(String[] args) {
        try {
            //BracketMatcher matcher = new BracketMatcher("OR(AND(OR(1, 1), 1), NOT(0))");
            Solver.evaluateSimpleStatement("NOT(1)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}