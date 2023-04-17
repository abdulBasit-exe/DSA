package Lab8Tasks;
/*
Write a program to create a doubly linked list with three
nodes having char data and print the list. Insert a node using addAfter()
and remove a node using deleteByPosition(). Print the list.
 */
public class task1 {
    static class LinkedList{
        char data;
        Node head;
        int size;
        LinkedList(){
            this.size = 0;
        }

    }

    static class Node{
        char data;
        Node next;
        Node previous;
        Node(char data){
            this.data=data;
            this.next = null;
            this.previous=null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n1 = new Node('a');
        Node n2 = new Node('b');
        Node n3 = new Node('c');
        Node n4 = new Node('d');
        list.head = n1;
        n1.next=n2;

    }


}
