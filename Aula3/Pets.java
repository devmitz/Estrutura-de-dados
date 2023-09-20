package Aula3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Pets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> gatos = new ArrayList<String>();


        // System.out.print("Números de gatos atendidos: ");
        // int gatosAtendidos = sc.nextInt();


        // for(int i = 0; i < gatosAtendidos; i++){
        //     System.out.printf("Código do gato [%d]: ", i);
        //     int cod = sc.nextInt();
        //     System.out.printf("Nome do gato [%d]: ", i);
        //     String nomeGato = sc.nextLine();
        //     System.out.printf("Raca do gato [%d]: ", i);
        //     String raca = sc.nextLine();
        //     System.out.printf("Idade do gato [%d]: ", i);
        //     int idade = sc.nextInt();
        //     System.out.printf("Doenca do gato [%d]: ", i);
        //     String doenca = sc.nextLine();
        //     System.out.printf("Valor do atendimento [%d]: ", i);
        //     double preco = sc.nextDouble();
        //     gatos.add(new Gato(cod, nomeGato, raca, idade, doenca, preco));
        // }
        // Gato gato = new Gato();
        // gato.codigo = 0253;
        // gato.nome = "Vincent";
        // gato.raca = "Siames";
        // gato.idade = 10;
        // gato.doenca = "insufieciência renal";
        // gato.preco = 1233.21;

        // gatos.add(new Gato(0253, "Vicent", "Siames", 10, "insuficiencia renal", 213.32));
        gatos.add("Código: 0253; nome: Vincent; raca: Siamês; idade: 10; doenca: insuficiência renal crônica; preco: R$367,89");
        gatos.add("Código: 7832; nome: Samuel; raca: Persa; idade: 12; doenca: diabetes; preco: R$1790,00");
        gatos.add("Código: 1235; nome: Clément; raca: Angorá; idade: 7; doenca: enteropatia; preco: R$5435,65");
        gatos.add("Código: 0001; nome: joão; raca: Siamês; idade: 4; doenca: fiv; preco: R$1000,89");
        gatos.add("Código: 1327; nome: roberto; raca: persa; idade: 13; doenca: felv; preco: R$783,35");
        gatos.add("Código: 0432; nome: gulag; raca: Siamês; idade: 8; doenca: diabetes tipo 2; preco: R$314,12");
        gatos.add("Código: 0312; nome: alfredo; raca: Angorá; idade: 2; doenca: gripe; preco: R$52,12");

        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = gatos.size();
        for (int i = 0; i < n; i++) {
            System.out.printf("Posição %d- %s\n", i, gatos.get(i));
        }

        System.out.println();
        System.out.println();

        System.out.print("Digite o codigo a ser procurado: ");
        String codProc = sc.nextLine();
        Pattern pattern = Pattern.compile(codProc, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(gatos.get(1));
        


        sc.close();
    }

    // public static class Gato {
    //     private String nome;
    //     private int codigo;
    //     private int idade;
    //     private double preco;
    //     private String doenca;
    //     private String raca;       

    //     public Gato(int codigo, String nome, String raca, int idade, String doenca, double preco) {
    //         this.codigo = codigo;
    //         this.nome = nome;
    //         this.raca = raca;
    //         this.idade = idade;
    //         this.doenca = doenca;
    //         this.preco = preco;
    //     }

    //     public String getNome() {
    //         return nome;
    //     }

    //     public void setNome(String nome) {
    //         this.nome = nome;
    //     }

    //     public int getCodigo() {
    //         return codigo;
    //     }

    //     public void setCodigo(int codigo) {
    //         this.codigo = codigo;
    //     }

    //     public int getIdade() {
    //         return idade;
    //     }

    //     public void setIdade(int idade) {
    //         this.idade = idade;
    //     }

    //     public double getPreco() {
    //         return preco;
    //     }

    //     public void setPreco(double preco) {
    //         this.preco = preco;
    //     }

    //     public String getDoenca() {
    //         return doenca;
    //     }

    //     public void setDoenca(String doenca) {
    //         this.doenca = doenca;
    //     }

    //     public String getRaca() {
    //         return raca;
    //     }

    //     public void setRaca(String raca) {
    //         this.raca = raca;
    //     }
        
    // }
}
