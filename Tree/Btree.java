package Tree;

import static Tree.Btree.BinaryTree.count;

public class Btree {
    static class Node {
        int data;
        static Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }

        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int nodes[]){
                idx++;

                if (nodes[idx]==-1){
                    return null;
                }

                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }

            public static int count(Node root){
                if (root==null){
                    return 0;
                }
                int leftC = count(root.left);
                int rightC = count(root.right);

                return leftC+rightC+1;
            }

            public static int Sum(Node root){
                if (root==null){
                    return 0;
                }
                int leftSum = count(root.left);
                int rightSum = count(root.right);

                return leftSum+rightSum+root.data;
            }

            public static void preOrder(Node root){
                if (root==null){
                    return;
                }

                System.out.print(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }



    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
//        tree.preOrder(root);
        System.out.println(BinaryTree.count(root));

    }
}
