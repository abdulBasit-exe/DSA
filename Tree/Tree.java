package Tree;

public class Tree {
    static class Node {
        int value;
        Node left, right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public Node delete(Node node, int val) {
        if (node == null) {
            return null;
        }

        if (val < node.value) {
            node.left = delete(node.left, val);
        } else if (val > node.value) {
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if (temp == null) {
                    return null;
                } else {
                    return node;
                }
            } else {
                Node successor = getSuccessor(node);
                node.value = successor.value;
                node.right= delete(node.right, 4);
            }
        }
        return node;
    }

    public Node getSuccessor(Node node){
        if (node==null){
            return null;
        }

        Node temp = node.right;

        while (temp!=null){
            temp = temp.left;
        }

        return temp;
    }

    public static void main(String args[])
    {
        Tree tree = new Tree();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);

    }
}
