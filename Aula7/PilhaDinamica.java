package Aula7;
import Aula7.No;
import Aula7.Pilha;

public class PilhaDinamica {
    public static void main(String[] args) {
        // Instancia da pilha
        Pilha pilha = new Pilha();
        // Adicionando elementos na pilha
        pilha.push("São Judas");
        pilha.push("São Paulo");

        System.out.println("Pilha: " + pilha.toString());
        System.out.println();
        System.out.println("Retirando um elemento da pilha");
        System.out.println("Elemento retirado: " + pilha.pop());
        System.out.println("Pilha: " + pilha.toString());

    }
}
