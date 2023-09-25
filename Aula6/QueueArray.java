package Aula6;

import java.util.Arrays;

public class QueueArray {

    /* Member variable declaration */
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    /* Constructor */
    public QueueArray(int tam) {
        this.maxSize = tam;
        this.queueArray = new int[tam];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    /* Queue:Insere */
    public void Enqueue(int item) {
        /* Checks whether the queue is full or not */
        if (isQueueFull()) {
            System.out.println("Queue está cheia!");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        /* increment rear then insert element to queue */
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("Item add na fila (queue) : " + item);
    }

    /* Queue:Delete Operation */
    public int Dequeue() {
        /* Checks whether the queue is empty or not */
        if (isQueueEmpty()) {
            throw new RuntimeException("Queue está vazia");
        }
        /* retrieve queue element then increment */
        int temp = queueArray[front];
        for (int i = 0; i < currentSize; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        if (++front == maxSize) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    /* Queue:Peek Operation */
    public int front() {
        return queueArray[front];
    }

    /* Queue:isFull Operation */
    public boolean isQueueFull() {
        return (maxSize == currentSize);
    }

    /* Queue:isEmpty Operation */
    public boolean isQueueEmpty() {
        return (currentSize == 0);
    }

    @Override
    public String toString() {
        return "Fila: " + Arrays.toString(queueArray);
    }

    /* Driver Code */
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);
        queue.Enqueue(2);
        System.out.println(queue.front() + queue.toString());
        queue.Enqueue(3);
        System.out.println(queue.front() + queue.toString());

        System.out.println("Item deleted from queue: " + queue.Dequeue());
        System.out.println(queue.toString());
        System.out.println("Item deleted from queue: " + queue.Dequeue());
        System.out.println(queue.toString());
        queue.Enqueue(5);
        System.out.println("Item deleted from queue: " + queue.Dequeue());
        // queue.Dequeue();
    }
}
