package Atividade5;

import java.util.Scanner;
import java.util.Stack;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        // Pedir ao usuário para digitar 7 números e colocá-los na pilha P
        System.out.println("Digite 7 números para preencher a pilha P:");
        for (int i = 0; i < 7; i++) {
            int numero = sc.nextInt();
            pilha.push(numero);
        }

        // Pedir ao usuário para digitar o número x
        System.out.print("Digite um número x para procurar na pilha: ");
        int x = sc.nextInt();

        // Verificar se o número x está na pilha e imprimir a resposta
        boolean encontrado = buscarNumeroNaPilha(pilha, x);

        if (encontrado) {
            System.out.println("O número " + x + " foi encontrado na pilha.");
        } else {
            System.out.println("O número " + x + " não foi encontrado na pilha.");
        }

        sc.close();
    }

    public static boolean buscarNumeroNaPilha(Stack<Integer> pilha, int x) {
        return pilha.contains(x);
    }
}
