//package Tree;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//
//class binaryTree {
//    Node root;
//
//    binaryTree() {
//        root = null;
//    }
//
//    void insert(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            root = insertNode(root, arr[i]);
//        }
//    }
//
//    Node insertNode(Node node, int data) {
//        if (node == null) {
//            return new Node(data);
//        }
//
//        if (data < node.data) {
//            node.left = insertNode(node.left, data);
//        } else {
//            node.right = insertNode(node.right, data);
//        }
//
//        return node;
//    }
//
//
//}
//public class InsertBT {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 8, 1, 4, 6, 9};
//
//        binaryTree tree = new binaryTree();
//        tree.insert(arr);
//    }
//}