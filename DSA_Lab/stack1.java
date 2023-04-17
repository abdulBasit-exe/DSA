package DSA_Lab;

public class stack1<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public int search(T data) {
        int position = 1;
        Node<T> current = top;
        while (current != null) {
            if (current.data.equals(data)) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }


    public static void main(String[] args) {
        stack1 stack = new stack1();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty());;
    }
}