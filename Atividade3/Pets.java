package Atividade3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();
        criarGatosDeTeste(listaGatos);

        // for (int i = 0; i < 7; i++) {
        //     System.out.println("Digite os dados do gato #" + (i + 1));
        //     System.out.print("Código do gato (4 dígitos): ");
        //     int codigo = scanner.nextInt();
        //     scanner.nextLine(); // Consumir a quebra de linha

        //     System.out.print("Nome do gato: ");
        //     String nome = scanner.nextLine();

        //     System.out.print("Raça do gato: ");
        //     String raca = scanner.nextLine();

        //     System.out.print("Idade do gato: ");
        //     int idade = scanner.nextInt();
        //     scanner.nextLine(); // Consumir a quebra de linha

        //     System.out.print("Doença do gato: ");
        //     String doenca = scanner.nextLine();

        //     System.out.print("Valor do atendimento: R$");
        //     double valorAtendimento = scanner.nextDouble();
        //     scanner.nextLine(); // Consumir a quebra de linha

        //     Gato gato = new Gato(codigo, nome, raca, idade, doenca, valorAtendimento);
        //     listaGatos.add(gato);
        // }

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar gatos por nome");
            System.out.println("2. Consultar gatos por código do gato");
            System.out.println("3. Ordenar por ordem alfabética");
            System.out.println("4. Apagar dados de um gato");
            System.out.println("5. Localizar a ordem dos dados de um gato na listagem");
            System.out.println("6. Levantar quantos gatos possuem uma idade específica");
            System.out.println("7. Somar o valor total dos atendimentos");
            System.out.println("8. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do gato: ");
                    String nomeConsulta = scanner.nextLine();
                    consultarGatosPorNome(listaGatos, nomeConsulta);
                    break;
                case 2:
                    System.out.print("Digite o código do gato: ");
                    int codigoConsulta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    consultarGatosPorCodigo(listaGatos, codigoConsulta);
                    break;
                case 3:
                    ordenarPorOrdemAlfabetica(listaGatos);
                    listarGatos(listaGatos);
                    break;
                case 4:
                    System.out.print("Digite o código do gato a ser apagado: ");
                    int codigoApagar = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    apagarGato(listaGatos, codigoApagar);
                    break;
                case 5:
                    System.out.print("Digite o nome do gato a ser localizado: ");
                    String nomeLocalizar = scanner.nextLine();
                    localizarOrdemGato(listaGatos, nomeLocalizar);
                    break;
                case 6:
                    System.out.print("Digite a idade específica: ");
                    int idadeConsulta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    int quantidadeGatosIdade = contarGatosPorIdade(listaGatos, idadeConsulta);
                    System.out.println("Quantidade de gatos com " + idadeConsulta + " anos de idade: " + quantidadeGatosIdade);
                    break;
                case 7:
                    double valorTotalAtendimentos = somarValorTotalAtendimentos(listaGatos);
                    System.out.println("Valor total dos atendimentos: R$" + valorTotalAtendimentos);
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void criarGatosDeTeste(ArrayList<Gato> listaGatos) {
        // Criar 7 gatos de teste
        listaGatos.add(new Gato(1234, "Vincent", "Angorá", 5, "Insuficiência Renal Crônica", 367.89));
        listaGatos.add(new Gato(5678, "Samuel", "Siamês", 3, "Diabetes", 1790.00));
        listaGatos.add(new Gato(9012, "Clément", "Persa", 4, "Enteropatia", 5435.65));
        listaGatos.add(new Gato(3456, "Amélie", "SRD", 2, "Fiv Felv", 800.50));
        listaGatos.add(new Gato(7890, "François", "Angorá", 6, "Insuficiência Renal Crônica", 420.00));
        listaGatos.add(new Gato(2345, "Sophie", "Siamês", 7, "Diabetes", 1200.75));
        listaGatos.add(new Gato(6789, "Charlotte", "Persa", 5, "Enteropatia", 2200.25));
    }

    public static void consultarGatosPorNome(ArrayList<Gato> listaGatos, String nome) {
        for (Gato gato : listaGatos) {
            if (gato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(gato);
            }
        }
    }

    public static void consultarGatosPorCodigo(ArrayList<Gato> listaGatos, int codigo) {
        for (Gato gato : listaGatos) {
            if (gato.getCodigo() == codigo) {
                System.out.println(gato);
            }
        }
    }

    public static void ordenarPorOrdemAlfabetica(ArrayList<Gato> listaGatos) {
        Collections.sort(listaGatos);
    }

    public static void listarGatos(ArrayList<Gato> listaGatos) {
        for (int i = 0; i < listaGatos.size(); i++) {
            System.out.println("Gato #" + (i + 1) + ": " + listaGatos.get(i));
        }
    }

    public static void apagarGato(ArrayList<Gato> listaGatos, int codigo) {
        for (int i = 0; i < listaGatos.size(); i++) {
            if (listaGatos.get(i).getCodigo() == codigo) {
                listaGatos.remove(i);
                System.out.println("Gato removido com sucesso.");
                return;
            }
        }
        System.out.println("Gato não encontrado.");
    }

    public static void localizarOrdemGato(ArrayList<Gato> listaGatos, String nome) {
        for (int i = 0; i < listaGatos.size(); i++) {
            if (listaGatos.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println(nome + " é o " + (i + 1) + "º gato na listagem.");
                return;
            }
        }
        System.out.println("Gato não encontrado.");
    }

    public static int contarGatosPorIdade(ArrayList<Gato> listaGatos, int idade) {
        int quantidade = 0;
        for (Gato gato : listaGatos) {
            if (gato.getIdade() == idade) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static double somarValorTotalAtendimentos(ArrayList<Gato> listaGatos) {
        double total = 0;
        for (Gato gato : listaGatos) {
            total += gato.getValorAtendimento();
        }
        return total;
    }
}

class Gato implements Comparable<Gato> {
    private int codigo;
    private String nome;
    private String raca;
    private int idade;
    private String doenca;
    private double valorAtendimento;

    public Gato(int codigo, String nome, String raca, int idade, String doenca, double valorAtendimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.doenca = doenca;
        this.valorAtendimento = valorAtendimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getDoenca() {
        return doenca;
    }

    public double getValorAtendimento() {
        return valorAtendimento;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + " anos, Doença: " + doenca + ", Valor do Atendimento: R$" + valorAtendimento;
    }

    @Override
    public int compareTo(Gato outroGato) {
        return this.getNome().compareTo(outroGato.getNome());
    }
}