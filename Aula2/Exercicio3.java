import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vetor1 = new String[5];
        String[] vetor2 = new String[5];

        System.out.println("Preencha o primeiro vetor com 5 nomes:");
        for (int i = 0; i < 5; i++) {
        System.out.print("Digite o nome " + (i + 1) + ": ");
        vetor1[i] = sc.nextLine();
        }

        // Para testes vetor 1 pronto

        // vetor1[0] = "Sarah";
        // vetor1[1] = "Michael";
        // vetor1[2] = "Emily";
        // vetor1[3] = "Daniel";
        // vetor1[4] = "Sophia";

        System.out.println("\nPreencha o segundo vetor com 5 nomes:");
        for (int i = 0; i < 5; i++) {
        System.out.print("Digite o nome " + (i + 1) + ": ");
        vetor2[i] = sc.nextLine();
        }

        sc.close();
        // Para testes vetor 2 pronto

        // vetor2[0] = "Benjamin";
        // vetor2[1] = "Olivia";
        // vetor2[2] = "William";
        // vetor2[3] = "Maria";
        // vetor2[4] = "Matthew";

        String[] vetor3 = new String[vetor1.length + vetor2.length];
        System.arraycopy(vetor1, 0, vetor3, 0, 5);
        System.arraycopy(vetor2, 0, vetor3, 5, 5);

        bubbleSort(vetor3);
        System.out.println("\nVetor combinado e ordenado em ordem crescente:");
        for (String nome : vetor3) {
            System.out.println(nome);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}