//package LinkedLists;
//public class LinkedList {
//    Node head;
//    int size;
//    LinkedList(){
//        size=0;
//        head= null;
//
//    }
//
//    static class Node {
//        private int data;
//        private Node next;
//
//        Node(int data) {
//            this.data = data;
//            next = null;
//        }
//
//        Node(int data, Node n){
//
//        }
//    }
//
//    public void printList() {
//        Node n = head;
//        while (n != null) {
//            System.out.print(n.data + " ");
//            n = n.next;
//        }
//    }
//
//    public static void main(String[] args) {
//            LinkedList linkedList= new LinkedList();
//            linkedList.head= new Node(1);
//            Node second = new Node(2);
//            Node third = new Node(3);
//            Node fourth = new Node(4);
//
//
//            linkedList.head.next = second;
//            second.next = fourth;
//            fourth.next=third;
//            linkedList.printList();
//    }
//}
