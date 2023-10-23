package Aula9;

public class Aula9 {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(30);
        arvore.adicionar(20);
        arvore.adicionar(7);
        arvore.adicionar(3);

        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println("Pós ordem: ");
        arvore.posOrdem(arvore.getRaiz());
    }
}