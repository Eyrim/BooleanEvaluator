package me.eyrim.booleananalysis;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tokenizer {
    private final File sourceFile;
    private final String[] fileData;

    public Tokenizer(File file) {
        this.sourceFile = file;
        this.fileData = readFile(this.sourceFile);
    }

    public void tokenize() {
        Tree[] trees = new Tree[this.fileData.length];

        for (int i = 0; i < this.fileData.length; i++) {
            trees[i] = generateTree(this.fileData[i]);
        }
    }

    private static Tree generateTree(String line) {
        Tree root = new Tree();

        return root;
    }

    // ~~Split on /[\(.\)]/~~
    private static String[] readFile(File sourceFile) {
        List<String> file = new ArrayList<>();

        try (Scanner sc = new Scanner(sourceFile)) {
            while (sc.hasNext()) {
                file.add(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return file.toArray(String[]::new);
    }
}
