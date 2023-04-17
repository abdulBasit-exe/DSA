package LinkedLists;

class LL {
    public Node head;
    public Node tail;
    public int size;

    LL(){
        size=0;
    }

    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size++;

    }

    public void insert(int data, int index){
        if(index==0){
            insertAtFirst(data);
            return;
        }

        if (index==size){
            insertAtLast(data);
            return;
        }
        Node temp = head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next= node;
        size++;
    }

    public void insertAtLast(int data){
        if (tail==null){
            insertAtFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node=tail;
        size++;
    }

    public void display(){

        Node temp;
        while (head!=null){  /* Or a for loop for(int i=1;i<=size;i++) */
            temp=head;
            System.out.print(temp.data+" ");
            head=head.next;
        }
    }

    public Node get(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public Node find(Node node){
        int data= head.data;
        while (head!=null){
            if (node.data==data){
                return node;
            }
            node=node.next;
        }
        return null;

    }



   private static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            next= null;
        }

        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

}
public class LinkedListPractice {
    public static void main(String[] args) {
     LL linkedList = new LL();
     linkedList.insertAtFirst(10);
     linkedList.insertAtFirst(20);
     linkedList.insertAtFirst(21);
     linkedList.insertAtFirst(30);
     linkedList.insertAtLast(100);
     linkedList.insert(90,4);
     linkedList.display();


    }

}
