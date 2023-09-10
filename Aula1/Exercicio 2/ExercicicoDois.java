import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicicoDois {
    public static void main(String[] args) {
        try{
            Locale.setDefault(new Locale("en", "US"));
            Scanner sc = new Scanner(System.in);

            // int vetor[] = new Int[10];
            ArrayList<Integer> pares = new ArrayList<Integer>();
            ArrayList<Integer> impares = new ArrayList<Integer>();

            System.out.println("###############################################################");

            for(int i = 0; i < 6; i++){
                System.out.printf("Digite o número para adicionalo no vetor: ");
                int valorDigitado = sc.nextInt();
                if(valorDigitado % 2 == 0){
                    pares.add(valorDigitado);
                } else{
                    impares.add(valorDigitado);
                }
            }

            System.out.println("###############################################################");

            System.out.println("Números pares digitados: " + pares);

            int soma = 0;
            for(int i = 0; i < pares.size(); i++){
                soma = soma + pares.get(i);
            }

            System.out.println("Soma dos números pares digitados: " + soma);
            
            System.out.println("Números impares digitados: " + impares);

            System.out.println("Quantidade de números impares digitados: " + impares.size());
            
            sc.close();
        }catch (Exception e){
           System.out.println("~ Error: "+ e);
        }
    }
} 