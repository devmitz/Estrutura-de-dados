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
        int oldTop = Integer.parseInt(stackArray[top].toString());
        stackArray[top] = null;
        top--;
        return oldTop;
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
        System.out.println("pop(): " + stack.pop());
        stack.push(7);
        System.out.println("push(7): " + stack);
        System.out.println("peek() // top: " + stack.peek());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("isEmpty(): " + stack.isEmpty());
        stack.push(9);
        System.out.println("push(9): " + stack);
        stack.push(7);
        System.out.println("push(7): " + stack);
        stack.push(5);
        System.out.println("push(5): " + stack);
        stack.push(3);
        System.out.println("push(3): " + stack);
        System.out.println("pop(): " + stack.pop());
        stack.push(8);
        System.out.println("push(8): " + stack);
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
    }
}
