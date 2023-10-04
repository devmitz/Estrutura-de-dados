package Atividade5;

import java.util.Stack;

public class exercicio2 {
    public static void main(String[] args) {
        // Criando as pilhas P1 e P2
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();

        // Preenchendo as pilhas com alguns elementos de exemplo
        P1.push(1);
        P1.push(2);
        P1.push(3);

        P2.push(4);
        P2.push(5);

        System.out.println("Pilha 1: " + P1);
        System.out.println("Pilha 2: " + P2);

        // Testando se P1 tem mais elementos que P2
        if (P1.size() > P2.size()) {
            System.out.println("P1 tem mais elementos do que P2.");
        } else {
            System.out.println("P1 não tem mais elementos do que P2.");
        }
    }
}