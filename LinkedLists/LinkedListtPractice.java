package LinkedLists;

import java.util.LinkedList;

class LinkedListt{
    public Node head;
    public Node tail;
    public int size;

    LinkedListt(){
        size=0;
    }

    public void set(int pos, int data){
        Node temp = head;
        for (int i =1; i<=pos; i++){
            temp= temp.next;
        }
        temp.data = data;
    }

    public void addAtPos(int data,int pos){
        if (pos==1) {
            addFirst(data);
            return;
        }

        if (pos == size){
            addLast(data);
            return;
        }

        if (pos<=1 || pos>size){
            System.out.println("can't insert at "+pos+" position.");
            return;
        }

        Node newNode, temp;
        newNode = new Node(data);
        temp= head;
        for (int i = 1; i<pos-1;i++){
            temp= temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head.next == null){
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i<size; i++){
            temp = temp.next;
        }
        temp.next.next = newNode;
        newNode.next = null;
        size++;
    }

    public Node deleteFirst(){
        if (head== null){
            System.out.println("list is empty");
            return null;
        }
        Node temp = head;
        head = head.next;
        size--;
        return temp;
    }

    public Node deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
        return temp;
    }

    public Node delete(int index){
        if (index==1){
            size--;
            return deleteFirst();
        }
        else if (index==size){
            System.out.println("deleting last");
            deleteLast();
            size--;
            return null;
        }
        Node temp = head;
        for (int i =0;i<=size;i++){
            temp= head.next;
        }
        Node deleted = temp.next;
        temp.next=temp.next.next;
        size--;
        return deleted;
    }
    public void display(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp;
        while (head!= null){
            temp = head;
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");
    }


    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }

        Node(int data, Node next){
            this.data= data;
            this.next=next;
        }

    }
}
public class LinkedListtPractice {
    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(6);
        ll.set(4,20000);
        ll.display();


    }
}
