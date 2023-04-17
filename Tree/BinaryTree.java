package Tree;

public class BinaryTree {
    Object root;
    BinaryTree left, right;
    public BinaryTree(Object root){
        this.root = root;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right){
        this.root = root;
        this.left= left;
        this.right= right;
    }

    public Object getRoot(){
        return root;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public int size(){
        if (left == null && right== null) return 1;
        if (left==null) return 1+right.size();
        if (right==null) return 1+ left.size();


        return 1+ left.size()+ right.size();
    }

    public int height(){
        if (root==null) return -1;
        int leftC = 0, rightC = 0;
        if (left!=null) {
            leftC = 1 + left.height();
        }
        if (right!=null){
            rightC=1+right.height();
        }
        return leftC>rightC ? leftC: rightC;
    }



    public boolean isLeaf(){
        return (this.right == null && this.left==null);
    }

    public String toString(){
        StringBuffer buf = new StringBuffer();
        if (left!= null) buf.append(left+", ");
        buf.append(root);
        if (right!=null) buf.append(", "+ right);
        return buf + " ";
    }


    public static void preOrder(BinaryTree root){
        if (root==null){
            return ;
        }
        System.out.print(root+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree d = new BinaryTree("D");
        BinaryTree e = new BinaryTree("E");
        BinaryTree b = new BinaryTree("B", d, e);
        BinaryTree f = new BinaryTree("F");
        BinaryTree c = new BinaryTree("C", null, null);
        BinaryTree a = new BinaryTree("A", b, c);
//        System.out.println( a.isLeaf());
//        System.out.println(d.height());
        System.out.println(a);
    }
}
