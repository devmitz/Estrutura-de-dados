package ProvaA1.ex02;

import java.util.Arrays;

public class ArrayStackProva {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public ArrayStackProva(int tam) {
        maxSize = tam;
        stackArray = new Object[maxSize];
        top = -1;
    }
    public void push(Object value) {
        if (isFull()) {
            return;
        }
        top++;
        stackArray[top] = value;
    }
    public Object pop() {
        if (isEmpty()) {
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
    public int size() {
        return stackArray.length;
    }
    @Override
    public String toString() {
        return "\tConteudo da Pilha: " + Arrays.toString(stackArray) + "\n";
    }
}
