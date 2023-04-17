//package Tree;
//
//public class Que1_lab {
//
//    static class Binarytree {
//        int data;
//        Node left, right;
//
//        public Binarytree(int data){
//            this.data= data;
//        }
//
//        public Binarytree(int data, Node left, Node right){
//            this.data = data;
//            this.right = right;
//            this.left = left;
//        }
//
//        public static Node insert(Node root, int data){
//            if (root==null){
//                root = new Node(data);
//                return root;
//            }
//
////            if (data < ){
//                root.left=insert(root.left, data);
//            }
//
//            else {
//                root.right = insert(root.right, data);
//            }
//            return root;
//        }
//    }
//
//    public static int countOfNode(Node root){
//        if (root==null){
//            return 0;
//        }
//
//        int left =  countOfNode(root.left);
//        int right = countOfNode(root.right);
//
//        return left+right+1;
//    }
//
//    public static int sumOfNode(Node root){
//        if (root==null){
//            return 0;
//        }
//
//        int leftSum =  sumOfNode(root.left);
//        int rightSum = sumOfNode(root.right);
//
//        return leftSum+rightSum+ root.data;
//    }
//
//    public static void inorder(Node root){
//        if (root==null){
//            return;
//        }
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//
//    public static void preOrder(Node root){
//        if (root==null) return;
//
//        System.out.print(root.data+" ");
//        preOrder(root.left);
//        preOrder(root.right);
//
//    }
//    public static int height(Node root){
//        if (root==null){
//            return 0;
//        }
//        int leftHeight= height(root.left);
//        int rightHeight = height(root.right);
//
//        int height = Math.max(leftHeight, rightHeight)+1;
//        return height;
//    }
//    public static void postOrder(Node root){
//        if (root==null) return;
//
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data+ " ");
//    }
//
//    public static void main(String[] args) {
//        int[] values= {6,8,3};
//        Node root = null;
//
//        for (int i = 0; i< values.length; i++){
//            root = Binarytree.insert(root, values[i]);
//        }
//
//        System.out.println("Totol Nodes: "+countOfNode(root));
//        System.out.println("Sum of Nodes: "+sumOfNode(root));
//        System.out.println("Height of tree: "+height(root));
//        System.out.println("Inorder: ");
//        inorder(root);
//        System.out.println();
//        System.out.println("PreOrder: ");
//        preOrder(root);
//        System.out.println();
//        System.out.println("PostOrder: ");
//        postOrder(root);
//    }
//}
