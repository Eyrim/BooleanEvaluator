package me.eyrim.booleananalysis;

import me.eyrim.booleananalysis.brackets.BracketMatcher;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            //BracketMatcher matcher = new BracketMatcher("OR(AND(OR(1, 1), 1), NOT(0))");
            BracketMatcher matcher = new BracketMatcher("OR(1, 1)");

            matcher.getMatches();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}