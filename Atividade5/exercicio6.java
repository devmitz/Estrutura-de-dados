package Atividade5;

import java.util.Stack;

public class exercicio6 {
    public static void main(String[] args) {
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();

        // Preenchendo as duas pilhas com 4 elementos cada
        pilha1.push(4);
        pilha1.push(2);
        pilha1.push(8);
        pilha1.push(3);

        pilha2.push(7);
        pilha2.push(1);
        pilha2.push(2);
        pilha2.push(9);

        while (!pilha1.isEmpty()) {
            pilha3.push(pilha1.pop());
        }

        while (!pilha2.isEmpty()) {
            pilha3.push(pilha2.pop());
        }

        // Ordenando a pilha3 em ordem decrescente
        ordenarDecrescente(pilha3);

        // Exibindo a terceira pilha com os 8 elementos empilhados em ordem decrescente
        System.out.println("Terceira pilha com 8 elementos em ordem decrescente: " + pilha3);
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
}