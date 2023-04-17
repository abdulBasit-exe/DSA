package LinkedLists;

import java.util.IllegalFormatCodePointException;

class LList{
    private Node head;
    private Node tail;
    public int size;

    public void insert(int data, int index){
        Node temp;
        if (index==0){
            insertAtFirst(data);
            return;
        }
        if (index==size){
            insertAtLast(data);
            return;
        }
        temp= head;
        for (int i =0; i<index;i++){
            temp = temp.next;
        }
        Node newNode= new Node(data,temp.next);
        temp.next = newNode;
        size++;
    }

    public void insertAtLast(int data){
        if (tail==null){
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode=tail;
        size++;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }

        newNode.next= head;
        head= newNode;

        if(tail==null){
            tail= head;
        }
        size++;
    }
    public void display(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp;
        while (head!=null){
            temp= head;
            System.out.print(head.data+" -> ");
            head= head.next;
        }
        System.out.print("NULL");
    }
    LList(){
        size=0;
    }
    class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

        Node(int data, Node next){
            this.data= data;
            this.next=next;
        }
    }
}


public class learn {
    public static void main(String[] args) {
        LList list = new LList();
        System.out.println(list.size);
        list.insertAtFirst(2);
        System.out.println(list.size);
        list.insertAtFirst(3);
        System.out.println(list.size);
        list.insertAtFirst(4);
        System.out.println(list.size);
        list.insertAtLast(6);
        System.out.println(list.size);
        list.insert(40,4);
        System.out.println(list.size);
        list.display();

    }
}

