package AlgoritimosDeOrdenacao.SelectionSort;

import java.io.IOException;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você deseja gerar");
        int quantidade = sc.nextInt(); // Pega a quantidade de números dentro do vetor e que vai gerar
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade); // Gera números aleatorios dentro do vetor
            System.out.print(vetor[i] + "-"); // Imprime os números gerados
        }
        long tempoInicial = System.currentTimeMillis();

        selectionSort(vetor); // Ordena os números via SelectionSort
   
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("\n===============================================================================================================");
        System.out.println("\nNúmeros ordenados:");
        for (int i = 0; i < vetor.length; i++) { 
            System.out.print(vetor[i] + "-"); // Imprime os números ja ordenados
        }

        System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
        sc.close();
    }

    public static void selectionSort(int[] vetor) {
        int menor, aux;

        for (int j = 0; j < vetor.length; j++) {
            menor = j;
            for (int i = j + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[menor]) {
                    menor = i;
                }
            }
            if (j != menor) {
                aux = vetor[j];
                vetor[j] = vetor[menor];
                vetor[menor] = aux;
            }
        }
    }
}