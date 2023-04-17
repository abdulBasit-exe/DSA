package Tree;

public class main {
    public static void main(String[] args) {
        BT d = new BT("D",null,new BT("H"));
        BT b = new BT("B",d,new BT("E"));
        BT f = new BT("F",new BT("I"),null);
        BT g = new BT("G",new BT("J"),new BT("K"));
        BT c = new BT("C",f,g);
        BT a = new BT("A",b,c);
        System.out.println(a.inLine());
        System.out.println(a.postOrder());
        System.out.println(a.preOrder());
    }
}
