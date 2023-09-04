public class buscaLinear {
    public static void main(String args[]) {
        int quantidade = 10;
        int numeroProcurado = 5;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade); // Gera números aleatorios dentro do vetor
            System.out.print(vetor[i] + "-"); // Imprime os números gerados
        }

        System.out.println("\n\n\nProcurando o número: " + numeroProcurado);

        long tempoInicial = System.currentTimeMillis();
        int numeroAchado = BuscaLinear(vetor, numeroProcurado);
        long tempoFinal = System.currentTimeMillis();

        if (numeroAchado < 0 ) {
            System.out.println("Número não foi achado.");
        }else{
            System.out.println("Numero achado na posição:" + numeroAchado);
        }
        System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
    }
    public static int BuscaLinear(int[] vetor, int numeroProcurado){
        int n = vetor.length;

        for (int i = 0; i < n ; i++){
            if (vetor[i] == numeroProcurado){
                return i;
            }
        }
        return -1;
    }
}
