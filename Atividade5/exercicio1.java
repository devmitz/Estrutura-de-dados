package Atividade5;

import java.util.Stack;

public class exercicio1 {
    public static void main(String[] args) {
        // Criando uma pilha
        Stack<Integer> pilha = new Stack<>();

        // Preenchendo a pilha com alguns elementos de exemplo
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Pilha original: " + pilha);

        inverterPilha(pilha);

        System.out.println("Pilha invertida: " + pilha);
    }

    public static void inverterPilha(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            return; // Não faz nada se a pilha estiver vazia
        }

        int elemento = pilha.pop();
        inverterPilha(pilha);

        insereNoFundo(pilha, elemento);
    }

    public static void insereNoFundo(Stack<Integer> pilha, int elemento) {
        if (pilha.isEmpty()) {
            pilha.push(elemento);
            return;
        }

        int temp = pilha.pop();
        insereNoFundo(pilha, elemento);
        pilha.push(temp);
    }
}