package Aula7;

public class PilhaDinamica {
    public static void main(String[] args) {
        /*

        // Instancia da pilha
        Pilha pilha = new Pilha();
        // Adicionando elementos na pilha
        pilha.push("São Judas");
        pilha.push("São Paulo");

        System.out.println("Pilha: " + pilha.getTopo().toString());
        System.out.println();
        System.out.println("Retirando um elemento da pilha");
        System.out.println("Elemento retirado: " + pilha.pop());
        System.out.println("Pilha: " + pilha.getTopo().toString());

         */

        Pilha<Filme> pilha = new Pilha<>();
        Filme Interstellar = new Filme("Interstellar", "Masterpiece");
        Filme Batman = new Filme("Batman", "Ação");

        pilha.push(Interstellar);
        pilha.push(Batman);

        System.out.println("Filme 1:");
        System.out.println("-------------------------------------");
        System.out.println("|\t" + Interstellar.getNome() + "\t|\t" + Interstellar.getCategoria() + "\t|");
        System.out.println("-------------------------------------");

        System.out.println("Filme 2:");
        System.out.println("-------------------------");
        System.out.println("|\t" + Batman.getNome() + "\t|\t" + Batman.getCategoria() + "\t|");
        System.out.println("-------------------------");

        System.out.println();
        System.out.println(pilha.getTopo().toString());
    }
}
