package Atividade9.Exercicio123;

public class Exercicio {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push("São Paulo");
        pilha.push("Rio de Janeiro");
        pilha.push("Acre");
        pilha.push("Sri Lanka");

        System.out.println("Pilha get top: " + pilha.getTopo().toString());
        System.out.println("Pilha pop: " + pilha.pop());
        System.out.println("Pilha: " + pilha.getTopo().toString());

    }
}
