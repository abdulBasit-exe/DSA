package DSA_Lab;
import java.util.Arrays;
// lab09_task1
public class Stack<T> {
    private int top;
    private T[] stack;

    public Stack(int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack1= new Stack(3);
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1.size());
        System.out.println(stack1.isEmpty());

    }
}