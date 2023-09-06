public class Exercicio2 {
    public static void main(String args[]){
        int colunas = 4;
        int linhas = 3;
        int [][] matriz = new int[linhas][colunas];

        //Matriz randomica
        for(int l = 0; l < linhas; l++){
            for( int c = 0 ; c < colunas; c++){
                matriz[l][c] = (int)(Math.random() * 10);
            }
        }
        //Lendo a matriz randomica
        System.out.println("Matriz randomica");
        printMatriz(matriz);

        bubbleSortMatriz(matriz);
        System.out.println("Matriz ordenada");
        printMatriz(matriz);
        
    }

    public static void bubbleSortMatriz(int[][] matriz) {
        int linha = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < colunas - 1; j++) {
                for (int k = 0; k < colunas - j - 1; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public static void printMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            System.out.print("[\t");
            for (int numero : linha) {
                System.out.print(numero + "\t");
            }
              System.out.print("]");
            System.out.println();
        }
    }
}
