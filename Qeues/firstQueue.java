package Qeues;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data= data;
    }
}

class Queue{
    Node front, rear;
    void enque(int data){
        Node newNode = new Node(data);
        if (front==null){
            front=rear= newNode;
            return;
        }
        rear.next = newNode;
        rear= newNode;
    }

    int deque() throws Exception {
        if (front==null){
            throw new Exception("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        return result;
    }

    void display(){
        Node node = front;
        System.out.println("Queue is: ");
        while(node!=null){
            System.out.print(node.data+" ");
            node= node.next;
        }
        System.out.println();
    }
}
public class firstQueue {
    public static void main(String[] args) throws Exception {
        Queue queue1 = new Queue();
        queue1.enque(1);
        queue1.enque(2);
        queue1.enque(3);
        queue1.display();
        queue1.deque();
        queue1.deque();

        queue1.display();
    }

}
