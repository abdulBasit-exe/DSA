package Stack;

public class StackLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }

    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head = newNode;
                return;
            }
            newNode.next= head;
            head= newNode;
        }

        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head= head.next;
            return top;
        }

        public static int peak(){
            if (isEmpty()){
                return -1;
            }
            return  head.data;
        }
    }

    public static void main(String[] args) {

        Stack.push(4);
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);
        Stack.push(8);
        Stack.push(9);

        while (!Stack.isEmpty()){
            System.out.print(Stack.peak()+" ");
            Stack.pop();
        }
    }

}
