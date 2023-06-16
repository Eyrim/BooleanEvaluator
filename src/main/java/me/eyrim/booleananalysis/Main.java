package me.eyrim.booleananalysis;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Tokenizer tokenizer = new Tokenizer(new File("D:\\projects\\Boolean\\src\\main\\resources\\data.csv"));

            tokenizer.tokenize();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}