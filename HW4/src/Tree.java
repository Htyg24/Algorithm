import java.util.Comparator;
import java.util.Objects;

//    Реализовать метод contains в классе Tree


public class Tree<T extends Comparable<T>> {

    private Node root;

    private class Node {
        private T value;
        private Node left;

        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T value) {
        Objects.requireNonNull(value);
        root = appendNode(root, value);
    }

    private Node appendNode(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        int compare = value.compareTo(current.value);
        if (compare < 0) {
            current.left = appendNode(current.left, value);
        } else if (compare > 0) {
            current.right = appendNode(current.right, value);
        }

        return current;
    }

    public boolean contains(Node current, T value) {

        if (current.value == value)
            return true;

        if (value.compareTo(current.value) < 0 && current.left != null)
            return contains(current.left, value);

        if (value.compareTo(current.value) > 0 && current.right != null)
            return contains(current.right, value);

        return false;
    }
}