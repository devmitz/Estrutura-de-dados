import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        try{
            Locale.setDefault(new Locale("en", "US"));
            Scanner sc = new Scanner(System.in);

            double vetorA[] = new double[10];
            double vetorB[] = new double[10];
            double vetorC[] = new double[10];

            System.out.println("###############################################################");

            for(int i = 0; i < 10 ; i++){
                System.out.printf("Digite o número do Vetor A na posição [" + i + "]: ");
                vetorA[i] = sc.nextInt();
            }

            System.out.println("###############################################################");

            for(int i = 0; i < 10 ; i++){
                System.out.printf("Digite o número do Vetor B na posição [" + i + "]: ");
                vetorB[i] = sc.nextInt();
            }

            for(int i = 0; i < 10; i++){
                vetorC[i] = vetorA[i] - vetorB[i];
                System.out.printf("A subtração do Vetor C na posição %d C = %.2f - %.2f = %.2f\n", i, vetorA[i], vetorB[i], vetorC[i]);
            }
            sc.close();
        }catch (Exception e){
           System.out.println("Error: "+ e);
        }
    }
}