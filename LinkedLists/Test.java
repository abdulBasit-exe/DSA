package LinkedLists;

class Node{
    private int data;
    private Node next;

    public Node(){
        data = 0;
        next = null;
    }

    public Node(int d,Node n){
        data = d;
        next = n;
    }

    public void setData(int d){
        data=d;
    }

    public void setNext(Node n){
        next=n;
    }

    public int getData() {
        return data;
    }

    public Node getNext(){
        return next;
    }
}

class LinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;

        else return false;
    }

    public int getListSize() {
        return size;
    }

    public void veiwList() {
        Node t;
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            t = head;
            for (int i = 1; i <= size; i++) {
                System.out.println(" " + t.getData());
                t = t.getNext();
            }
        }
    }

    public void insertAtFirst(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(head);
        size++;
    }

    public void insertAtLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = head;
        if (t == null) {
            head = n;
        } else {
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(n);
        }
        size++;

    }
}

    public class Test {
        public static void main(String[] args) {
            LinkedList list1 = new LinkedList();
            list1.insertAtLast(10);
            list1.insertAtLast(12);
            list1.insertAtLast(20);
            list1.insertAtLast(21);
            System.out.println(list1.getListSize());
            list1.veiwList();

        }
    }


