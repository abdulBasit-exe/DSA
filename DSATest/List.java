package DSATest;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class List {
    public static void main(String[] args) {

        Node node1 = new Node(4);
        node1.next = new Node(5);
        node1.next.next = new Node(6);

        Node node2 = new Node(7);
        node2.next = new Node(8);
        node2.next.next = new Node(9);

        int sum = 0;

        Node curr1 = node1;
        while (curr1.next != null) {
            curr1 = curr1.next;
        }
        sum = curr1.data;

        Node curr2 = node2;
        while (curr2.next != null) {
            curr2 = curr2.next;
        }
        sum += curr2.data;

        System.out.println("Sum:"+sum);
    }
}