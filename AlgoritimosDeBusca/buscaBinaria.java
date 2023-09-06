package AlgoritimosDeBusca;
public class buscaBinaria {
    public static void main(String args[]){
        int quantidade = 10;
        int numeroProcurado = 5;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
            System.out.print(vetor[i] + "-"); 
        }

        System.out.println("\n\n\nProcurando o número: " + numeroProcurado);

        long tempoInicial = System.currentTimeMillis();
        int numeroAchado = BuscaBinaria(vetor, numeroProcurado);
        long tempoFinal = System.currentTimeMillis();

        if (numeroAchado < 0 ) {
            System.out.println("Número não foi achado.");
        }else{
            System.out.println("Numero achado na posição:" + numeroAchado);
        }
        System.out.println("\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
    }

    public static int BuscaBinaria(int[] vetor, int x){

        int pos = -1, posInicial = 0, posFinal = vetor.length - 1;

        while(posInicial <= posFinal) {
            pos = (posFinal + posInicial) / 2;
            if(vetor[pos] == x) return pos;
            else if(vetor[pos] > x) posFinal = pos - 1;
            else posInicial = pos + 1;
        }

        return -1;
    }
}
