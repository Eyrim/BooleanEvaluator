package me.eyrim.booleananalysis;

// Effectively an arbitrarily linked list
public class TreeNode {
    private TreeNode[] children;
    private String value;

    public TreeNode(TreeNode[] children, String value) {
        this.children = children;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public TreeNode[] getChildren() {
        return this.children;
    }

    public void setChildren(TreeNode[] children) {
        this.children = children;
    }
}
