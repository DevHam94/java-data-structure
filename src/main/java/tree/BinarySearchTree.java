package tree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {

    private Node root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public T min() {
        return this.minNode(this.root);
    }

    private T minNode(Node node) {
        T minData = node.data;
        while (node.left != null) {
            minData = node.left.data;
            node = node.left;
        }
        return minData;
    }

    public T max() {
        return this.maxNode(this.root);
    }

    private T maxNode(Node node) {
        T maxData = node.data;
        while (node.right != null) {
            maxData = node.right.data;
            node = node.right;
        }
        return maxData
    }

    @Override
    public void insert(T val) {

    }

    @Override
    public void delete(T val) {

    }

    @Override
    public boolean contains(T val) {
        return false;
    }

    private boolean containsNode(Node node, T val) {
        // a.compareTo(b)
        // a < b -> -1
        // a == b -> 0
        // a > b
        if (val.compareTo(node.data) == 0) {

        }
    }

    @Override
    public int size() {
        return 0;
    }

    public List<T> preOrder() {
        return this.preorderTree(root, new ArrayList<>());
    }

    private List<T> preorderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        visited.add(node.data);
        preorderTree(node.left, visited);
        preorderTree(node.right, visited);

        return visited;
    }

    public List<T> inOrder() {
        return inorderTree(root, new ArrayList<>());
    }

    private List<T> inorderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        inorderTree(node.left, visited);
        visited.add(node.data);
        inorderTree(node.right, visited);

        return visited;

    }

    public List<T> postOrder() {
        return this.postorderTree(root, new ArrayList<>());
    }

    private List<T> postorderTree(Node node, List<T> visited) {
        if (node == null) return visited;

        postorderTree(node.left, visited);
        postorderTree(node.right, visited);
        visited.add(node.data);

        return visited;
    }

    private class Node {
        T data;
        Node left;
        Node right;
    }
}
