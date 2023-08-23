public class Exercicio03 {
    public static void main(String args[]){
        int[][] matriz = new int[4][4];

        System.out.println("\n\nMatriz depois de 5 anos tentando fazer: \n\n");

        for(int i = 0; i < 4; i++){
            System.out.printf("[");
            for(int j = 0; j < 4; j++){
                matriz[i][j] = (i+1) * (1+j);
                System.out.printf("\t " +  matriz[i][j] + " \t");
            }
            System.out.printf(" ]");
            System.out.println("");
        }
    }
}
