import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 7;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número: [" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o número que você deseja procurar: ");
        int numeroProcurado = sc.nextInt();

        int numeroAchado = BuscaBinaria(vetor, numeroProcurado);
        if (numeroAchado < 0)
            System.out.println("Número não foi encontrado");
        else
            System.out.println("Número achado nada posição: " + numeroAchado);

        // Ordenação crescente...
        ordenacaoCrescente(vetor);
        System.out.println("\n------Números ordenados------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "-"); // Imprime os números ja ordenados
        }

        // Ordenação decrescente...
        ordenacaoDecrescente(vetor);
        System.out.println("\n------Números ordenados------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "-"); // Imprime os números ja ordenados
        }

        sc.close();
    }

    public static int BuscaBinaria(int[] vetor, int x) {

        int pos = -1, posInicial = 0, posFinal = vetor.length - 1;

        while (posInicial <= posFinal) {
            pos = (posFinal + posInicial) / 2;
            if (vetor[pos] == x)
                return pos;
            else if (vetor[pos] > x)
                posFinal = pos - 1;
            else
                posInicial = pos + 1;
        }
        return -1;
    }

    public static void ordenacaoCrescente(int[] vetor) {
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

    public static void ordenacaoDecrescente(int[] vetor) {
        int quantidade = vetor.length;
        int primeiro = 0;
        int segundo = 1;
        while (segundo < quantidade) {
            // na ordenação decrescente troca os valores quando o primeiro é menor que o
            // segundo
            if (vetor[primeiro] < vetor[segundo]) {
                int troca = vetor[primeiro];
                vetor[primeiro] = vetor[segundo];
                vetor[segundo] = troca;
                primeiro = 0;
                segundo = 1;
            } else {
                primeiro++;
                segundo++;
            }
        }
    }
}
