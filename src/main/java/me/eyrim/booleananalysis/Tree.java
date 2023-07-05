package me.eyrim.booleananalysis;

// Effectively an arbitrarily linked list
@Deprecated
public class Tree {
    private Tree[] children;
    private String value;
    private Tree root;

    public void setChildren(Tree[] children) {
        this.children = children;
    }

    public Tree[] getChildren() {
        return this.children;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Tree getRoot() {
        return this.root;
    }
}
