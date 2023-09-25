package Aula6;
import java.util.Arrays;

public class ArrayStack {

    private int maxSize;
    private Object[] stackArray;
    private int top;

    public ArrayStack(int tam) {
        maxSize = tam;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object value) {
        if (isFull()) {
            System.out.println("Stack cheia");
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack vazia");
            return -1;
        }
        int oldTop = top;
        top--;
        stackArray[oldTop] = null;
        return stackArray[oldTop];
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack vazia");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public String toString() {
        return "Pilha: " + Arrays.toString(stackArray);
    }

    public static void main(String args[]){
        ArrayStack stack = new ArrayStack(4);

        stack.push(3);
        System.out.println("push(3): " + stack);
        stack.push(5);
        System.out.println("push(5): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
        stack.push(7);
        System.out.println("push(7): " + stack);
        // stack.top();
        // System.out.println("top(): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
        stack.isEmpty();
        System.out.println("isEmpty(): " + stack);
        stack.push(9);
        System.out.println("push(9): " + stack);
        stack.push(7);
        System.out.println("push(7): " + stack);
        stack.push(5);
        System.out.println("push(5): " + stack);
        stack.push(3);
        System.out.println("push(3): " + stack);
        // stack.size();
        // System.out.println("size(): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
        stack.push(8);
        System.out.println("push(8): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
        stack.pop();
        System.out.println("pop(): " + stack);
    }
}
