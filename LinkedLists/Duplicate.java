package LinkedLists;

public class Duplicate {
    public static void main(String[] args) {
    Node head = new Node(4);
    Node p = head;
    p = p.next;
    p= new Node(5);
    p=p.next;
    p = new Node(4);

    while (p!=null){
        System.out.println(p.data+" ");
    }


    }

    static class Node{
        Node head;
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }

        public void removeDuplicate(){
            Node start=head;
            while (start!=null && start.next!=null){
                if (start.data==start.next.data){
                    start.next= start.next.next;
                }
                start = start.next;
            }
        }
    }
}
