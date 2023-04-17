package LinkedLists;

class LLists{
    public Node head;
    public Node tail;
    public int size;

    public void display(){
        Node temp=head;
        if (head==null){
            System.out.println("Empty List");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("NULL");

    }

    public Node addFirst(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        head= newNode;
        size++;
        return newNode;
    }

    public Node addLast(int data){
        Node newNode = new Node(data);
        Node temp=head;
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next=newNode;
        newNode.next= null;
        size++;
        return newNode;
    }

    public Node addAtPos(int data,int index){
        if (index==0){
            return addFirst(data);
        }
        if (index==size) return addLast(data);



        Node temp = head;
        for (int i=1;i<index;i++){
            temp= temp.next;
        }
        Node newNode = new Node(data,temp.next);
        temp.next=newNode;
        size++;
        return newNode;
    }
    private static class Node{
        public int data;
        public Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data= data;
            this.next= next;
        }
    }
}
public class LLPractice {
    public static void main(String[] args) {
        LLists list = new LLists();
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addAtPos(0,1);
        list.display();
    }
}
