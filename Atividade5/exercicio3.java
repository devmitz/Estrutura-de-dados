package Atividade5;

import java.util.Stack;

public class exercicio3 {
    public static void main(String[] args) {
        // Criando as pilhas P1 e P2
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();

        // Preenchendo as pilhas com alguns elementos de exemplo
        P1.push(1);
        P1.push(2);
        P1.push(3);

        P2.push(1);
        P2.push(2);
        P2.push(3);

        System.out.println("Pilha 1: " + P1);
        System.out.println("Pilha 2: " + P2);

        // Testando se P1 e P2 são iguais
        if (saoIguais(P1, P2)) {
            System.out.println("P1 e P2 são iguais.");
        } else {
            System.out.println("P1 e P2 não são iguais.");
        }
    }

    public static boolean saoIguais(Stack<Integer> P1, Stack<Integer> P2) {
        if (P1.size() != P2.size()) {
            return false; // Se tamanhos são diferentes, as pilhas não podem ser iguais
        }

        // Verifica se os elementos das pilhas são iguais na mesma ordem
        for (int i = 0; i < P1.size(); i++) {
            if (!P1.get(i).equals(P2.get(i))) {
                return false;
            }
        }

        return true;
    }
}