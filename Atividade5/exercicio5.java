package Atividade5;

import java.util.Stack;

public class exercicio5 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // Preenchendo a pilha com alguns números de exemplo
        pilha.push(5);
        pilha.push(3);
        pilha.push(7);
        pilha.push(1);
        pilha.push(9);

        System.out.println("Pilha original: " + pilha);

        ordenarCrescente(pilha);
        System.out.println("Pilha ordenada em ordem crescente: " + pilha);

        ordenarDecrescente(pilha);
        System.out.println("Pilha ordenada em ordem decrescente: " + pilha);
    }

    public static void ordenarDecrescente(Stack<Integer> pilha) {
        Stack<Integer> aux = new Stack<>();

        while (!pilha.isEmpty()) {
            int temp = pilha.pop();
            while (!aux.isEmpty() && aux.peek() > temp) {
                pilha.push(aux.pop());
            }
            aux.push(temp);
        }

        while (!aux.isEmpty()) {
            pilha.push(aux.pop());
        }
    }

    public static void ordenarCrescente(Stack<Integer> pilha) {
        Stack<Integer> aux = new Stack<>();

        while (!pilha.isEmpty()) {
            int temp = pilha.pop();
            while (!aux.isEmpty() && aux.peek() < temp) {
                pilha.push(aux.pop());
            }
            aux.push(temp);
        }

        while (!aux.isEmpty()) {
            pilha.push(aux.pop());
        }
    }
}
