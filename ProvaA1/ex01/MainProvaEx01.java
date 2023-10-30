package ProvaA1.ex01;

import java.util.ArrayList;
import java.util.Scanner;
public class MainProvaEx01 {
    public static void main(String[] args) {
        ArrayList<PessoaProva> agenda = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada: ");
        int n = 3;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] partes = input.split(" ");
            if (partes.length != 3) {
                System.out.println("Formato inválido. Use: Nome DDD Telefone");
                i--; // Decrementar i para permitir a correção do usuário.
                continue;
            }
            String nome = partes[0];
            int ddd;
            try {
                ddd = Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: DDD deve ser um número inteiro.");
                i--; // Decrementar i para permitir a correção do usuário.
                continue;
            }
            int numero;
            try {
                numero = Integer.parseInt(partes[2]);
            } catch (NumberFormatException e) {
                System.out.println("Erro: o número deve ser um número inteiro.");
                i--; // Decrementar i para permitir a correção do usuário.
                continue;
            }
            agenda.add(new PessoaProva(nome, ddd, numero));
        }
        System.out.println("Saida:");
        buscarDDD(agenda, 11);
        sc.close();
    }
    public static void buscarDDD(ArrayList<PessoaProva> agenda, int ddd){
        for (PessoaProva pessoa : agenda){
            if (pessoa.getDdd() == 11) {
                System.out.println(pessoa);
            }
        }
    }
}

