package Stack;

public class StackArray {
    static class Stack{
        int[] a;
        int top;
        int capacity;

        public Stack(int capacity){
            this.capacity = capacity;
            top=-1;
            a= new int[capacity];
        }

        public void push(int data){
            if (top==capacity-1){
                System.out.println("invalid array size " + capacity);
            }
            top++;
            a[top] = data;
        }

        public int pop() {
            if (top==-1){
                System.out.println("invalid");
            }

            int res = a[top];
            top--;
            return res;
        }

        public int peek() {
            if (top==-1){
                System.out.println("empty stack");
            }
            int res = a[top];
            return res;
        }

        public boolean isEmpty(){
            return top ==-1;
        }

    }

    public static void main(String[] args) {
        Stack s= new Stack(0);


    }
}